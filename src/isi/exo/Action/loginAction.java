package isi.exo.Action;

import isi.exo.entity.userentity;
import isi.exo.manager.loginManager;

public class loginAction {
	public static userentity validate(String email, String password)
	{
		return loginManager.validateUser(email, password);
	}
	
	

}
