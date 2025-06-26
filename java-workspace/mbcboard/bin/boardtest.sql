----------------------------------------member테이블을 부모로 생성해보자----------------------------------------
create table member(
	mno number(5) not null,
	bwriter nvarchar2(10) not null,
	id nvarchar2(10) primary key, -- board 테이블의 bwriter와 fk 관계로 설정할예정
	pw nvarchar2(10) not null,
	regidate date default sysdate not null
);

insert into member (mno, bwriter, id, pw) values (board_seq.nextval, '박희진', 'phj', '0702');
insert into member (mno, bwriter, id, pw) values (board_seq.nextval, '최수빈', 'csb', '1205');
insert into member (mno, bwriter, id, pw) values (board_seq.nextval, '최연준', 'cyj', '0913');
insert into member (mno, bwriter, id, pw) values (board_seq.nextval, '최범규', 'cbg', '0313');
insert into member (mno, bwriter, id, pw) values (board_seq.nextval, '강태현', 'kth', '0205');
insert into member (mno, bwriter, id, pw) values (board_seq.nextval, '휴닝카이', 'hn', '0814');

select * from member;
----------------------------------ㅡmember의 자식이면서 board의 외래키 생성 필수----------------------------------
create table board(
	bno number(5) primary key,
	btitle nvarchar2(30) not null,
	bcontent nvarchar2(1000) not null,
	bwriter nvarchar2(10) not null,
	bdate date not null
);

create sequence board_seq increment by 1 start with 1 nocycle nocache;

alter table board add constraint board_member_fk foreign key (bwriter) references member (id);

delete from board;

insert into board (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '보고싶다', '투바투 보고싶음', 'phj', sysdate);
insert into board (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '방가방가', '투바투 최수빈임', 'csb', sysdate);
insert into board (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '안녕하세요', '투바투 최연준임', 'cyj', sysdate);
insert into board (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '하이루', '투바투 최범규임', 'cbg', sysdate);
insert into board (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '잘부탁해요', '투바투 강태현임', 'kth', sysdate);
insert into board (bno, btitle, bcontent, bwriter, bdate)
values (board_seq.nextval, '반가워용', '투바투 휴닝카이임', 'hn', sysdate);


select * from board;

------------------------------------------------------------------------------------------------------

-- 조인 : 2개의 테이블을 연결하여 값을 가져온다.

select b.*, m.bwriter from member m inner join board b on m.id = b.bwriter where id = 'phj';
