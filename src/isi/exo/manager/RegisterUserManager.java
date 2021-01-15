package isi.exo.manager;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import isi.exo.entity.userentity;
import isi.exo.service.DBConnectionService;

public class RegisterUserManager {
	static String sqlstatement ="insert into user_login(first_name,last_name,email,password) values(?,?,?,?)";
	public static void addUser(String fname, String lname,String email,String password)
	{
		userentity userobj= new userentity(0,email,password,fname,lname);
	
		PreparedStatement ps = DBConnectionService.getPreparedStatement(sqlstatement);
		try {
			ps.setString(1, userobj.getFirstName());
			ps.setString(2, userobj.getLastName());
			ps.setString(3, userobj.getEmailID());
			ps.setString(4, userobj.getPassWord());
			ps.executeUpdate(); 
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
 
	}

}
