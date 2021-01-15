package isi.exo.manager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import isi.exo.entity.userentity;
import isi.exo.service.DBConnectionService;

public class loginManager {
	 static String sqlstatement="select * from user_login where email=? and password=?";
public static userentity validateUser(String email,String password)
{
	userentity userobj= new userentity(0,email,password,null,null);
	 userentity user =null;
	
	PreparedStatement ps = DBConnectionService.getPreparedStatement(sqlstatement);
	try {
		
		ps.setString(1, userobj.getEmailID());
		ps.setString(2, userobj.getPassWord());
		ResultSet rs = ps.executeQuery(); 
		 while(rs.next()) {
			 user = new userentity(
					rs.getInt("user_id"),
					rs.getString("email"),
					rs.getString("password"),
						rs.getString("first_name"),
						rs.getString("last_name")
						);
				
			return user;
		 }
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return user;
	
}}
