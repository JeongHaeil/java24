package xyz.itwill.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import xyz.itwill.dto.OrdDTO;

public class OrdDAO extends JdbcDAO {
    private static OrdDAO _dao;

    static {
        _dao = new OrdDAO();
    }

    public static OrdDAO getOrdDAO() {
        return _dao;
    }

    public void insertOrder(OrdDTO order) {
        Connection con = null;
        PreparedStatement pstmt = null;

        try {
            con = getConnection();
            String sql = "INSERT INTO orders (ord_client_num, ord_time, ord_date, ord_product_num, ord_status, ord_receiver, ord_zipcode, ord_address1, ord_address2, ord_mobile, ord_count) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, order.getOrdClientNum());
            pstmt.setString(2, order.getOrdTime());
            pstmt.setString(3, order.getOrdDate());
            pstmt.setInt(4, order.getOrdProductNum());
            pstmt.setInt(5, order.getOrdStatus());
            pstmt.setString(6, order.getOrdReceiver());
            pstmt.setString(7, order.getOrdZipcode());
            pstmt.setString(8, order.getOrdAddress1());
            pstmt.setString(9, order.getOrdAddress2());
            pstmt.setString(10, order.getOrdMobile());
            pstmt.setString(11, order.getOrdCount());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("[에러] insertOrder() 메서드의 SQL 오류 = " + e.getMessage());
        } finally {
            close(con, pstmt);
        }
    }
}
