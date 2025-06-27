<%@page import="java.util.Enumeration"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page import="dto.Book"%>
<%@page import="dao.BookRepository"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	request.setCharacterEncoding("UTF-8");
	
	String filename="";
	String realFolder=application.getRealPath("/resources/images");
	int maxSize=5*1024*1024;
	String encType="UTF-8";
	
	MultipartRequest multipartRequest=new MultipartRequest(request, realFolder, maxSize, encType, new DefaultFileRenamePolicy());
	String bookId=multipartRequest.getParameter("bookId");
	String name=multipartRequest.getParameter("name");
	String unitPrice=multipartRequest.getParameter("unitPrice");
	String author=multipartRequest.getParameter("author");
	String publisher=multipartRequest.getParameter("publisher");
	String releaseDate=multipartRequest.getParameter("releaseDate");
	String description=multipartRequest.getParameter("description");
	String category=multipartRequest.getParameter("category");
	String unitsInStock=multipartRequest.getParameter("unitsInStock");
	String condition=multipartRequest.getParameter("condition");
	
	Enumeration files=multipartRequest.getFileNames();
	String fname=(String) files.nextElement();
	String fileName=multipartRequest.getFilesystemName(fname);
	
	/* String bookId=request.getParameter("bookId");
	String name=request.getParameter("name");
	String unitPrice=request.getParameter("unitPrice");
	String author=request.getParameter("author");
	String publisher=request.getParameter("publisher");
	String releaseDate=request.getParameter("releaseDate");
	String description=request.getParameter("description");
	String category=request.getParameter("category");
	String unitsInStock=request.getParameter("unitsInStock");
	String condition=request.getParameter("condition"); */
	
	int price;
	
	if (unitPrice.isEmpty())
		price=0;
	else
		price=Integer.valueOf(unitPrice);
	
	long stock;
	
	if(unitsInStock.isEmpty())
		stock=0;
	else
		stock=Long.valueOf(unitsInStock);
	
	BookRepository dao=BookRepository.getInstance();
	
	Book newBook = new Book();
	newBook.setBookId(bookId);
	newBook.setName(name);
	newBook.setUnitPrice(price);
	newBook.setAuthor(author);
	newBook.setPublisher(publisher);
	newBook.setReleaseDate(releaseDate);
	newBook.setDescription(description);
	newBook.setCategory(category);
	newBook.setUnitsInStock(stock);
	newBook.setCondition(condition);
	newBook.setFilename(fileName);
	
	dao.addBook(newBook);
	
	response.sendRedirect("books.jsp");
%>
