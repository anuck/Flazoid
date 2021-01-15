package isi.exo.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;



public class DBConnectionService {
	private static String urlConnection ="jdbc:mysql://localhost:3306/dbshopping";
	private static String login = "root";
	private static String password = "admin";
	private static Connection dbConnection = null;
	
	public static Connection getDBConnection() throws ClassNotFoundException, SQLException {
		if(dbConnection== null) {
			Class.forName("com.mysql.cj.jdbc.Driver");
			dbConnection = DriverManager.getConnection(urlConnection, login, password);
		}
		
		return dbConnection;
	}
	
public static Statement getStatementObject() {
		
		try {
			return  getDBConnection().createStatement();
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		return null;
	}
	
	
	public static PreparedStatement getPreparedStatement(String statement) {
		PreparedStatement ps = null;
		 try {
			ps = getDBConnection().prepareStatement(statement);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
				
		return ps;
		
	}
	
	public static void closeDBConnection() {
		
		try {
			getDBConnection().close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
