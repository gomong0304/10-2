-- 일반 사용자 계정용 sql 쿼리 메모장
-- emp table 생성
create table emp(
	num number(5) primary key,
	name varchar2(16) not null,
	dept varchar2(16),
	score number(7,2)
);

select * from emp;

create sequence emp_seq increment by 1 start with 1 nocache nocycle; -- 자동 번호 생성

-- 더미네이터 6개 입력
insert into emp (num, name, dept, score) values (emp_seq.nextval, '이름1', '부서1', 75.3);
insert into emp (num, name, dept, score) values (emp_seq.nextval, '이름2', '부서2', 85.3);
insert into emp (num, name, dept, score) values (emp_seq.nextval, '이름3', '부서3', 95.3);
insert into emp (num, name, dept, score) values (emp_seq.nextval, '이름4', '부서4', 65.3);
insert into emp (num, name, dept, score) values (emp_seq.nextval, '이름5', '부서5', 55.3);
insert into emp (num, name, dept, score) values (emp_seq.nextval, '이름6', '부서6', 75.5);

-- 결과 보기
select * from emp;
