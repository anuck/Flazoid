package isi.exo.entity;

public class productentity {

	public productentity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	private int productID;
	private String name;
	private String category;
	private int quantity;
	private String description;
	private String image;
	
	public productentity(int productID, String name, String category, int quantity, String description, String image) {
		super();
		this.productID = productID;
		this.name = name;
		this.category = category;
		this.quantity = quantity;
		this.description = description;
		this.image = image;
	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	
	
	

}
