package xyz.itwill.dto;

public class ProductDTO {
	 private int productNum; 
	 private String productName; 
	 private int productPrice; 
	 
	 public ProductDTO() {
		// TODO Auto-generated constructor stub
	}

	public ProductDTO(int productNum, String productName, int productPrice) {
		super();
		this.productNum = productNum;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	public int getProductNum() {
		return productNum;
	}

	public void setProductNum(int productNum) {
		this.productNum = productNum;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	 
	 
}
