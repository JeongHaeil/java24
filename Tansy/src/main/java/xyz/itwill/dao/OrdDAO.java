package xyz.itwill.dao;

import xyz.itwill.dto.OrdDTO;

public class OrdDAO extends JdbcDAO {
	private static OrdDAO _dao;
	
	static {
		_dao = new OrdDAO();
		
	}
	public static OrdDAO getOrdDAO() {
		return _dao;
	}
	
	public OrdDTO selectOrdClient() {
		
	}
	
	
	public OrdDTO insertOrdClient() {
		
	}
	
}
