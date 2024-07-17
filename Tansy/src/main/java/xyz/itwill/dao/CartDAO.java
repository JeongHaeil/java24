package xyz.itwill.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import xyz.itwill.dto.CartDTO;
import xyz.itwill.dto.OrderDTO;

public class CartDAO extends JdbcDAO {
	private static CartDAO _dao;

	static {
		_dao = new CartDAO();
	}

	public static CartDAO getCratDAO() {
		return _dao;
	}

	public CartDTO selectCratClient(int num) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		CartDTO crat = null;

		try {
			con = getConnection();

			String sql = "select cart_num, cart_client_num, cart_product_num, cart_count, cart_sum  from cart where cart_client_num=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				crat = new CartDTO();
				crat.setCartNum(rs.getInt("cart_num"));
				crat.setCartClientNum(rs.getInt("cart_client_num"));
				crat.setCartProductNum(rs.getInt("cart_product_num"));
				crat.setCartCount(rs.getInt("cart_count"));
				crat.setCartSum(rs.getInt("cart_sum"));
			}

		} catch (SQLException e) {
			e.getMessage();
		} finally {
			close(con, pstmt, rs);
		}
		return crat;

	}

	public void addCart(CartDTO cart) {
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = getConnection();

			String sql = "insert into cart (cart_client_num, cart_product_num, cart_count) values (?, ?, ?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, cart.getCartClientNum());
			pstmt.setInt(2, cart.getCartProductNum());
			pstmt.setInt(3, cart.getCartCount());

			pstmt.executeUpdate();

		} catch (SQLException e) {
			System.out.println("[에러] addCart() 메서드의 SQL 오류 = " + e.getMessage());
		} finally {
			close(con, pstmt);
		}
	}
}
