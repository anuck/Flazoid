package isi.exo.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import isi.exo.Action.productAction;
import isi.exo.entity.productentity;


/**
 * Servlet implementation class CartServlet
 */
@WebServlet("/CartServlet")
public class CartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    static Map<Integer,productentity> hasmap_product = new HashMap<Integer,productentity>();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CartServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession session = request.getSession();
		String action = (String) request.getParameter("action");
		switch(action) {
		case "add":
			int product_id= Integer.parseInt(request.getParameter("id"));
			productentity product = productAction.getProductById(product_id);
			hasmap_product.put(product_id, product);
			session.setAttribute("sessionCart",hasmap_product);
			request.getRequestDispatcher("cart.jsp").forward(request, response);
			break;
		case "remove":
			int remove_id= Integer.parseInt(request.getParameter("remove_id"));
			hasmap_product.remove(remove_id);
			response.sendRedirect("home.jsp");
			break;
		default:
			session.setAttribute("sessionCart",hasmap_product);
			request.getRequestDispatcher("cart.jsp").forward(request, response);
		}
		
		
		
		if(action == "remove") {
			
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
