package in.co.rays.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SecondServletRedirect")
public class SecondServletRedirect extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	String fname =req.getParameter("firstName");

	String lname =req.getParameter("lastName");
	
	System.out.println("Second servlet doget");
	System.out.println(fname);
	System.out.println(lname);
		
	
		
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String fname =req.getParameter("firstName");

		String lname =req.getParameter("lastName");
		
		System.out.println("second servlet dopost");
		System.out.println(fname);
		System.out.println(lname);

	
	
}
}