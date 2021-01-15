package isi.exo.manager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import isi.exo.entity.userentity;
import isi.exo.service.DBConnectionService;

public class userManager {
	
	private static String getAllUser="select * from  userinfo";
	private static String getUserByEmailId="select from  userinfo where emailID ==";
	
	public static ArrayList<userentity> getAllUser(){
		ArrayList<userentity> userList = new ArrayList<userentity>();
		try
		{
			Statement statement =DBConnectionService.getStatementObject();

			ResultSet rs=statement.executeQuery(getAllUser);

			while(rs.next()) {
				userentity user = new userentity(
						rs.getInt("id"),
						rs.getString("emailID"),
						rs.getString("passWord"),
						rs.getString("firstName"),
						rs.getString("lastName"));

				userList.add(user);

			}

		}
			
		 catch (SQLException e) {
			e.printStackTrace();
		}
		return userList;
	}
	
	
	public static ArrayList<userentity> getUserByEmailId(String email)
	{
		ArrayList<userentity> listOfStudents = new ArrayList<userentity>();
		
		try {
			PreparedStatement ps = DBConnectionService.getPreparedStatement(getUserByEmailId);
			ps.setString(1, email);
			
			
			ResultSet rs = ps.executeQuery();
			 while(rs.next()) {
				 userentity student = new userentity(
							rs.getInt("userID"),
							rs.getString("emailID"),
							rs.getString("passWord"),
							rs.getString("firstName"),
							rs.getString("lastName"));
					
					listOfStudents.add(student);
				 }
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listOfStudents;
}

}
