package javatraining;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/validate")
public class Validate extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
    public Validate() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
response.setContentType("text/html");
		
		
		String username = request.getParameter("username");
		String Password = request.getParameter("Password");
		

		if(username.equals("Pratiksha") && Password.equals("p123")) {
			

			RequestDispatcher dispatcher = request.getRequestDispatcher("login");
			

			dispatcher.forward(request, response);
		}
		else {
			response.getWriter().println("Invalid username or password!!!");

			RequestDispatcher dispatcher = request.getRequestDispatcher("/index.html");
			
			dispatcher.include(request, response);
		doGet(request, response);
	}

}}
