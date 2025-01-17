package xyz.itwill.dto;

//create table userinfo(userid VARCHAR2(100) PRIMARY key, password VARCHAR2(100)
//,name VARCHAR2(200), email VARCHAR2(300), auth number(1));

public class UserinfoDTO {
	private String userid;
	private String password;
	private String email;
	private String name;
	private int auth;
	
	public UserinfoDTO() {
		// TODO Auto-generated constructor stub
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAuth() {
		return auth;
	}

	public void setAuth(int auth) {
		this.auth = auth;
	}

	public UserinfoDTO(String userid, String password, String email, String name, int auth) {
		super();
		this.userid = userid;
		this.password = password;
		this.email = email;
		this.name = name;
		this.auth = auth;
	}
	
	
}
