package xyz.itwill.thread;

//은행계좌를 사용할수 있는 사용자 정보(은행계좌정보, 사용자명) 저장

public class AccountUser {
	//생성자 또는 Setter 메소드로 필드에 객체 저장하여 포함관계 완성
	private Account account;
	private String username;
	
	public AccountUser() {
		// TODO Auto-generated constructor stub
	}

	
	public AccountUser(Account account, String username) {
		super();
		this.account = account;
		this.username = username;
	}

	
	public Account getAccount() {
		return account;
	}

	
	public void setAccount(Account account) {
		this.account = account;
	}

	
	public String getUsername() {
		return username;
	}

	
	public void setUsername(String username) {
		this.username = username;
	}
	
}
