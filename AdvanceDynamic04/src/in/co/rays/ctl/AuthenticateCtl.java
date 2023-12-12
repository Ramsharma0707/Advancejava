package in.co.rays.ctl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.rays.bean.UserBean;
import in.co.rays.model.UserModel;

@WebServlet("/AuthenticateCtl")
public class AuthenticateCtl extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.sendRedirect("Authenticate.jsp");
		String loginid=req.getParameter("loginId");
		String password=req.getParameter("password");
		
		UserBean bean= new UserBean();
		bean.setLogin_id(loginid);
		bean.setPassword(password);
		
		UserModel model=new UserModel();
		try {
			model.authenticate(loginid, password);
			
			if(bean!=null) {
			
		//	System.out.print(" "+bean.getId());
		//	System.out.print( "\t"+bean.getFirst_name());
		//	System.out.print("\t"+bean.getLast_name());
			System.out.print("\t"+bean.getLogin_id());
			System.out.print("\t"+bean.getPassword());
		//	System.out.print("\t"+bean.getDob());
		//	System.out.println(bean.getAddress());
			
			
			
			
		}
			
			
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
		
		
	}
  @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
}
}
