create user jdbctest identified by jdbctest
grant resource, connect to jdbctest

alter user jdbctest default tablespace users
alter user jdbctest temporary tablespace temp