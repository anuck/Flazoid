package isi.exo.manager;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import isi.exo.entity.productentity;

public class sessionManager {
	public static void  add(HttpServletRequest req , Map<Integer, productentity> hasmap_product) {
		HttpSession session = req.getSession();
		session.setAttribute("productsession", hasmap_product);
		
	}
	
	public static void  removeById(HttpServletRequest req , String id) {
		HttpSession session = req.getSession();
		if(session.getAttribute(id) != null) {
			session.removeAttribute(id);
		}
	
	}
	
	public static ArrayList<productentity> getProductListFromSession(HttpServletRequest req){
		ArrayList<productentity> listToReturn = new ArrayList<productentity>();
		
		HttpSession session = req.getSession();
		
		Enumeration<String> listOfAttributeSession =  session.getAttributeNames();
		
		if(listOfAttributeSession != null) {
			
			while(listOfAttributeSession.hasMoreElements()) {
				String key = listOfAttributeSession.nextElement();
				productentity s = (productentity)session.getAttribute(key);
				
				listToReturn.add(s);
			}
		}
		
		return listToReturn;
		
	}
	

}
