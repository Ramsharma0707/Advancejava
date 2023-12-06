package in.co.rays.user;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TestUser {
	public static void main(String[] args) throws Exception {
		// testAdd();
		// findByPk();
		// testAuthenticate();
		// testUpdate();
		// testDelete();
		testSearch();

	}

	private static void testAdd() throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		UserBean bean = new UserBean();
		// bean.setId(1);

		bean.setFirst_name("Lavish");
		bean.setLast_name("ojha");
		bean.setLogin_id("lavish@gmail.com");
		bean.setPassword("123");
		bean.setDob(sdf.parse("2000-01-22"));
		bean.setAddress("Bhopal");
		UserModel model = new UserModel();
		model.add(bean);

	}

	private static void findByPk() throws Exception {
		UserModel model = new UserModel();
		UserBean bean = model.findByPk(2);
		if (bean != null) {
			System.out.println(bean.getId());
			System.out.println(bean.getFirst_name());
			
			System.out.println(bean.getLast_name());
			System.out.println(bean.getLogin_id());
			System.out.println(bean.getPassword());
			System.out.println(bean.getDob());
			System.out.println(bean.getAddress());

		} else {
			System.out.println("id not found.....");
		}
	}

	private static void testAuthenticate() throws Exception {
		UserModel model = new UserModel();
		UserBean bean = model.authenticate("Lavish@gmail.com", "123");
		if (bean != null) {
			System.out.println(bean.getId());
			System.out.println(bean.getFirst_name());
			System.out.println(bean.getLast_name());
			System.out.println(bean.getLogin_id());
			System.out.println(bean.getPassword());
			System.out.println(bean.getDob());
			System.out.println(bean.getAddress());
		}

	}

	private static void testUpdate() throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		UserBean bean = new UserBean();
		bean.setId(3);
		bean.setFirst_name("Rahul");
		bean.setLast_name("kirar");
		bean.setLogin_id("rahul@gmail.com");
		bean.setPassword("12345");
		bean.setDob(sdf.parse("1995-05-05"));
		bean.setAddress("Rajgrah");
		UserModel model = new UserModel();
		model.update(bean);
	}

	private static void testDelete() throws Exception {
		UserModel model = new UserModel();
		model.delete(4);

	}

	private static void testSearch() throws Exception {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		UserBean bean = new UserBean();
		bean.setDob(sdf.parse("2000-01-22"));
    
		UserModel model = new UserModel();
		List list = model.search(bean);

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
}
