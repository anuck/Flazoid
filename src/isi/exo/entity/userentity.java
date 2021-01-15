package isi.exo.entity;

public class userentity {
	public userentity() {
		super();
	}

	private int userID;
	private String emailID;
	private String passWord;
	private String firstName;
	private String lastName;
	
	
	public userentity(int userID, String emailID, String passWord, String firstName, String lastName) {
		super();
		this.userID = userID;
		this.emailID = emailID;
		this.passWord = passWord;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
	
	
}
