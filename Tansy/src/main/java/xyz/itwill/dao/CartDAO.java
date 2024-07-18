package xyz.itwill.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import xyz.itwill.dto.CartDTO;

public class CartDAO extends JdbcDAO {
    private static CartDAO _dao;

    static {
        _dao = new CartDAO();
    }

    public static CartDAO getCratDAO() {
        return _dao;
    }

    public List<CartDTO> selectCartClient(int num) {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        List<CartDTO> cartList = new ArrayList<>();

        try {
            con = getConnection();

            String sql = "select cart_num, cart_client_num, cart_product_num, cart_count from cart where cart_client_num=?";
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, num);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                CartDTO cart = new CartDTO();
                cart.setCartNum(rs.getInt("cart_num"));
                cart.setCartClientNum(rs.getInt("cart_client_num"));
                cart.setCartProductNum(rs.getInt("cart_product_num"));
                cart.setCartCount(rs.getInt("cart_count"));
                
                cartList.add(cart);
            }

        } catch (SQLException e) {
            System.out.println("[에러] selectCartClient() 메서드의 SQL 오류 = " + e.getMessage());
        } finally {
            close(con, pstmt, rs);
        }
        return cartList;
    }
}
