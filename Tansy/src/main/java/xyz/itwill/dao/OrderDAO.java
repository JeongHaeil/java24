package xyz.itwill.dao;

import xyz.itwill.dto.OrderDTO;

public class OrderDAO extends JdbcDAO {
	private static OrderDAO _dao;
	
	static {
		_dao = new OrderDAO();
		
	}
	public static OrderDAO getOrderDAO() {
		return _dao;
	}
	
	public OrderDTO selectOrderClient() {
		
	}
	
	
	public OrderDTO insertOrderClient() {
		
	}
	
}
