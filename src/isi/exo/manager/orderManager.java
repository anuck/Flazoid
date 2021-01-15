package isi.exo.manager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import isi.exo.entity.orderentity;
import isi.exo.entity.userentity;
import isi.exo.service.DBConnectionService;

public class orderManager {
private static String getAllOrder="select * from  orderinfo";
static String sqlstatement ="insert into orders(product_id,user_id,quantity) values(?,?,?)";
public static void addOrder(int pro_id, int user_id,int quantity)
{
	orderentity orderobj= new orderentity(1,pro_id,user_id,quantity);
	PreparedStatement ps = DBConnectionService.getPreparedStatement(sqlstatement);
	try {
		ps.setInt(1, orderobj.getProductId());
		ps.setInt(2, orderobj.getUserid());
		ps.setInt(3, orderobj.getQuantity());
		
		ps.executeUpdate(); 
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
			

}
	
	
	public static ArrayList<orderentity> getaAllOrder()
	{
		ArrayList<orderentity> orderList = new ArrayList<orderentity>();
		try
		{
			Statement statement =DBConnectionService.getStatementObject();
			ResultSet rs=statement.executeQuery(getAllOrder);
			
			while(rs.next()) {
				orderentity order = new orderentity(
						rs.getInt("orderId"),
						rs.getInt("productId"),
						rs.getInt("quantity"),
						rs.getInt("userid"));
				
				orderList.add(order);
				
			 }
			
		}
		
	 catch (SQLException e) {
		e.printStackTrace();
	}
		return orderList;
	}


}
