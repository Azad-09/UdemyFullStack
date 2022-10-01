package org.easy.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Controller() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out  = response.getWriter();
		out.print("Name: " + request.getParameter("name"));
		out.print("\n");
		out.print("Gender: " + request.getParameter("gender"));
		out.print("\n");
		out.print("Language Known: ");
		String[] lang = request.getParameterValues("language");
		if(lang != null) {
			for(int i =0; i< lang.length; i++) {
				out.print(lang[i] + " ");
			}
		}else {
			out.print("None Selected");
		}
		out.print("\n");
		out.print("Country: " + request.getParameter("country"));
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().print(request.getParameter("name"));
	}

}
