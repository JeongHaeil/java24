package xyz.itwill.dto;

public class CratDTO {
	private int orderNum;
	private int orderclientNum;
	private String orderTime;
	private String orderDate;
	private int orderproductNum;
	private int orderStatus;
	private int orderSum;
	private String orderReceiver;
	private String orderZipcode;
	private String orderAddress1;
	private String orderAddress2;
	private String orderMobile;
	private String orderCount;
	private String orderEmail;
	
	public CratDTO() {
		// TODO Auto-generated constructor stub
	}

	public CratDTO(int orderNum, int orderclientNum, String orderTime, String orderDate, int orderproductNum,
			int orderStatus, int orderSum, String orderReceiver, String orderZipcode, String orderAddress1,
			String orderAddress2, String orderMobile, String orderCount, String orderEmail) {
		super();
		this.orderNum = orderNum;
		this.orderclientNum = orderclientNum;
		this.orderTime = orderTime;
		this.orderDate = orderDate;
		this.orderproductNum = orderproductNum;
		this.orderStatus = orderStatus;
		this.orderSum = orderSum;
		this.orderReceiver = orderReceiver;
		this.orderZipcode = orderZipcode;
		this.orderAddress1 = orderAddress1;
		this.orderAddress2 = orderAddress2;
		this.orderMobile = orderMobile;
		this.orderCount = orderCount;
		this.orderEmail = orderEmail;
	}

	public int getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}

	public int getOrderclientNum() {
		return orderclientNum;
	}

	public void setOrderclientNum(int orderclientNum) {
		this.orderclientNum = orderclientNum;
	}

	public String getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public int getOrderproductNum() {
		return orderproductNum;
	}

	public void setOrderproductNum(int orderproductNum) {
		this.orderproductNum = orderproductNum;
	}

	public int getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(int orderStatus) {
		this.orderStatus = orderStatus;
	}

	public int getOrderSum() {
		return orderSum;
	}

	public void setOrderSum(int orderSum) {
		this.orderSum = orderSum;
	}

	public String getOrderReceiver() {
		return orderReceiver;
	}

	public void setOrderReceiver(String orderReceiver) {
		this.orderReceiver = orderReceiver;
	}

	public String getOrderZipcode() {
		return orderZipcode;
	}

	public void setOrderZipcode(String orderZipcode) {
		this.orderZipcode = orderZipcode;
	}

	public String getOrderAddress1() {
		return orderAddress1;
	}

	public void setOrderAddress1(String orderAddress1) {
		this.orderAddress1 = orderAddress1;
	}

	public String getOrderAddress2() {
		return orderAddress2;
	}

	public void setOrderAddress2(String orderAddress2) {
		this.orderAddress2 = orderAddress2;
	}

	public String getOrderMobile() {
		return orderMobile;
	}

	public void setOrderMobile(String orderMobile) {
		this.orderMobile = orderMobile;
	}

	public String getOrderCount() {
		return orderCount;
	}

	public void setOrderCount(String orderCount) {
		this.orderCount = orderCount;
	}

	public String getOrderEmail() {
		return orderEmail;
	}

	public void setOrderEmail(String orderEmail) {
		this.orderEmail = orderEmail;
	}
	
	
	
	
	
}
