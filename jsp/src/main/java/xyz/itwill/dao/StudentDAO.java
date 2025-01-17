package xyz.itwill.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import xyz.itwill.dto.StudentDTO;

//STUDENT 테이블 행을 삽입, 변경 삭제 검색하는 기능을 제공하는 DAO
public class StudentDAO extends JdbcDAO {
	private static StudentDAO _dao;

	public StudentDAO() {
		// TODO Auto-generated constructor stub
	}

	static {
		_dao = new StudentDAO();
	}

	public static StudentDAO getDAO() {
		return _dao;
	}

	// 학생정보(StudentDTO) 를 전달받아 STUDENT 테이블의 행으로 삽입하고 삽입행의 갯수를 반환하는 메소드
	public int insertStudent(StudentDTO student) {
		Connection con = null;
		PreparedStatement pstmt = null;
		int rows = 0;
		try {
			con = getConnection();
			String sql = "insert into student values (?,?,?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, student.getNo());
			pstmt.setString(2, student.getName());
			pstmt.setString(3, student.getPhone());
			pstmt.setString(4, student.getAdress());
			pstmt.setString(5, student.getBirthday());

			rows = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.getMessage();
		} finally {
			close(con, pstmt);
		}
		return rows;
	}

	// 학생정보(StudentDTO) 를 전달받아 STUDENT 테이블의 저장된 행을 변경하고 변경행의 갯수를 반환하는 메소드
	public int updateStudent(StudentDTO student) {
		Connection con = null;
		PreparedStatement pstmt = null;
		int rows = 0;
		try {
			con = getConnection();
			String sql = "update student set name=?,phone=?,address=?,birthday=? where no=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, student.getName());
			pstmt.setString(2, student.getPhone());
			pstmt.setString(3, student.getAdress());
			pstmt.setString(4, student.getBirthday());
			pstmt.setInt(5, student.getNo());

			rows = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.getMessage();
		} finally {
			close(con, pstmt);
		}
		return rows;
	}

	// 학번(int)을 전달받아 STUDENT 테이블의 저장된 행을 삭제하고 삭제행의 갯수(int) 를 반환하는 메소드
	public int deleteStudent(int no) {
		Connection con = null;
		PreparedStatement pstmt = null;
		int rows = 0;
		try {
			con = getConnection();
			String sql= "delete from student where no=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1,no);
		} catch (SQLException e) {
			e.getMessage();
		} finally {
			close(con, pstmt);
		}
		return rows;
	}

	// 학번(int)을 전달받아 STUDENT 테이블의 저장된 행을 검색하고 검색된 학생정(StudentDTO)을 반환하는 메소드
	public StudentDTO selectStudent(int no) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		StudentDTO student = null;

		try {
			con = getConnection();
			String sql = "select no,name,phone,address,birthday from student where no=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, no);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				student = new StudentDTO();
				student.setNo(rs.getInt("no"));
				student.setName(rs.getString("name"));
				student.setPhone(rs.getString("phone"));
				student.setAdress(rs.getString("adress"));
				student.setBirthday(rs.getString("birthday"));
			}

		} catch (SQLException e) {
			e.getMessage();
		} finally {
			close(con, pstmt, rs);
		}
		return student;
	}

	// STDUENT 테이블에 저장된 모든 행을 검색하고 검색된 학생정보(List 객체) 들을 반환하는 메소드
	public List<StudentDTO> selectStList() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		List<StudentDTO> studentList = new ArrayList<StudentDTO>();
		try {
			con = getConnection();
			String sql = "select no,name,phone,address,birthday from student order by no";
			pstmt = con.prepareStatement(sql);
			
			rs = pstmt.executeQuery();

			while (rs.next()) {
				StudentDTO student = new StudentDTO();
				student.setNo(rs.getInt("no"));
				student.setName(rs.getString("name"));
				student.setPhone(rs.getString("phone"));
				student.setAdress(rs.getString("address"));
				student.setBirthday(rs.getString("birthday"));
				
				
				studentList.add(student);
			}

		} catch (SQLException e) {
			e.getMessage();
		} finally {
			close(con, pstmt, rs);
		}
		return studentList;
	}

}
