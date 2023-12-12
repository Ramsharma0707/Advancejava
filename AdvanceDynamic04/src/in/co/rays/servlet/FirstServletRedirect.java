package in.co.rays.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FirstServletRedirect")
public class FirstServletRedirect extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	String fname =req.getParameter("firstName");

	String lname =req.getParameter("lastName");
	
	System.out.println("first servlet doget");
	System.out.println(fname);
	System.out.println(lname);
		
	resp.sendRedirect("SecondServletRedirect");
		
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String fname =req.getParameter("firstName");

		String lname =req.getParameter("lastName");
		
		System.out.println("first servlet dopost");
		System.out.println(fname);
		System.out.println(lname);
		resp.sendRedirect("SecondServletRedirect");
		
	}
	
}
