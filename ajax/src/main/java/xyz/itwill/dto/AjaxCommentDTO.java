package xyz.itwill.dto;

public class AjaxCommentDTO {
	private int num;
	private String writer;
	private String content;
	private String regdate;
	
	public AjaxCommentDTO() {
		// TODO Auto-generated constructor stub
	}

	public AjaxCommentDTO(int num, String writer, String content, String regdate) {
		super();
		this.num = num;
		this.writer = writer;
		this.content = content;
		this.regdate = regdate;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	
}
