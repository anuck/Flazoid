package isi.exo.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import isi.exo.Action.productAction;
import isi.exo.entity.productentity;

/**
 * Servlet implementation class ProductServlet
 */
@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		ArrayList<productentity> listOfProducts = null;
		
		
		
		String category =request.getParameter("category");
		if(category!=null)
		{
		
			 listOfProducts = productAction.getAllListOfProductByCategory(category);
			request.setAttribute("productlist", listOfProducts);
			request.getRequestDispatcher("home.jsp").forward(request, response);
				
		}
		else
		{
		    listOfProducts = productAction.getAllListOfProduct();
			request.setAttribute("productlist", listOfProducts);
			request.getRequestDispatcher("home.jsp").forward(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		doGet(request, response);
	}

}
