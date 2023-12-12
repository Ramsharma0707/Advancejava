package in.co.rays.test;

import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;

import in.co.rays.bean.UserBean;
import in.co.rays.model.UserModel;

public class TestUser {
	public static void main(String[] args) throws Exception {
		testAdd();
	//	testUpdate();
	//	testDelete();
	//	testfindByPk();
	//	testAuthenticate();
	//	testSearch();
	}


		private static void testSearch() throws Exception {
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			UserBean bean = new UserBean();
			bean.setDob(sdf.parse("2000-01-22"));
	    
			UserModel model = new UserModel();
			List list = model.Search(bean);

			Iterator it = list.iterator();
			while (it.hasNext()) {
			bean = (UserBean)it.next();

			System.out.print(bean.getId());
			System.out.print("\t"+bean.getFirst_name());
			System.out.print("\t"+bean.getLast_name());
			System.out.print("\t"+bean.getLogin_id());
			System.out.print("\t"+bean.getPassword());
			System.out.print("\t"+bean.getDob());
			System.out.println("\t"+bean.getAddress());
		}
		}
		
	




     private static void testfindByPk() throws Exception {
		UserModel model=new UserModel();
		
		UserBean bean=model.findByPk(3);
		if (bean!=null) {
			System.out.println(bean.getId());
			System.out.println(bean.getFirst_name());
			System.out.println(bean.getLast_name());
			System.out.println(bean.getLogin_id());
			System.out.println(bean.getPassword());
			System.out.println(bean.getDob());
			System.out.println(bean.getAddress());
		}else {
			System.out.println("id not found.........");
		}
		
	}


	private static void testAdd() throws Exception {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		
		UserBean bean=new UserBean();
		UserModel model=new UserModel();
		 bean.setId(7);
		 bean.setFirst_name("Sachin");
		 bean.setLast_name("Rathore");
		 bean.setLogin_id("sachin@gmail.com");
		 bean.setPassword("12345");
		 bean.setDob(sdf.parse("12-11-1999"));
		 bean.setAddress("pune");
		 model.add(bean);
	}
	private static void testUpdate() throws Exception {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		UserBean bean=new UserBean();
		bean.setId(7);
		bean.setFirst_name("Rachin");
		bean.setLast_name("ravindra");
		bean.setLogin_id("rachin@gmail.com");
		bean.setPassword("123");
		bean.setDob(sdf.parse("13-11-2000"));
		bean.setAddress("maharastra");

		UserModel model=new UserModel();

		model.update(bean);
		
	}
	
    private static void testDelete() throws Exception {
		UserModel model=new UserModel();
		model.delete(6);
		
		}	
	
	private static void testAuthenticate() throws Exception {
		UserModel model=new UserModel();
		UserBean bean=model.authenticate("lavi@gmail.com", "101");
		
		if(bean!=null) {
		System.out.print(" "+bean.getId());
		System.out.print( "\t"+bean.getFirst_name());
		System.out.print("\t"+bean.getLast_name());
		System.out.print("\t"+bean.getLogin_id());
		System.out.print("\t"+bean.getPassword());
		System.out.print("\t"+bean.getDob());
		System.out.println(bean.getAddress());
		
		
		
		
	}


		
	
}
}