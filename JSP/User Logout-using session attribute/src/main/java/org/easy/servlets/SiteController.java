package org.easy.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SiteController
 */
@WebServlet("/SiteController")
public class SiteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SiteController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		
		switch (action) {
		case "Login":
	
				request.getRequestDispatcher("login.jsp").forward(request, response);
			break;

		default:
			break;
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		switch (action) {
		case "LoginSubmit":
			authenticate(request, response);
			break;

		default:
			break;
		}
	}
	
	public void authenticate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String username = request.getParameter("username");
		String pass = request.getParameter("password");
		
		//validate
		if(username.equals("radhe") && pass.equals("radhe@123")) {
			request.getSession().invalidate();
			
			HttpSession newSession1 = request.getSession(true);
			HttpSession newSession2 = request.getSession(true);
			newSession1.setMaxInactiveInterval(200);
			newSession2.setMaxInactiveInterval(200);
			
			// Using Session attribute
			newSession1.setAttribute("username", username);
			newSession2.setAttribute("pass", pass);
		
			String encode = response.encodeUrl(request.getContextPath());
			response.sendRedirect(encode+"/MemberAreaController?action=memberArea");
					
		}else {
			response.sendRedirect(request.getContextPath()+"/SiteController?action=Login");
		}
	}

}
