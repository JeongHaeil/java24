package xyz.itwill.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import xyz.itwill.dto.ProductDTO;

public class ProductDAO extends JdbcDAO {
    public ProductDTO selectProduct(int productNum) {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        ProductDTO product = null;

        try {
            con = getConnection();
            String sql = "SELECT product_num, product_name, product_price FROM product WHERE product_num = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, productNum);
            rs = pstmt.executeQuery();

            if (rs.next()) {
                product = new ProductDTO();
                product.setProductNum(rs.getInt("product_num"));
                product.setProductName(rs.getString("product_name"));
                product.setProductPrice(rs.getInt("product_price"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(con, pstmt, rs);
        }
        return product;
    }
}
