package xyz.itwill.dto;

/*
review_num number primary key, review_member_num number constraint 
review_member_num_fk references member(member_num), review_subject VARCHAR2(500)
, review_content VARCHAR2(4000), review_image VARCHAR2(100), review_register_date date
, review_update_date date,review_ip VARCHAR2(20), review_count number, review_ref number, review_restep number
, review_relevel number ,review_status number(1));

 */

/* 
이름                   널?       유형             
-------------------- -------- -------------- 
REVIEW_NUM           NOT NULL NUMBER         - 글번호
REVIEW_MEMBER_NUM             NUMBER         - 작성자 : 로그인 사용자의 회원번호
REVIEW_SUBJECT                VARCHAR2(500)  - 제목
REVIEW_CONTENT                VARCHAR2(4000) - 내용
REVIEW_IMAGE                  VARCHAR2(100)  - 이미지 파일의 이름
REVIEW_REGISTER_DATE          DATE           - 작성날짜
REVIEW_UPDATE_DATE            DATE           - 변경날짜
REVIEW_IP                     VARCHAR2(20)   - 클라이언트 IP 주소
REVIEW_COUNT                  NUMBER         - 조회수
REVIEW_REF                    NUMBER         - 답글 : 그룹번호
REVIEW_RESTEP                 NUMBER         - 답글 : 글순서
REVIEW_RELEVEL                NUMBER         - 답글 : 글 깊이
REVIEW_STATUS                 NUMBER(1)      - 글상태 : 0 (삭제), 1 ( 일반글), 2(비밀글)
*/

public class ReviewDTO {
	private int reviewNum;
	private int reviewMemberNum;
	private String reviewSubject;
	private String reviewContent;
	private String reviewImage;
	private String reviewRegisterDate;
	private String reviewUpdateDate;
	private String reviewIp;
	private int reviewCount;
	private int reviewRef;
	private int reviewRestep;
	private int reviewRelevel;
	private int reviewStatus;
	
	public ReviewDTO() {
		// TODO Auto-generated constructor stub
	}

	public ReviewDTO(int reviewNum, int reviewMemberNum, String reviewSubject, String reviewContent, String reviewImage,
			String reviewRegisterDate, String reviewUpdateDate, String reviewIp, int reviewCount, int reviewRef,
			int reviewRestep, int reviewRelevel, int reviewStatus) {
		
		this.reviewNum = reviewNum;
		this.reviewMemberNum = reviewMemberNum;
		this.reviewSubject = reviewSubject;
		this.reviewContent = reviewContent;
		this.reviewImage = reviewImage;
		this.reviewRegisterDate = reviewRegisterDate;
		this.reviewUpdateDate = reviewUpdateDate;
		this.reviewIp = reviewIp;
		this.reviewCount = reviewCount;
		this.reviewRef = reviewRef;
		this.reviewRestep = reviewRestep;
		this.reviewRelevel = reviewRelevel;
		this.reviewStatus = reviewStatus;
	}

	public int getReviewNum() {
		return reviewNum;
	}

	public void setReviewNum(int reviewNum) {
		this.reviewNum = reviewNum;
	}

	public int getReviewMemberNum() {
		return reviewMemberNum;
	}

	public void setReviewMemberNum(int reviewMemberNum) {
		this.reviewMemberNum = reviewMemberNum;
	}

	public String getReviewSubject() {
		return reviewSubject;
	}

	public void setReviewSubject(String reviewSubject) {
		this.reviewSubject = reviewSubject;
	}

	public String getReviewContent() {
		return reviewContent;
	}

	public void setReviewContent(String reviewContent) {
		this.reviewContent = reviewContent;
	}

	public String getReviewImage() {
		return reviewImage;
	}

	public void setReviewImage(String reviewImage) {
		this.reviewImage = reviewImage;
	}

	public String getReviewRegisterDate() {
		return reviewRegisterDate;
	}

	public void setReviewRegisterDate(String reviewRegisterDate) {
		this.reviewRegisterDate = reviewRegisterDate;
	}

	public String getReviewUpdateDate() {
		return reviewUpdateDate;
	}

	public void setReviewUpdateDate(String reviewUpdateDate) {
		this.reviewUpdateDate = reviewUpdateDate;
	}

	public String getReviewIp() {
		return reviewIp;
	}

	public void setReviewIp(String reviewIp) {
		this.reviewIp = reviewIp;
	}

	public int getReviewCount() {
		return reviewCount;
	}

	public void setReviewCount(int reviewCount) {
		this.reviewCount = reviewCount;
	}

	public int getReviewRef() {
		return reviewRef;
	}

	public void setReviewRef(int reviewRef) {
		this.reviewRef = reviewRef;
	}

	public int getReviewRestep() {
		return reviewRestep;
	}

	public void setReviewRestep(int reviewRestep) {
		this.reviewRestep = reviewRestep;
	}

	public int getReviewRelevel() {
		return reviewRelevel;
	}

	public void setReviewRelevel(int reviewRelevel) {
		this.reviewRelevel = reviewRelevel;
	}

	public int getReviewStatus() {
		return reviewStatus;
	}

	public void setReviewStatus(int reviewStatus) {
		this.reviewStatus = reviewStatus;
	}
	
}
