package in.co.rays.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FirstServletForward")
public class FirstServletForward extends HttpServlet{
	
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	String fname =req.getParameter("firstName");

	String lname =req.getParameter("lastName");
	
	System.out.println("first servlet doget");
	System.out.println(fname);
	System.out.println(lname);
		
	
		RequestDispatcher rd=req.getRequestDispatcher("SecondServletForward");
		rd.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String fname =req.getParameter("firstName");

		String lname =req.getParameter("lastName");
		
		System.out.println("first servlet dopost");
		System.out.println(fname);
		System.out.println(lname);
		

		RequestDispatcher rd=req.getRequestDispatcher("SecondServletForward");
		rd.forward(req, resp);

}}
