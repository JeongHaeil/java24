package xyz.itwill.dto;

public class NoticeDTO {
	private int noticeNum;
	private String noticeTitle;
	private String noticeImage;
	private String noticeDate;
	private String noticeUpdate;
	private int noticeCount;
	private int noticeClientNum;
	private int noticeStatus;
	
	
	public NoticeDTO() {
		// TODO Auto-generated constructor stub
	}


	public int getNoticeNum() {
		return noticeNum;
	}


	public void setNoticeNum(int noticeNum) {
		this.noticeNum = noticeNum;
	}


	public String getNoticeTitle() {
		return noticeTitle;
	}


	public void setNoticeTitle(String noticeTitle) {
		this.noticeTitle = noticeTitle;
	}


	public String getNoticeImage() {
		return noticeImage;
	}


	public void setNoticeImage(String noticeImage) {
		this.noticeImage = noticeImage;
	}


	public String getNoticeDate() {
		return noticeDate;
	}


	public void setNoticeDate(String noticeDate) {
		this.noticeDate = noticeDate;
	}


	public String getNoticeUpdate() {
		return noticeUpdate;
	}


	public void setNoticeUpdate(String noticeUpdate) {
		this.noticeUpdate = noticeUpdate;
	}


	public int getNoticeCount() {
		return noticeCount;
	}


	public void setNoticeCount(int noticeCount) {
		this.noticeCount = noticeCount;
	}


	public int getNoticeClientNum() {
		return noticeClientNum;
	}


	public void setNoticeClientNum(int noticeClientNum) {
		this.noticeClientNum = noticeClientNum;
	}


	public int getNoticeStatus() {
		return noticeStatus;
	}


	public void setNoticeStatus(int noticeStatus) {
		this.noticeStatus = noticeStatus;
	}


	public NoticeDTO(int noticeNum, String noticeTitle, String noticeImage, String noticeDate, String noticeUpdate,
			int noticeCount, int noticeClientNum, int noticeStatus) {
		super();
		this.noticeNum = noticeNum;
		this.noticeTitle = noticeTitle;
		this.noticeImage = noticeImage;
		this.noticeDate = noticeDate;
		this.noticeUpdate = noticeUpdate;
		this.noticeCount = noticeCount;
		this.noticeClientNum = noticeClientNum;
		this.noticeStatus = noticeStatus;
	}
	
	
}
