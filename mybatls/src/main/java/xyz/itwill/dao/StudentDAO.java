package xyz.itwill.dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.tomcat.util.file.ConfigurationSource.Resource;

import xyz.itwill.dto.StudentDTO;

public class StudentDAO {
	private static StudentDAO _dao;
	
	public StudentDAO() {
		// TODO Auto-generated constructor stub
	}
	
	static {
		_dao=new StudentDAO();
	}
	
	public static StudentDAO getDAO() {
		return _dao;
	}
	
	private SqlSessionFactory getSqlSessionFactory() {
		//String resource="xyz/itwill/config/mybatis-config.xml"
		String resource="mybatis-config.xml";
		
		InputStream in=null;
		try {
			in=Resources.getResourceAsStream(resource);
		}catch(IOException e) {
			throw new IllegalArgumentException(e);
		}
		return new SqlSessionFactoryBuilder().build(in);
	}
	
	public List<StudentDTO> selectStudentList(){
		
		SqlSession sqlSession=getSqlSessionFactory().openSession();
		
		try {
			return sqlSession.selectList("xyz.itwill.mapper.StudentMapper.selectStudentList");
		}finally {
			sqlSession.close();
		}
	}
}
