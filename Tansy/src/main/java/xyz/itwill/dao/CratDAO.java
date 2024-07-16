package xyz.itwill.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import xyz.itwill.dto.CratDTO;

public class CratDAO extends JdbcDAO {
	private static CratDAO _dao;
	
	
	static {
		_dao=new CratDAO();
	}
	
	public static CratDAO getCratDAO() {
		return _dao;
	}
	
	
	public CratDTO selectCratClient (int num) {
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		CratDTO crat=null;
		
		try {
			con=getConnection();
			
			String sql="select cart_num,cart_client_num,cart_product_num from cart where cart_client=?";
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				crat=new CratDTO();
			}
			
			
		}catch(SQLException e) {
			e.getMessage();
		}finally {
			close(con, pstmt, rs);
		}
		return crat;
		
	}
	
	
	
	
	
	
}
