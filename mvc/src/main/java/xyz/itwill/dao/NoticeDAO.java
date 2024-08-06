package xyz.itwill.dao;

public class NoticeDAO {
	private static NoticeDAO _dao;
	
	private NoticeDAO() {
		// TODO Auto-generated constructor stub
	}
	
	static {
		_dao=new NoticeDAO();		
	}
	
	public static NoticeDAO getDAO() {
		return _dao;
	}
	
	
	
}
