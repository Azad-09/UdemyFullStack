package org.easy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.easy.model.Person;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public Controller() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Person> staff = new ArrayList<Person>();
		staff.add(new Person("Radheya", 36));
		staff.add(new Person("Kounteya", 33));
		
		request.setAttribute("staff", staff);
		request.getRequestDispatcher("view.jsp").forward(request, response);
	}


}
