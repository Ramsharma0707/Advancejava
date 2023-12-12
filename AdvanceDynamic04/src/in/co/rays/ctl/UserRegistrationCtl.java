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

@WebServlet("/UserRegistrationCtl")
public class UserRegistrationCtl  extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      //SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		
	 String f_name=req.getParameter("firstName");
	 String l_name=req.getParameter("lastName");
	 String login_id=req.getParameter("loginId");
	 String password=req.getParameter("pass");
	 String Dob=req.getParameter("dob");
	 String Address=req.getParameter("address");
	 
//	 System.out.println(f_name);
//	 System.out.println(l_name);
//	 System.out.println(login_id);
//	 System.out.println(password);
//	 System.out.println(Dob);
//	 System.out.println(Address);
	 
	 
	 UserBean bean= new UserBean();
	 bean.setFirst_name(f_name);
	 bean.setLast_name(l_name);
	 bean.setLogin_id(login_id);
	 bean.setPassword(password);
	 bean.setDob(DataUtility.stringToDate(Dob));
	 bean.setAddress(Address);
	
	 
	 UserModel model= new UserModel();
	 try {
		model.add(bean);
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	resp.sendRedirect("UserRegistrationView.jsp");	
	}

}
