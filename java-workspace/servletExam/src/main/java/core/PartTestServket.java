package core;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class PartTestServket
 */
@WebServlet("/part")
public class PartTestServket extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		 Collection<Part> parts = request.getParts();
	        System.out.println("========== 요청 받음 ==========");
	        for(Part part : parts) {        	
	            System.out.print("name : ");
	            System.out.println(part.getName());            
	            System.out.println("[ 헤더 정보 ] ");
	            for(String headerName : part.getHeaderNames()) {
	                System.out.print(headerName + " : ");
	                System.out.println(part.getHeader(headerName));
	            }
	            System.out.print("size : ");
	            System.out.println(part.getSize());
	            System.out.println("------------------------------------");
	        }
	}
}
