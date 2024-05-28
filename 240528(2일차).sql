--�Լ�(FUNCTION) : �Ű������� ���޹��� ���� �����Ͽ� ������� ��ȯ�ϴ� ��� ����
--����Ŭ�� �����Լ� : �����Լ��� �׷��Լ��� ����
--�����Լ� : �Ű������� �ϳ��� ���� ���޹޾� ó�� ������� ��ȯ�ϴ� �Լ� - �����Լ�, �����Լ�, ��¥�Լ�, ��ȯ�Լ�, �Ϲ��Լ�
--�׷��Լ� : �Ű������� �������� ������ ���޹޾� ó�� ������� ��ȯ�ϴ� �Լ�

--�����Լ� : �Ű������� ���ڰ��� ���޹޾� ó�� ������� ��ȯ�ϴ� �Լ�

--UPPER(���ڰ�) : ���ڰ��� ���޹޾� �빮�ڷ� ��ȯ�Ͽ� ��ȯ�ϴ� �Լ�
--LOWER(���ڰ�) : ���ڰ��� ���޹޾� �ҹ��ڷ� ��ȯ�Ͽ� ��ȯ�ϴ� �Լ�
SELECT ENAME,UPPER(ENAME),LOWER(ENAME) FROM EMP;

--EMP ���̺��� ����̸��� ALLEN�� ����� �����ȣ, ����̸�, �޿� �˻�
--���ڰ��� ��ҹ��ڸ� �����Ͽ� �� ����� ����
SELECT EMPNO,ENAME,SAL FROM EMP WHERE ENAME='ALLEN';
SELECT EMPNO,ENAME,SAL FROM EMP WHERE ENAME='allen';
--��ҹ��� ���о��� ���ڰ��� ���� ��� UPPER �Լ� �Ǵ� LOWER �Լ� ���
SELECT EMPNO,ENAME,SAL FROM EMP WHERE UPPER(ENAME)=UPPER('allen');
SELECT EMPNO,ENAME,SAL FROM EMP WHERE LOWER(ENAME)=LOWER('allen');

--INITCAP(���ڰ�) : ���ڰ��� ���޹޾� ù��° ���ڸ� �빮�ڷ� ��ȯ�ϰ� ������ ���ڴ� �ҹ��ڷ� ��ȯ�Ͽ� ��ȯ�ϴ� �Լ�
SELECT ENAME,INITCAP(ENAME) FROM EMP;

--CONCAT(���ڰ�, ���ڰ�) : �� ���� ���ڰ��� ���޹޾� �����Ͽ� ��ȯ�ϴ� �Լ�
--|| ��ȣ�� ���ڰ��� ���ڰ�, ��¥��, ���ڰ��� �����Ͽ� ��� ����
SELECT ENAME,JOB,CONCAT(ENAME,JOB),ENAME||JOB FROM EMP;

--SUBSTR(���ڰ�, ������ġ, ����) : ���ڰ��� ���޹޾� ������ġ(÷�� - INDEX)���� ������ŭ�� ���ڵ��� �и��Ͽ� ��ȯ�ϴ� �Լ�
SELECT EMPNO,ENAME,JOB,SUBSTR(JOB,6,3) FROM EMP WHERE EMPNO=7499;

--LENGTH(���ڰ�) : ���ڰ��� ���޹޾� ������ ������ ��ȯ�ϴ� �Լ�
SELECT EMPNO,ENAME,JOB,LENGTH(JOB) FROM EMP WHERE EMPNO=7499;

--INSTR(���ڰ�, �˻����ڰ�, ������ġ, �˻���ġ) : ���ڰ��� ���޹޾� �˻����ڰ��� ������ġ(÷��)���� �˻��Ͽ� �˻���ġ(����)��
--����÷�ڸ� ��ȯ�ϴ� �Լ� - �˻����ڰ��� ���� ��� 0 ��ȯ
SELECT EMPNO,ENAME,JOB,INSTR(JOB,'A',1,2) FROM EMP WHERE EMPNO=7499;
SELECT EMPNO,ENAME,JOB,INSTR(JOB,'XYZ',1,1) FROM EMP WHERE EMPNO=7499;

--LPAD(���ڰ�,�ڸ���,ä�﹮��) : ���ڰ��� ���޹޾� ��� �ڸ��� ũ�⸸ŭ ������ Ȯ���� �� �����ʺ��� ä��� ���ʿ� ���� �ڸ���
--ä�﹮�ڷ� ��ȯ�Ͽ� ��ȯ�ϴ� �Լ�
--RPAD(���ڰ�,�ڸ���,ä�﹮��) : ���ڰ��� ���޹޾� ��� �ڸ��� ũ�⸸ŭ ������ Ȯ���� �� ���ʺ��� ä��� �����ʿ� ���� �ڸ���
--ä�﹮�ڷ� ��ȯ�Ͽ� ��ȯ�ϴ� �Լ�
SELECT EMPNO,ENAME,SAL,LPAD(SAL,8,'*'),RPAD(SAL,8,'*') FROM EMP;

--TRIM({LEADING|TRAILING} ���Ź��� FROM ���ڰ�) : ���ڰ��� ���޹޾� �� �Ǵ� �ڿ� ����� ���Ź��ڵ��� �����Ͽ� ��ȯ�ϴ� �Լ�
SELECT EMPNO,ENAME,JOB,TRIM(LEADING 'S' FROM JOB),TRIM(TRAILING 'N' FROM JOB) FROM EMP WHERE EMPNO=7499;

--REPLACE(���ڰ�,�˻����ڰ�,ġȭ���ڰ�) : ���ڰ��� ���޹޾� �˻����ڰ��� ã�� ġȯ���ڰ����� ��ȯ�Ͽ� ��ȯ�ϴ� �Լ�
SELECT EMPNO,ENAME,JOB,REPLACE(JOB,'MAN','PERSON') FROM EMP WHERE EMPNO=7499;

--�����Լ� : �Ű������� ���ڰ��� ���޹޾� ó�� ������� ��ȯ�ϴ� �Լ�

--ROUND(���ڰ�, �Ҽ����ڸ���) : ���ڰ��� ���޹޾� �Ҽ����ڸ�����ŭ �˻��ǵ��� �ݿø� ó���Ͽ� ��ȯ�ϴ� �Լ�
--DUAL ���̺� : SELECT ����� �ۼ��� �� ���̺��� ����� ���� �������� ���� ��� ����ϴ� ������ ���̺�
SELECT ROUND(45.582,2),ROUND(45.582,0),ROUND(45.582,-1) FROM DUAL;

--TRUNC(���ڰ�, �Ҽ����ڸ���) : ���ڰ��� ���޹޾� �Ҽ����ڸ�����ŭ �˻��ǵ��� ���� ó���Ͽ� ��ȯ�ϴ� �Լ�
SELECT TRUNC(45.582,2),TRUNC(45.582,0),TRUNC(45.582,-1) FROM DUAL;

--CEIL(���ڰ�) : ���޹��� ���ڰ��� �Ǽ����� ��� ������ ���ڰ�(������)�� ��ȯ�ϴ� �Լ�
SELECT CEIL(15.3),CEIL(-15.3) FROM DUAL;

--FLOOR(���ڰ�) : ���޹��� ���ڰ��� �Ǽ����� ��� ���ҵ� ���ڰ�(������)�� ��ȯ�ϴ� �Լ�
SELECT FLOOR(15.3),FLOOR(-15.3) FROM DUAL;

--MOD(���ڰ�1, ���ڰ�2) : ���ڰ�1�� ���ڰ�2�� ���� �������� ��ȯ�ϴ� �Լ�
SELECT 20/8,MOD(20,8) FROM DUAL;

--POWER(���ڰ�1, ���ڰ�2) : ���ڰ�1�� ���ڰ�2�� ������ŭ ���� ����� ��ȯ�ϴ� �Լ�
SELECT 3*3*3*3*3,POWER(3,5) FROM DUAL;

--��¥�Լ� : �Ű������� ��¥���� ���޹޾� ó�� ������� ��ȯ�ϴ� �Լ�

--SYSDATE : �ý����� ���� ��¥�� �ð��� �����ϱ� ���� Ű����
--SELECT ������� �˻��� ��¥���� [RR/MM/DD] �������� �˻��Ǿ� ����
SELECT SYSDATE FROM DUAL;

--ADD_MONTHS(��¥��, ���ڰ�) : ��¥���� ���޹޾� ���ڰ���ŭ �������� ������ ��¥���� ��ȯ�ϴ� �Լ�
SELECT SYSDATE,ADD_MONTHS(SYSDATE,5) FROM DUAL;

--��¥�� + ������ �Ǵ� - �����ڸ� ����Ͽ� ����ó�� ����

--��¥�� + ���ڰ� = ��¥��  >> �� ����
SELECT SYSDATE,SYSDATE+7 FROM DUAL;

--��¥�� + ���ڰ�/24 = ��¥��  >> �ð� ����
SELECT SYSDATE,SYSDATE+100/24 FROM DUAL;

--��¥�� - ���ڰ� = ��¥��  >> �� ����
SELECT SYSDATE,SYSDATE-7 FROM DUAL;

--��¥�� - ���ڰ� / 24 = ��¥��  >> �ð� ����
SELECT SYSDATE,SYSDATE-100/24 FROM DUAL;

--��¥�� - ��¥�� = ���ڰ� >> ��(�Ǽ���)
--EMP ���̺� ����� ��� ����� �����ȣ,����̸�,�Ի���,�ټ��ϼ�(����-�Ի���) �˻�
SELECT EMPNO,ENAME,HIREDATE,SYSDATE-HIREDATE FROM EMP;
SELECT EMPNO,ENAME,HIREDATE,CEIL(SYSDATE-HIREDATE)||'��' �ټ��ϼ� FROM EMP;

--NEXT_DAY(��¥��, ����) : ���޹��� ��¥���� �������� �̷��� Ư�� ���Ͽ� ���� ��¥���� ��ȯ�ϴ� �Լ�
SELECT NEXT_DAY(SYSDATE, '��') FROM DUAL; 

--����Ŭ ������ ���ӵ� Ŭ���̾�Ʈ ȯ��(���� : SESSION)�� ���� ��� ��� �� ��¥���� ���� ���ϰ� ȭ����� ���� �ٸ��� ����
--���� ������� Ŭ���̾�Ʈ ȯ��(����)�� ���� ��� ��� �� ��¥���� ���� ���ϰ� ȭ����� �� ���� ����
ALTER SESSION SET NLS_LANGUAGE='AMERICAN';--����� ����
SELECT NEXT_DAY(SYSDATE, 'SAT') FROM DUAL; 

ALTER SESSION SET NLS_LANGUAGE='KOREAN';--����� ����
SELECT NEXT_DAY(SYSDATE, '��') FROM DUAL; 

--TRUNC(��¥��, ����) : ��¥���� ���޹޾� ���ϴ� ������ ��¥�������� �˻��Ͽ� �������� �����Ͽ� �ʱⰪ���� �˻��ǵ��� ��ȯ�Ͽ� ��ȯ�ϴ� �Լ�
SELECT SYSDATE,TRUNC(SYSDATE,'MONTH'),TRUNC(SYSDATE,'YEAR') FROM DUAL;

--��ȯ�Լ� : �Ű������� ���޹��� ���� ���ϴ� �ڷ����� ������ ��ȯ�Ͽ� ��ȯ�ϴ� �Լ�

--TO_NUMBER(���ڰ�) : ���ڰ��� ���޹޾� ���ڰ����� ��ȯ�Ͽ� ��ȯ�ϴ� �Լ�
--�Ű������� ���޹��� ���ڰ��� ���ڰ� �ƴ� ������ ���ڰ� �����ϴ� ��� ���ڰ����� ��ȯ�� �� ���� ����

--EMP ���̺��� �����ȣ�� 7499�� ����� �����ȣ, ����̸�, �޿� �˻�
SELECT EMPNO,ENAME,SAL FROM EMP WHERE EMPNO=7499;
--���÷��� �ڷ����� �������� ��� �񱳰��� ���ڰ��̸� TO_NUMBER �Լ��� ����Ͽ� ���ڰ��� ���ڰ����� ��ȯ�Ͽ� �� ó�� - ���� ����ȯ
SELECT EMPNO,ENAME,SAL FROM EMP WHERE EMPNO=TO_NUMBER('7499');
--���÷��� �ڷ����� �������� ��� �񱳰��� ���ڰ��̸� �ڵ����� ���ڰ����� ��ȯ�Ǿ� �� ó�� - �ڵ� ����ȯ
SELECT EMPNO,ENAME,SAL FROM EMP WHERE EMPNO='7499';

--���ڰ��� ��� ���� ó���� ��� ���ڰ��� �ڵ����� ���ڰ����� ��ȯ�Ǿ� ���� ó�� - �ڵ� ����ȯ
SELECT 100+200 FROM DUAL;
SELECT '100'+'200' FROM DUAL;

--EMP ���̺��� �����ȣ�� 7839�� ����� �����ȣ, ����̸�, �޿�, ���ı޿�(�޿�*0.9) �˻�
SELECT EMPNO,ENAME,SAL,SAL*0.9 FROM EMP WHERE EMPNO=7839;
SELECT EMPNO,ENAME,SAL,SAL*TO_NUMBER('0.9') FROM EMP WHERE EMPNO=7839;
SELECT EMPNO,ENAME,SAL,SAL*'0.9' FROM EMP WHERE EMPNO=7839;

--TO_DATE(���ڰ�[, ��¥����]) : ��¥���Ͽ� �´� ���ڰ��� ���޹޾� ��¥������ ��ȯ�Ͽ� ��ȯ�ϴ� �Լ�
--��¥������ ���޹��� ���� ��� �⺻������ [RR/MM/DD] ��¥������ ���
--��¥���ϰ� ���� �ʴ� ���ڰ��� ���޹��� ��� ���� �߻�

--EMP ���̺��� �Ի����� 1982�� 01�� 23�� ����� �����ȣ, ����̸�, �Ի��� �˻�
--���÷��� �ڷ����� ��¥���� ��� �񱳰��� ���ڰ��̸� TO_DATE �Լ��� ����Ͽ� ���ڰ��� ��¥������ ��ȯ�Ͽ� �� ó�� - ���� ����ȯ
SELECT EMPNO,ENAME,HIREDATE FROM EMP WHERE HIREDATE=TO_DATE('82/01/23');
--[RR/MM/DD] ��¥���� ��� [YYYY-MM-DD] ��¥���� ���
SELECT EMPNO,ENAME,HIREDATE FROM EMP WHERE HIREDATE=TO_DATE('1982-01-23');
--���÷��� �ڷ����� ��¥���� ��� �񱳰��� ���ڰ��̸� �ڵ����� ��¥������ ��ȯ�Ǿ� �� ó�� - �ڵ� ����ȯ
SELECT EMPNO,ENAME,HIREDATE FROM EMP WHERE HIREDATE='82/01/23';
SELECT EMPNO,ENAME,HIREDATE FROM EMP WHERE HIREDATE='1982-01-23';

--�⺻������ �������� ��¥���Ͽ� ���� �ʴ� ���ڰ��� ����� ��� ���� �߻�
SELECT EMPNO,ENAME,HIREDATE FROM EMP WHERE HIREDATE=TO_DATE('01-23-1982');
SELECT EMPNO,ENAME,HIREDATE FROM EMP WHERE HIREDATE='01-23-1982';
--���ڰ��� �´� ��¥������ �Ű������� �����Ͽ� ��¥���� ��ȯ�޾� �� ó�� ����
SELECT EMPNO,ENAME,HIREDATE FROM EMP WHERE HIREDATE=TO_DATE('01-23-1982','MM-DD-YYYY');

--2000�� 01�� 01�Ͽ� �¾ ����� ���ñ��� ��ƿ� �ϼ� �˻�
--�˻���� ��� �����ڸ� ����ϸ� ���ڰ��� ��¥���� �ƴ� ���ڰ����� �ڵ� ����ȯ�Ͽ� ���� ó�� 
SELECT SYSDATE-'2000-01-01' FROM DUAL;--���ڰ� �ƴ� ���ڰ� ���ԵǾ� �ִ� ��� ���� �߻�
--TO_DATE �Լ��� ����Ͽ� ���ڰ��� ��¥������ ��ȯ�ؾ߸� ��¥ ��� ����
SELECT SYSDATE-TO_DATE('2000-01-01') FROM DUAL;
SELECT CEIL(SYSDATE-TO_DATE('2000-01-01'))||'��' "���ñ��� ��ƿ� �ϼ�" FROM DUAL;

--TO_CHAR({���ڰ�|���ڰ�}, ���Ϲ��ڰ�) : �Ű������� ���޹��� ���ڰ� �Ǵ� ���ڰ��� ���ϴ� ������ ���ڰ����� ��ȯ�Ͽ� ��ȯ�ϴ� �Լ�

--��¥���� : RR(��), YYYY(��), MM(��), DD(��), HH24(��-1~24), HH12(��-1~12), MI(��), SS(��)
SELECT SYSDATE,TO_CHAR(SYSDATE,'YYYY-MM-DD'),TO_CHAR(SYSDATE,'YYYY-MM-DD HH24:MI:SS') FROM DUAL;

--EMP ���̺��� 1981�⿡ �Ի��� ����� �����ȣ,����̸�,�Ի��� �˻� 
--TO_CHAR �Լ��� ����Ͽ� ��¥���� ���ϴ� ������ ���ڰ����� ��ȯ�޾� �� ó��
SELECT EMPNO,ENAME,HIREDATE FROM EMP WHERE TO_CHAR(HIREDATE,'YYYY')='1981';

--�������� : 9(���� �Ǵ� ����), 0(����), L(ȭ�����), $(�޷�)
SELECT 10000000000,TO_CHAR(10000000000,'999,999,999,990') FROM DUAL;
--���Ϲ��ڷ� ǥ�� �Ұ����� ���ڰ��� ���޵� ��� [#] ��ȣ�� ��ȯ�Ǿ� ��ȯ
SELECT 10000000000,TO_CHAR(10000000000,'9,999,999,990') FROM DUAL;--�˻�����

--EMP ���̺��� �����ȣ�� 7844�� ����� �����ȣ, ����̸�, �޿� �˻�
SELECT EMPNO,ENAME,SAL FROM EMP WHERE EMPNO=7844;
SELECT EMPNO,ENAME,TO_CHAR(SAL,'999,990') SAL FROM EMP WHERE EMPNO=7844;
SELECT EMPNO,ENAME,TO_CHAR(SAL,'L99,990') SAL FROM EMP WHERE EMPNO=7844;
SELECT EMPNO,ENAME,TO_CHAR(SAL,'$99,990.00') SAL FROM EMP WHERE EMPNO=7844;

--�Ϲ��Լ� : �Ű������� ���޹��� ���� Ư�� ���ǿ� ��(TRUE)�� ��� ���氪���� ��ȯ�Ͽ� ��ȯ�ϴ� �Լ�

--NVL(���ް�, ���氪) : ���ް��� NULL�� ��� ���氪���� ��ȯ�Ͽ� ��ȯ�ϴ� �Լ�
--���氪�� ���ް��� ���� �ڷ����� �����θ� ���� ���� - ���氪�� �ڷ����� ���ް��� �ڷ����� �ٸ� ��� ���� �߻�

--EMP ���̺� ����� ��� ����� �����ȣ,����̸�,����(�޿�*12) �˻�
SELECT EMPNO,ENAME,SAL*12 ANNUAL FROM EMP;

--EMP ���̺� ����� ��� ����� �����ȣ,����̸�,����((�޿�+������)*12) �˻�
--������(COMM �÷���)�� NULL�� ��� ������ �Ұ����Ͽ� �������� NULL ����
SELECT EMPNO,ENAME,(SAL+COMM)*12 ANNUAL FROM EMP;--�˻�����
--NVL �Լ��� ����Ͽ� ������(COMM �÷���)�� NULL�� ��� [0]���� ��ȯ�޾� ���� ó��
SELECT EMPNO,ENAME,(SAL+NVL(COMM,0))*12 ANNUAL FROM EMP;

--NVL2(���ް�, ���氪1, ���氪2) : ���ް��� NULL�� �ƴ� ��� ���氪1�� ��ȯ�Ͽ� ��ȯ�ϰ� ���ް��� NULL�� ��� ���氪2���� 
--��ȯ�Ͽ� ��ȯ�ϴ� �Լ�

--EMP ���̺� ����� ��� ����� �����ȣ,����̸�,����((�޿�+������)*12) �˻�
SELECT EMPNO,ENAME,(SAL+NVL2(COMM,COMM,0))*12 ANNUAL FROM EMP;
SELECT EMPNO,ENAME,NVL2(COMM,COMM+SAL,SAL)*12 ANNUAL FROM EMP;

--DECODE(���ް�,�񱳰�1,���氪1,�񱳰�2,���氪2,...[,�⺻��]) : ���ް��� �񱳰��� ���ʴ�� ���Ͽ� ���ް��� �񱳰��� ���� ���
--���氪���� ��ȯ�Ͽ� ��ȯ�ϴ� �Լ�
--���ް��� ��� �񱳰��� ���� ���� ��� �⺻������ ��ȯ�Ͽ� ��ȯ������ �⺻���� ������ ��� NULL ��ȯ

--EMP ���̺� ����� ��� ����� �����ȣ, ����̸�, ����, �޿�, ������ �Ǳ޿�(����� ������ �����Ͽ� ������ ���ҵ� �޿�) �˻�
--������ �Ǳ޿� : ANALYST : �޿�*1.1, CLERK : �޿�*1.2, MANAGER : �޿�*1.3, PRESIDENT : �޿�*1.4, SALESMAN : �޿�*1.5
SELECT EMPNO,ENAME,JOB,SAL,DECODE(JOB,'ANALYST',SAL*1.1,'CLERK',SAL*1.2,'MANAGER',SAL*1.3
    ,'PRESIDENT',SAL*1.4,'SALESMAN',SAL*1.5,SAL) "������ �Ǳ޿�" FROM EMP;

--EMP ���̺� ����� ��� ����� �����ȣ, ����̸�, ����, �޿��� �˻��ϵ� �޿��� �������� �����Ͽ� �˻��ϰ� �ش������ �ƴ� ��� NULL �˻�
SELECT EMPNO,ENAME,JOB,SAL FROM EMP;
SELECT EMPNO,ENAME,DECODE(JOB,'ANALYST',SAL) ANALYST,DECODE(JOB,'CLERK',SAL) CLERK
    ,DECODE(JOB,'MANAGER',SAL) MANAGER,DECODE(JOB,'PRESIDENT',SAL) PRESIDENT,DECODE(JOB,'SALESMAN',SAL) SALESMAN FROM EMP;

--�׷��Լ� : �Ű������� �������� ���� ���޹޾� ó�� ������� ��ȯ�ϴ� �Լ�
--COUNT �Լ�, MAX �Լ�, MIN �Լ�, SUM �Լ�, AVG �Լ� �� 

--COUNT(�÷���) : �Ű������� ���̺� ����� ���� �÷����� ���޹޾� �÷����� ������ ��ȯ�ϴ� �Լ�
SELECT COUNT(EMPNO) FROM EMP;

--�׷��Լ��� �ٸ� �˻����� ���� ����� ��� �׷��Լ��� ��ȯ���� ������ �˻������ ���� ������ �ٸ� ��� ���� �߻�
SELECT COUNT(EMPNO),EMPNO FROM EMP;--���� �߻�

--NULL�� ���� �ƴϹǷ� �׷��Լ��� NULL�� ������ ������� ��ȯ
SELECT COUNT(EMPNO),COUNT(COMM) FROM EMP;

--COUNT �Լ��� �÷��� ��� [*] ��ȣ�� ����� ��� �÷����� ����Ͽ� �˻����� ������ ��ȯ�޾� ���
SELECT COUNT(*) FROM EMP;--���̺� ����� �˻����� ������ ��ȯ�޾� �˻�

--MAX(�÷���) : �Ű������� ���̺� ����� ���� �÷����� ���޹޾� �ִ밪�� ��ȯ�ϴ� �Լ�
SELECT MAX(SAL) FROM EMP;
SELECT MAX(ENAME) FROM EMP;
SELECT MAX(HIREDATE) FROM EMP;

--MIN(�÷���) : �Ű������� ���̺� ����� ���� �÷����� ���޹޾� �ּҰ��� ��ȯ�ϴ� �Լ�
SELECT MIN(SAL) FROM EMP;
SELECT MIN(ENAME) FROM EMP;
SELECT MIN(HIREDATE) FROM EMP;

--SUM(�÷���) : �Ű������� ���̺� ����� ���� �÷���(���ڰ�)�� ���޹޾� �հ踦 ����Ͽ� ��ȯ�ϴ� �Լ�
SELECT SUM(SAL) FROM EMP;

--AVG(�÷���) : �Ű������� ���̺� ����� ���� �÷���(���ڰ�)�� ���޹޾� ����� ����Ͽ� ��ȯ�ϴ� �Լ�
SELECT AVG(SAL) FROM EMP;
SELECT ROUND(AVG(SAL),2) FROM EMP;

--EMP ���̺� ����� ��� ����� �������� ���޹޾� ��� �������� ����Ͽ� �˻�
--�׷��Լ��� NULL�� ������ �÷����� ����Ͽ� ó���ǹǷ� �������� NULL�� �ƴ� ����� ��� ������ �˻�
SELECT AVG(COMM) FROM EMP;--�˻�����
SELECT AVG(NVL(COMM,0)) FROM EMP;
SELECT CEIL(AVG(NVL(COMM,0))) "��� ������" FROM EMP;

--EMP ���̺� ����� ��(�������)�� �μ���ȣ�� �����Ͽ� �ο��� �˻�
SELECT COUNT(*) FROM EMP WHERE DEPTNO=10;--10�� �μ��� �ٹ��ϴ� ����� �ο��� �˻�
SELECT COUNT(*) FROM EMP WHERE DEPTNO=20;--20�� �μ��� �ٹ��ϴ� ����� �ο��� �˻�
SELECT COUNT(*) FROM EMP WHERE DEPTNO=30;--30�� �μ��� �ٹ��ϴ� ����� �ο��� �˻�

--GROUP BY : �˻���󿡼� �׷��Լ��� ����� ��� ���� �÷������� ������ �������� �׷��� ������ �˻��ϴ� ����� �����ϴ� Ű����
--���� �÷����� ���� ��� ���� �׷����� ��� �˻� ó�� - �˻����� ������ �׷��� ������ŭ �˻�
--����) SELECT �׷��Լ�(�÷���)[, �˻����, ...] FROM ���̺�� [WHERE ���ǽ�]
--      GROUP BY {�÷���|�����|�Լ�}, {�÷���|�����|�Լ�}, ... 
--      ORDER BY {�÷���|�����|�Լ�|��Ī|COLUMN_INDEX} {ASC|DESC}, ...

--EMP ���̺� ����� ��(�������)�� �μ���ȣ�� �׷�ȭ�Ͽ� �ο��� �˻�
SELECT COUNT(*) FROM EMP GROUP BY DEPTNO;

--GROUP BY Ű���忡�� ���� ǥ����(�÷���|�����|�Լ�)�� �׷��Լ��� ���� �˻�������� ����Ͽ� �˻� ����
SELECT DEPTNO,COUNT(*) FROM EMP GROUP BY DEPTNO;
SELECT DEPTNO,COUNT(*) FROM EMP GROUP BY DEPTNO ORDER BY DEPTNO;
SELECT DEPTNO DNO,COUNT(*) FROM EMP GROUP BY DNO;--���� �߻� : ��Ī�� ����Ͽ� �׷� ���� �Ұ���

--EMP ���̺� ����� ��� ����� ������ �׷�ȭ�Ͽ� �ο���, �޿��հ�, �޿���� �˻�
SELECT JOB,COUNT(*) CNT,SUM(SAL) SUM_SAL,CEIL(AVG(SAL)) AVG_SAL FROM EMP GROUP BY JOB;
SELECT JOB,COUNT(*) CNT,SUM(SAL) SUM_SAL,CEIL(AVG(SAL)) AVG_SAL FROM EMP GROUP BY JOB ORDER BY CNT;

--EMP ���̺��� ������ PRESIDENT�� ����� ������ ������ ����� ������ �׷�ȭ�Ͽ� �޿� �հ� �˻�
SELECT JOB,SUM(SAL) FROM EMP WHERE JOB<>'PRESIDENT' GROUP BY JOB;

--HAVING : GROUP BY Ű����� ������ �׷쿡�� ���ǽ��� ��(TRUE)�� �׷츸 �˻��ϴ� ����� �����ϴ� Ű����
--SELECT Ű������ �˻�������� ���� �÷��� �Ǵ� �׷��Լ��� ����� HAVING Ű������ ���ǽ� �ۼ�
--����) SELECT �׷��Լ�(�÷���)[, �˻����, ...] FROM ���̺�� [WHERE ���ǽ�]
--      GROUP BY {�÷���|�����|�Լ�}, {�÷���|�����|�Լ�}, ... HAVING �׷����ǽ�
--      ORDER BY {�÷���|�����|�Լ�|��Ī|COLUMN_INDEX} {ASC|DESC}, ...

--EMP ���̺��� ������ PRESIDENT�� ����� ������ ������ ����� ������ �����Ͽ� �޿� �հ� �˻�
SELECT JOB,SUM(SAL) FROM EMP GROUP BY JOB HAVING JOB<>'PRESIDENT';

--EMP ���̺� ����� ��� ����� �μ���ȣ�� �׷�ȭ�Ͽ� �޿� �հ谡 9000 �̻��� �μ���ȣ, �޿��հ� �˻�
SELECT DEPTNO,SUM(SAL) FROM EMP GROUP BY DEPTNO HAVING SUM(SAL)>=9000;


SELECT EMPNO,ENAME,DEPTNO,HIREDATE FROM EMP WHERE HIREDATE=12;

SELECT EMPNO,ENAME,SAL*12 �޿� FROM EMP;
DESC EMP;
SELECT EMPNO,ENAME,TO_CHAR(HIREDATE,'YYYY-MM-DD') FROM EMP;

SELECT DEPTNO,COUNT(*) FROM EMP GROUP BY DEPTNO ORDER BY DEPTNO;

SELECT COUNT(*),JOB,SUM(SAL) FROM EMP GROUP BY JOB ORDER BY JOB;

SELECT SUM(SAL),TO_CHAR(HIREDATE,'YYYY-MM') FROM EMP GROUP BY HIREDATE ORDER BY HIREDATE;