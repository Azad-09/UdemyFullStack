package org.easy;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MemberAreaController
 */
@WebServlet("/MemberAreaController")
public class MemberAreaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberAreaController() {
        super();
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
		String action = request.getParameter("action");
		
		if(action.equals("destroy")) {
			Cookie[] cookies = request.getCookies();
			if(cookies != null) {
				for(Cookie cookie : cookies) {
					if(cookie.getValue().equals("user")) {
						request.getSession().invalidate();
						cookie.setValue(null);
						cookie.setMaxAge(0);
						response.addCookie(cookie);
						
					}
					
					if(cookie.getValue().equals("pass")) {
						request.getSession().invalidate();
						cookie.setValue(null);
						cookie.setMaxAge(0);
						response.addCookie(cookie);
					}
					
					
				}
			}
			response.sendRedirect("login.jsp");
		}
			
		
		}
	}


