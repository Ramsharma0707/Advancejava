package in.co.rays.ctl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.rays.bean.UserBean;
import in.co.rays.model.UserModel;
import in.co.rays.util.DataUtility;

@WebServlet("/QueryString")
public class QueryString extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	String fname =req.getParameter("firstname");

	String lname =req.getParameter("lastName");
	String[] address=req.getParameterValues("address");
	
	System.out.println("first servlet doget");
	System.out.println(fname);
	System.out.println(lname);
	System.out.println(address[0]);
	//System.out.println(address[1]);
	//resp.sendRedirect("SecondServlet");
		
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String fname =req.getParameter("firstName");

		String lname =req.getParameter("lastName");
		String[] address=req.getParameterValues("address");
		System.out.println("first servlet dopost");
		System.out.println(fname);
		System.out.println(lname);
		System.out.println(address[0]);
		//System.out.println(address[1]);
		resp.sendRedirect("SecondServlet");
		
	}
	
}

      
		


