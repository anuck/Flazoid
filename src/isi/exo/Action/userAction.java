package isi.exo.Action;

import java.util.ArrayList;

import isi.exo.entity.userentity;
import isi.exo.manager.userManager;

public class userAction {

	public static ArrayList<userentity> getListOfAllUsers()
	{
		return userManager.getAllUser();
	}
	
	public static ArrayList<userentity>  getListOfAllUsersByEmailId(String email)
	{
		return userManager.getUserByEmailId(email);
	}
	
}
