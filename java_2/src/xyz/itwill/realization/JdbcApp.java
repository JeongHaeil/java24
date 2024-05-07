package xyz.itwill.realization;

public class JdbcApp {
	public static void main(String[] args) {
		/*
		JdbcMysql mysql=new JdbcMysql();
		
		mysql.insert();
		mysql.delete();
		mysql.selcet();
		mysql.update();
		 */
		/*
		JdbcOracle oracle=new JdbcOracle();
		oracle.add();
		oracle.hello();
		oracle.mod();
		oracle.other();
		*/
		
		Jdbc jdbc=new JdbcOracle();
		
		jdbc.delete();
		jdbc.insert();
		jdbc.selcet();
		jdbc.update();
		
		
		
	}
}
