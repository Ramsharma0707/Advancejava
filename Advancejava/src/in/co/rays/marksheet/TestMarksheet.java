package in.co.rays.marksheet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Iterator;
import java.util.List;

public class TestMarksheet {
	public static void main(String[] args) throws Exception {
		testAdd();
		//testUpdate();
		//testDelete();
		//testSearch();
		//testFindByPk();
	}





	private static void testAdd() throws Exception {
		MarksheetBean bean= new MarksheetBean();
	//	bean.setId(15);
		bean.setName("Harri");
		bean.setRoll_no(120);
		bean.setPhysics(77);
		bean.setChemistry(66);
		bean.setMaths(77);
		
		MarksheetModel model=new MarksheetModel();
		model.add(bean);
		
	
		
	}


private static void testUpdate() throws Exception {
	MarksheetBean bean= new MarksheetBean();
	bean.setId(11);
	bean.setName("hit");
	bean.setRoll_no(117);
	bean.setPhysics(12);
	bean.setChemistry(65);
	bean.setMaths(35);
	MarksheetModel model=new MarksheetModel();
	model.update(bean);
	
}
   private static void testDelete() throws Exception {
	MarksheetModel model=new MarksheetModel();
	model.delete(11);
		
}  
 

   private static void testSearch() throws Exception {
	 MarksheetModel model= new MarksheetModel();
	 List list=model.search();
	 Iterator it=list.iterator();
	 while (it.hasNext()) {
		 MarksheetBean bean=(MarksheetBean) it.next();
		 System.out.print(" "+bean.getId());
		 System.out.print("\t"+bean.getName());
		 System.out.print("\t"+bean.getRoll_no());
		 System.out.print("\t"+bean.getPhysics());
		 System.out.print("\t"+bean.getChemistry());
		 System.out.println(""+bean.getMaths());
	 }
	
}
	private static void testFindByPk() throws Exception {
		MarksheetModel model=new MarksheetModel();
		MarksheetBean bean= model.findByPk(5);
		if(bean !=null) {
		System.out.println(bean.getId());
		System.out.println(bean.getName());
		System.out.println(bean.getRoll_no());
		System.out.println(bean.getPhysics());
		System.out.println(bean.getChemistry());
		System.out.println(bean.getMaths());
		
	}
		else {
			System.out.println("id does not found...");
		}
}
}