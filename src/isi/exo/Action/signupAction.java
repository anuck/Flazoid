package isi.exo.Action;


import isi.exo.manager.RegisterUserManager;

public class signupAction {

	public signupAction() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static void addUserInfo(String fname, String lname,String email,String password)
	{
		RegisterUserManager.addUser(fname, lname, email, password);
	}
	
	
}
