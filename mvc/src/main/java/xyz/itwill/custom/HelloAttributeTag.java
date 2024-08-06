package xyz.itwill.custom;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class HelloAttributeTag extends TagSupport{
	private static final long serialVersionUID = 1L;
	
	//커스텀 태그의 속성값을 저장하기 위한 필드
	// => 커스텀 태그의 속성명과 같은 이름으로 필드 작성
	private String name;
	
	public HelloAttributeTag() {
		
		name="홍길동";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public int doStartTag() throws JspException {
		try {
			if(name.equals("홍길동")){
				pageContext.getOut().println("<h3>관리자 안뇽</h3>");
			}else {
				pageContext.getOut().println("<h3>"+name+" 안뇽</h3>");
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		return SKIP_BODY;
	}
}
