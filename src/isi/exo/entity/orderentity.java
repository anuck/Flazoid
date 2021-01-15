package isi.exo.entity;

public class orderentity {

	public orderentity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	private int orderId;
	private int productId;
	private int quantity;
	private int userid;
	public orderentity(int orderId, int productId, int quantity, int userid) {
		super();
		this.orderId = orderId;
		this.productId = productId;
		this.quantity = quantity;
		this.userid = userid;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	
	

}
