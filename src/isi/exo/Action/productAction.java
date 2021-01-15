package isi.exo.Action;

import java.util.ArrayList;

import isi.exo.entity.productentity;
import isi.exo.manager.productManager;

public class productAction {
	
	public static ArrayList<productentity>getAllListOfProduct()
	{
		return productManager.getaAllProduct();
	}
	
	
	public static  ArrayList<productentity>getAllListOfProductByName(String productName)
	{
		return productManager.getProductByName(productName);
		
	}
	public static  ArrayList<productentity>getAllListOfProductByCategory(String productCategory)
	{
		return productManager.getProductByCategory(productCategory);
		
	}
	
	public static  productentity  getProductById(int id)
	{
		return productManager.getProductById(id);
		
	}

}
