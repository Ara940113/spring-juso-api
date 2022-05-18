# 스프링부트 JPA 로그인 - 도로명 주소 API사용하기

### 1. 의존성
- devtools
- spring web (mvc)
- mustache
- lombok
- jpa
- mariadb
- security
- validation

### 2. DB설정
```sql
CREATE USER 'green'@'%' IDENTIFIED BY 'green1234';
CREATE DATABASE greendb;
GRANT ALL PRIVILEGES ON greendb.* TO 'green'@'%';
```

### 3. 도로명 주소 API 신청주소
```
https://www.juso.go.kr/addrlink/devAddrLinkRequestWrite.do?returnFn=write&cntcMenu=URL
```