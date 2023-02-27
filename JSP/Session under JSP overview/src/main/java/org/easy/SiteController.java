package org.easy;

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
     * Default constructor. 
     */
    public SiteController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String pass = request.getParameter("password");
		
		//validate
		if(username.equals("radhe") && pass.equals("radhe@123")) {
			request.getSession().invalidate();
			
			HttpSession newSession = request.getSession(true);
			newSession.setMaxInactiveInterval(200);
			
			//With quotes will be the name of Cookie and without quote will be the value which we request from server
			Cookie cUser = new Cookie("user", username);
			Cookie cPass = new Cookie("pass", pass); 
			response.addCookie(cPass);
			response.addCookie(cUser);
			
			response.sendRedirect("members.jsp");
					
		}else {
			response.sendRedirect("login.jsp");
		}
	}

}
