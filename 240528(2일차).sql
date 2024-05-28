--함수(FUNCTION) : 매개변수로 전달받은 값을 가공하여 결과값을 반환하는 기능 제공
--오라클의 내장함수 : 단일함수와 그룹함수로 구분
--단일함수 : 매개변수로 하나의 값만 전달받아 처리 결과값을 반환하는 함수 - 문자함수, 숫자함수, 날짜함수, 변환함수, 일반함수
--그룹함수 : 매개변수로 여러개의 값들을 전달받아 처리 결과값을 반환하는 함수

--문자함수 : 매개변수로 문자값을 전달받아 처리 결과값을 반환하는 함수

--UPPER(문자값) : 문자값을 전달받아 대문자로 변환하여 반환하는 함수
--LOWER(문자값) : 문자값을 전달받아 소문자로 변환하여 반환하는 함수
SELECT ENAME,UPPER(ENAME),LOWER(ENAME) FROM EMP;

--EMP 테이블에서 사원이름이 ALLEN인 사원의 사원번호, 사원이름, 급여 검색
--문자값은 대소문자를 구분하여 비교 결과값 제공
SELECT EMPNO,ENAME,SAL FROM EMP WHERE ENAME='ALLEN';
SELECT EMPNO,ENAME,SAL FROM EMP WHERE ENAME='allen';
--대소문자 구분없이 문자값을 비교할 경우 UPPER 함수 또는 LOWER 함수 사용
SELECT EMPNO,ENAME,SAL FROM EMP WHERE UPPER(ENAME)=UPPER('allen');
SELECT EMPNO,ENAME,SAL FROM EMP WHERE LOWER(ENAME)=LOWER('allen');

--INITCAP(문자값) : 문자값을 전달받아 첫번째 문자만 대문자로 변환하고 나머지 문자는 소문자로 변환하여 반환하는 함수
SELECT ENAME,INITCAP(ENAME) FROM EMP;

--CONCAT(문자값, 문자값) : 두 개의 문자값을 전달받아 결합하여 반환하는 함수
--|| 기호는 문자값에 문자값, 날짜값, 숫자값을 결합하여 사용 가능
SELECT ENAME,JOB,CONCAT(ENAME,JOB),ENAME||JOB FROM EMP;

--SUBSTR(문자값, 시작위치, 갯수) : 문자값을 전달받아 시작위치(첨자 - INDEX)부터 갯수만큼의 문자들을 분리하여 반환하는 함수
SELECT EMPNO,ENAME,JOB,SUBSTR(JOB,6,3) FROM EMP WHERE EMPNO=7499;

--LENGTH(문자값) : 문자값을 전달받아 문자의 갯수를 반환하는 함수
SELECT EMPNO,ENAME,JOB,LENGTH(JOB) FROM EMP WHERE EMPNO=7499;

--INSTR(문자값, 검색문자값, 시작위치, 검색위치) : 문자값을 전달받아 검색문자값을 시작위치(첨자)부터 검색하여 검색위치(갯수)의
--시작첨자를 반환하는 함수 - 검색문자값이 없는 경우 0 반환
SELECT EMPNO,ENAME,JOB,INSTR(JOB,'A',1,2) FROM EMP WHERE EMPNO=7499;
SELECT EMPNO,ENAME,JOB,INSTR(JOB,'XYZ',1,1) FROM EMP WHERE EMPNO=7499;

--LPAD(문자값,자릿수,채울문자) : 문자값을 전달받아 출력 자릿수 크기만큼 공간을 확보한 후 오른쪽부터 채우고 왼쪽에 남는 자리는
--채울문자로 변환하여 반환하는 함수
--RPAD(문자값,자릿수,채울문자) : 문자값을 전달받아 출력 자릿수 크기만큼 공간을 확보한 후 왼쪽부터 채우고 오른쪽에 남는 자리는
--채울문자로 변환하여 반환하는 함수
SELECT EMPNO,ENAME,SAL,LPAD(SAL,8,'*'),RPAD(SAL,8,'*') FROM EMP;

--TRIM({LEADING|TRAILING} 제거문자 FROM 문자값) : 문자값을 전달받아 앞 또는 뒤에 존재는 제거문자들을 삭제하여 반환하는 함수
SELECT EMPNO,ENAME,JOB,TRIM(LEADING 'S' FROM JOB),TRIM(TRAILING 'N' FROM JOB) FROM EMP WHERE EMPNO=7499;

--REPLACE(문자값,검색문자값,치화문자값) : 문자값을 전달받아 검색문자값을 찾아 치환문자값으로 변환하여 반환하는 함수
SELECT EMPNO,ENAME,JOB,REPLACE(JOB,'MAN','PERSON') FROM EMP WHERE EMPNO=7499;

--숫자함수 : 매개변수로 숫자값을 전달받아 처리 결과값을 반환하는 함수

--ROUND(숫자값, 소숫점자릿수) : 숫자값을 전달받아 소수점자릿수만큼 검색되도록 반올림 처리하여 반환하는 함수
--DUAL 테이블 : SELECT 명령을 작성할 때 테이블의 저장된 행을 참조하지 않을 경우 사용하는 가상의 테이블
SELECT ROUND(45.582,2),ROUND(45.582,0),ROUND(45.582,-1) FROM DUAL;

--TRUNC(숫자값, 소숫점자릿수) : 숫자값을 전달받아 소수점자릿수만큼 검색되도록 절삭 처리하여 반환하는 함수
SELECT TRUNC(45.582,2),TRUNC(45.582,0),TRUNC(45.582,-1) FROM DUAL;

--CEIL(숫자값) : 전달받은 숫자값이 실수값인 경우 증가된 숫자값(정수값)을 반환하는 함수
SELECT CEIL(15.3),CEIL(-15.3) FROM DUAL;

--FLOOR(숫자값) : 전달받은 숫자값이 실수값인 경우 감소된 숫자값(정수값)을 반환하는 함수
SELECT FLOOR(15.3),FLOOR(-15.3) FROM DUAL;

--MOD(숫자값1, 숫자값2) : 숫자값1을 숫자값2로 나눈 나머지를 반환하는 함수
SELECT 20/8,MOD(20,8) FROM DUAL;

--POWER(숫자값1, 숫자값2) : 숫자값1을 숫자값2의 갯수만큼 곱한 결과를 반환하는 함수
SELECT 3*3*3*3*3,POWER(3,5) FROM DUAL;

--날짜함수 : 매개변수로 날짜값을 전달받아 처리 결과값을 반환하는 함수

--SYSDATE : 시스템의 현재 날짜와 시간을 제공하기 위한 키워드
--SELECT 명령으로 검색된 날짜값은 [RR/MM/DD] 패턴으로 검색되어 제공
SELECT SYSDATE FROM DUAL;

--ADD_MONTHS(날짜값, 숫자값) : 날짜값을 전달받아 숫자값만큼 개월수가 증가된 날짜값을 반환하는 함수
SELECT SYSDATE,ADD_MONTHS(SYSDATE,5) FROM DUAL;

--날짜값 + 연산자 또는 - 연산자를 사용하여 연산처리 가능

--날짜값 + 숫자값 = 날짜값  >> 일 증가
SELECT SYSDATE,SYSDATE+7 FROM DUAL;

--날짜값 + 숫자값/24 = 날짜값  >> 시간 증가
SELECT SYSDATE,SYSDATE+100/24 FROM DUAL;

--날짜값 - 숫자값 = 날짜값  >> 일 감소
SELECT SYSDATE,SYSDATE-7 FROM DUAL;

--날짜값 - 숫자값 / 24 = 날짜값  >> 시간 감소
SELECT SYSDATE,SYSDATE-100/24 FROM DUAL;

--날짜값 - 날짜값 = 숫자값 >> 일(실수값)
--EMP 테이블에 저장된 모든 사원의 사원번호,사원이름,입사일,근속일수(현재-입사일) 검색
SELECT EMPNO,ENAME,HIREDATE,SYSDATE-HIREDATE FROM EMP;
SELECT EMPNO,ENAME,HIREDATE,CEIL(SYSDATE-HIREDATE)||'일' 근속일수 FROM EMP;

--NEXT_DAY(날짜값, 요일) : 전달받은 날짜값을 기준으로 미래의 특정 요일에 대한 날짜값을 반환하는 함수
SELECT NEXT_DAY(SYSDATE, '토') FROM DUAL; 

--오라클 서버에 접속된 클라이언트 환경(세션 : SESSION)에 따라 사용 언어 및 날짜값에 대한 패턴과 화폐단위 등이 다르게 적용
--현재 사용중인 클라이언트 환경(세션)에 대한 사용 언어 및 날짜값에 대한 패턴과 화폐단위 등 변경 가능
ALTER SESSION SET NLS_LANGUAGE='AMERICAN';--사용언어 변경
SELECT NEXT_DAY(SYSDATE, 'SAT') FROM DUAL; 

ALTER SESSION SET NLS_LANGUAGE='KOREAN';--사용언어 변경
SELECT NEXT_DAY(SYSDATE, '토') FROM DUAL; 

--TRUNC(날짜값, 범위) : 날짜값을 전달받아 원하는 범위의 날짜값까지만 검색하여 나머지는 절삭하여 초기값으로 검색되도록 변환하여 반환하는 함수
SELECT SYSDATE,TRUNC(SYSDATE,'MONTH'),TRUNC(SYSDATE,'YEAR') FROM DUAL;

--변환함수 : 매개변수로 전달받은 값을 원하는 자료형의 값으로 변환하여 반환하는 함수

--TO_NUMBER(문자값) : 문자값을 전달받아 숫자값으로 변환하여 반환하는 함수
--매개변수로 전달받은 문자값에 숫자가 아닌 형태의 문자가 존재하는 경우 숫자값으로 변환할 수 없어 에러

--EMP 테이블에서 사원번호가 7499인 사원의 사원번호, 사원이름, 급여 검색
SELECT EMPNO,ENAME,SAL FROM EMP WHERE EMPNO=7499;
--비교컬럼의 자료형이 숫자형인 경우 비교값이 문자값이면 TO_NUMBER 함수를 사용하여 문자값을 숫자값으로 변환하여 비교 처리 - 강제 형변환
SELECT EMPNO,ENAME,SAL FROM EMP WHERE EMPNO=TO_NUMBER('7499');
--비교컬럼의 자료형이 숫자형인 경우 비교값이 문자값이면 자동으로 숫자값으로 변환되어 비교 처리 - 자동 형변환
SELECT EMPNO,ENAME,SAL FROM EMP WHERE EMPNO='7499';

--문자값을 산술 연산 처리할 경우 문자값이 자동으로 숫자값으로 변환되어 연산 처리 - 자동 형변환
SELECT 100+200 FROM DUAL;
SELECT '100'+'200' FROM DUAL;

--EMP 테이블에서 사원번호가 7839인 사원의 사원번호, 사원이름, 급여, 세후급여(급여*0.9) 검색
SELECT EMPNO,ENAME,SAL,SAL*0.9 FROM EMP WHERE EMPNO=7839;
SELECT EMPNO,ENAME,SAL,SAL*TO_NUMBER('0.9') FROM EMP WHERE EMPNO=7839;
SELECT EMPNO,ENAME,SAL,SAL*'0.9' FROM EMP WHERE EMPNO=7839;

--TO_DATE(문자값[, 날짜패턴]) : 날짜패턴에 맞는 문자값을 전달받아 날짜값으로 변환하여 반환하는 함수
--날짜패턴을 전달받지 않은 경우 기본적으로 [RR/MM/DD] 날짜패턴을 사용
--날짜패턴과 맞지 않는 문자값을 전달받을 경우 에러 발생

--EMP 테이블에서 입사일이 1982년 01월 23인 사원의 사원번호, 사원이름, 입사일 검색
--비교컬럼의 자료형이 날짜형인 경우 비교값이 문자값이면 TO_DATE 함수를 사용하여 문자값을 날짜값으로 변환하여 비교 처리 - 강제 형변환
SELECT EMPNO,ENAME,HIREDATE FROM EMP WHERE HIREDATE=TO_DATE('82/01/23');
--[RR/MM/DD] 날짜패턴 대신 [YYYY-MM-DD] 날짜패턴 사용
SELECT EMPNO,ENAME,HIREDATE FROM EMP WHERE HIREDATE=TO_DATE('1982-01-23');
--비교컬럼의 자료형이 날짜형인 경우 비교값이 문자값이면 자동으로 날짜값으로 변환되어 비교 처리 - 자동 형변환
SELECT EMPNO,ENAME,HIREDATE FROM EMP WHERE HIREDATE='82/01/23';
SELECT EMPNO,ENAME,HIREDATE FROM EMP WHERE HIREDATE='1982-01-23';

--기본적으로 제공받은 날짜패턴에 맞지 않는 문자값을 사용할 경우 에러 발생
SELECT EMPNO,ENAME,HIREDATE FROM EMP WHERE HIREDATE=TO_DATE('01-23-1982');
SELECT EMPNO,ENAME,HIREDATE FROM EMP WHERE HIREDATE='01-23-1982';
--문자값에 맞는 날짜패턴을 매개변수에 전달하여 날짜값을 반환받아 비교 처리 가능
SELECT EMPNO,ENAME,HIREDATE FROM EMP WHERE HIREDATE=TO_DATE('01-23-1982','MM-DD-YYYY');

--2000년 01월 01일에 태어난 사람이 오늘까지 살아온 일수 검색
--검색대상에 산술 연산자를 사용하면 문자값을 날짜값이 아닌 숫자값으로 자동 형변환하여 연산 처리 
SELECT SYSDATE-'2000-01-01' FROM DUAL;--숫자가 아닌 문자가 포함되어 있는 경우 에러 발생
--TO_DATE 함수를 사용하여 문자값을 날짜값으로 변환해야만 날짜 계산 가능
SELECT SYSDATE-TO_DATE('2000-01-01') FROM DUAL;
SELECT CEIL(SYSDATE-TO_DATE('2000-01-01'))||'일' "오늘까지 살아온 일수" FROM DUAL;

--TO_CHAR({숫자값|문자값}, 패턴문자값) : 매개변수로 전달받은 숫자값 또는 문자값을 원하는 패턴의 문자값으로 변환하여 반환하는 함수

--날짜패턴 : RR(년), YYYY(년), MM(월), DD(일), HH24(시-1~24), HH12(시-1~12), MI(분), SS(초)
SELECT SYSDATE,TO_CHAR(SYSDATE,'YYYY-MM-DD'),TO_CHAR(SYSDATE,'YYYY-MM-DD HH24:MI:SS') FROM DUAL;

--EMP 테이블에서 1981년에 입사한 사원의 사원번호,사원이름,입사일 검색 
--TO_CHAR 함수를 사용하여 날짜값을 원하는 패턴의 문자값으로 반환받아 비교 처리
SELECT EMPNO,ENAME,HIREDATE FROM EMP WHERE TO_CHAR(HIREDATE,'YYYY')='1981';

--숫자패턴 : 9(숫자 또는 공백), 0(숫자), L(화폐단위), $(달러)
SELECT 10000000000,TO_CHAR(10000000000,'999,999,999,990') FROM DUAL;
--패턴문자로 표현 불가능한 숫자값이 전달될 경우 [#] 기호로 변환되어 반환
SELECT 10000000000,TO_CHAR(10000000000,'9,999,999,990') FROM DUAL;--검색오류

--EMP 테이블에서 사원번호가 7844인 사원의 사원번호, 사원이름, 급여 검색
SELECT EMPNO,ENAME,SAL FROM EMP WHERE EMPNO=7844;
SELECT EMPNO,ENAME,TO_CHAR(SAL,'999,990') SAL FROM EMP WHERE EMPNO=7844;
SELECT EMPNO,ENAME,TO_CHAR(SAL,'L99,990') SAL FROM EMP WHERE EMPNO=7844;
SELECT EMPNO,ENAME,TO_CHAR(SAL,'$99,990.00') SAL FROM EMP WHERE EMPNO=7844;

--일반함수 : 매개변수로 전달받은 값이 특정 조건에 참(TRUE)인 경우 변경값으로 변환하여 반환하는 함수

--NVL(전달값, 변경값) : 전달값이 NULL인 경우 변경값으로 변환하여 반환하는 함수
--변경값은 전달값과 동일 자료형의 값으로만 변경 가능 - 변경값의 자료형이 전달값의 자료형과 다른 경우 에러 발생

--EMP 테이블에 저장된 모든 사원의 사원번호,사원이름,연봉(급여*12) 검색
SELECT EMPNO,ENAME,SAL*12 ANNUAL FROM EMP;

--EMP 테이블에 저장된 모든 사원의 사원번호,사원이름,연봉((급여+성과급)*12) 검색
--성과급(COMM 컬럼값)이 NULL인 경우 연산이 불가능하여 연산결과로 NULL 제공
SELECT EMPNO,ENAME,(SAL+COMM)*12 ANNUAL FROM EMP;--검색오류
--NVL 함수를 사용하여 성과급(COMM 컬럼값)이 NULL인 경우 [0]으로 반환받아 연산 처리
SELECT EMPNO,ENAME,(SAL+NVL(COMM,0))*12 ANNUAL FROM EMP;

--NVL2(전달값, 변경값1, 변경값2) : 전달값이 NULL이 아닌 경우 변경값1로 변환하여 반환하고 전달값이 NULL안 경우 변경값2으로 
--변환하여 반환하는 함수

--EMP 테이블에 저장된 모든 사원의 사원번호,사원이름,연봉((급여+성과급)*12) 검색
SELECT EMPNO,ENAME,(SAL+NVL2(COMM,COMM,0))*12 ANNUAL FROM EMP;
SELECT EMPNO,ENAME,NVL2(COMM,COMM+SAL,SAL)*12 ANNUAL FROM EMP;

--DECODE(전달값,비교값1,변경값1,비교값2,변경값2,...[,기본값]) : 전달값을 비교값과 차례대로 비교하여 전달값이 비교값과 같은 경우
--변경값으로 변환하여 반환하는 함수
--전달값이 모든 비교값과 같지 않은 경우 기본값으로 변환하여 반환하지만 기본값이 생략한 경우 NULL 반환

--EMP 테이블에 저장된 모든 사원의 사원번호, 사원이름, 업무, 급여, 업무별 실급여(사원의 업무를 구분하여 실제로 지불될 급여) 검색
--업무별 실급여 : ANALYST : 급여*1.1, CLERK : 급여*1.2, MANAGER : 급여*1.3, PRESIDENT : 급여*1.4, SALESMAN : 급여*1.5
SELECT EMPNO,ENAME,JOB,SAL,DECODE(JOB,'ANALYST',SAL*1.1,'CLERK',SAL*1.2,'MANAGER',SAL*1.3
    ,'PRESIDENT',SAL*1.4,'SALESMAN',SAL*1.5,SAL) "업무별 실급여" FROM EMP;

--EMP 테이블에 저장된 모든 사원의 사원번호, 사원이름, 업무, 급여를 검색하되 급여는 업무별로 구분하여 검색하고 해당업무가 아닌 경우 NULL 검색
SELECT EMPNO,ENAME,JOB,SAL FROM EMP;
SELECT EMPNO,ENAME,DECODE(JOB,'ANALYST',SAL) ANALYST,DECODE(JOB,'CLERK',SAL) CLERK
    ,DECODE(JOB,'MANAGER',SAL) MANAGER,DECODE(JOB,'PRESIDENT',SAL) PRESIDENT,DECODE(JOB,'SALESMAN',SAL) SALESMAN FROM EMP;

--그룹함수 : 매개변수로 여러개의 값을 전달받아 처리 결과값을 반환하는 함수
--COUNT 함수, MAX 함수, MIN 함수, SUM 함수, AVG 함수 등 

--COUNT(컬럼명) : 매개변수로 테이블에 저장된 행의 컬럼값을 전달받아 컬럼값의 갯수를 반환하는 함수
SELECT COUNT(EMPNO) FROM EMP;

--그룹함수를 다른 검색대상과 같이 사용할 경우 그룹함수의 반환값의 갯수와 검색대상의 행의 갯수가 다른 경우 에러 발생
SELECT COUNT(EMPNO),EMPNO FROM EMP;--에러 발생

--NULL은 값이 아니므로 그룹함수는 NULL를 제외한 결과값을 반환
SELECT COUNT(EMPNO),COUNT(COMM) FROM EMP;

--COUNT 함수는 컬럼명 대신 [*] 기호를 사용해 모든 컬럼값을 사용하여 검색행의 갯수를 반환받아 사용
SELECT COUNT(*) FROM EMP;--테이블에 저장된 검색행의 갯수를 반환받아 검색

--MAX(컬럼명) : 매개변수로 테이블에 저장된 행의 컬럼값을 전달받아 최대값을 반환하는 함수
SELECT MAX(SAL) FROM EMP;
SELECT MAX(ENAME) FROM EMP;
SELECT MAX(HIREDATE) FROM EMP;

--MIN(컬럼명) : 매개변수로 테이블에 저장된 행의 컬럼값을 전달받아 최소값을 반환하는 함수
SELECT MIN(SAL) FROM EMP;
SELECT MIN(ENAME) FROM EMP;
SELECT MIN(HIREDATE) FROM EMP;

--SUM(컬럼명) : 매개변수로 테이블에 저장된 행의 컬럼값(숫자값)을 전달받아 합계를 계산하여 반환하는 함수
SELECT SUM(SAL) FROM EMP;

--AVG(컬럼명) : 매개변수로 테이블에 저장된 행의 컬럼값(숫자값)을 전달받아 평균을 계산하여 반환하는 함수
SELECT AVG(SAL) FROM EMP;
SELECT ROUND(AVG(SAL),2) FROM EMP;

--EMP 테이블에 저장된 모든 사원의 성과급을 전달받아 평균 성과급을 계산하여 검색
--그룹함수는 NULL를 제외한 컬럼값만 사용하여 처리되므로 성과급이 NULL이 아닌 사원의 평균 성과급 검색
SELECT AVG(COMM) FROM EMP;--검색오류
SELECT AVG(NVL(COMM,0)) FROM EMP;
SELECT CEIL(AVG(NVL(COMM,0))) "평균 성과급" FROM EMP;

--EMP 테이블에 저장된 행(사원정보)을 부서번호로 구분하여 인원수 검색
SELECT COUNT(*) FROM EMP WHERE DEPTNO=10;--10번 부서에 근무하는 사원의 인원수 검색
SELECT COUNT(*) FROM EMP WHERE DEPTNO=20;--20번 부서에 근무하는 사원의 인원수 검색
SELECT COUNT(*) FROM EMP WHERE DEPTNO=30;--30번 부서에 근무하는 사원의 인원수 검색

--GROUP BY : 검색대상에서 그룹함수를 사용할 경우 행을 컬럼값으로 구분해 여러개의 그룹을 나누어 검색하는 기능을 제공하는 키워드
--행의 컬럼값이 같은 경우 같은 그룹으로 묶어서 검색 처리 - 검색행의 갯수가 그룹의 갯수만큼 검색
--형식) SELECT 그룹함수(컬럼명)[, 검색대상, ...] FROM 테이블명 [WHERE 조건식]
--      GROUP BY {컬럼명|연산식|함수}, {컬럼명|연산식|함수}, ... 
--      ORDER BY {컬럼명|연산식|함수|별칭|COLUMN_INDEX} {ASC|DESC}, ...

--EMP 테이블에 저장된 행(사원정보)을 부서번호로 그룹화하여 인원수 검색
SELECT COUNT(*) FROM EMP GROUP BY DEPTNO;

--GROUP BY 키워드에서 사용된 표현식(컬럼명|연산식|함수)은 그룹함수와 같이 검색대상으로 사용하여 검색 가능
SELECT DEPTNO,COUNT(*) FROM EMP GROUP BY DEPTNO;
SELECT DEPTNO,COUNT(*) FROM EMP GROUP BY DEPTNO ORDER BY DEPTNO;
SELECT DEPTNO DNO,COUNT(*) FROM EMP GROUP BY DNO;--에러 발생 : 별칭을 사용하여 그룹 설정 불가능

--EMP 테이블에 저장된 모든 사원을 업무로 그룹화하여 인원수, 급여합계, 급여평균 검색
SELECT JOB,COUNT(*) CNT,SUM(SAL) SUM_SAL,CEIL(AVG(SAL)) AVG_SAL FROM EMP GROUP BY JOB;
SELECT JOB,COUNT(*) CNT,SUM(SAL) SUM_SAL,CEIL(AVG(SAL)) AVG_SAL FROM EMP GROUP BY JOB ORDER BY CNT;

--EMP 테이블에서 업무가 PRESIDENT인 사원을 제외한 나머지 사원을 업무로 그룹화하여 급여 합계 검색
SELECT JOB,SUM(SAL) FROM EMP WHERE JOB<>'PRESIDENT' GROUP BY JOB;

--HAVING : GROUP BY 키워드로 생성된 그룹에서 조건식이 참(TRUE)인 그룹만 검색하는 기능을 제공하는 키워드
--SELECT 키워드의 검색대상으로 사용된 컬럼명 또는 그룹함수를 사용해 HAVING 키워드의 조건식 작성
--형식) SELECT 그룹함수(컬럼명)[, 검색대상, ...] FROM 테이블명 [WHERE 조건식]
--      GROUP BY {컬럼명|연산식|함수}, {컬럼명|연산식|함수}, ... HAVING 그룹조건식
--      ORDER BY {컬럼명|연산식|함수|별칭|COLUMN_INDEX} {ASC|DESC}, ...

--EMP 테이블에서 업무가 PRESIDENT인 사원을 제외한 나머지 사원을 업무로 구분하여 급여 합계 검색
SELECT JOB,SUM(SAL) FROM EMP GROUP BY JOB HAVING JOB<>'PRESIDENT';

--EMP 테이블에 저장된 모든 사원을 부서번호로 그룹화하여 급여 합계가 9000 이상인 부서번호, 급여합계 검색
SELECT DEPTNO,SUM(SAL) FROM EMP GROUP BY DEPTNO HAVING SUM(SAL)>=9000;


SELECT EMPNO,ENAME,DEPTNO,HIREDATE FROM EMP WHERE HIREDATE=12;

SELECT EMPNO,ENAME,SAL*12 급여 FROM EMP;
DESC EMP;
SELECT EMPNO,ENAME,TO_CHAR(HIREDATE,'YYYY-MM-DD') FROM EMP;

SELECT DEPTNO,COUNT(*) FROM EMP GROUP BY DEPTNO ORDER BY DEPTNO;

SELECT COUNT(*),JOB,SUM(SAL) FROM EMP GROUP BY JOB ORDER BY JOB;

SELECT SUM(SAL),TO_CHAR(HIREDATE,'YYYY-MM') FROM EMP GROUP BY HIREDATE ORDER BY HIREDATE;