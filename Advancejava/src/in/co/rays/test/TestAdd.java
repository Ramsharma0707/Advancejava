package in.co.rays.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestAdd {
	public static void main(String[] args) throws Exception {
//		Class.forName("com.mysql.cj.jdbc.Driver");//load driver
//
//		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance04", "root", "root");
//
//		Statement stmt = conn.createStatement();
//
//		//int i = stmt.executeUpdate("insert into marksheet values(12, 'vish', 110, 11, 12, 13)");
//		 // int i = stmt.executeUpdate("delete from marksheet where id=12");
//		    int i = stmt.executeUpdate ("update  marksheet set name='lavish' where id=11");
//		
//		System.out.println("Data Inserted = " + i);
//    }
//		}
		
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/advance04", "root", "root");
//		Statement stmt=conn.createStatement();
//		int i= stmt.executeUpdate("create table sagar3 (id int,name varchar (20))");
//		 i=stmt.executeUpdate("insert into sagar3 values(1,'vijay'),(2,'sagar')");
//		
//		System.out.println("Data updated=" +i);

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/advance04", "root", "root");
		Statement stmt=conn.createStatement();
		int i=stmt.executeUpdate("update marksheet set name='deviiii' where id=10 ");
		System.out.println("data update"+i);
		
	}	
	
	
	}

