package in.co.rays.callablestatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Types;



public class StroeProcedureInOut {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/advance04", "root", "root");
		CallableStatement stmt=conn.prepareCall("{CALL empInOut(?)}");
		stmt.setInt(1, 1);
		stmt.registerOutParameter(1, Types.INTEGER);
		stmt.execute();
		
		System.out.println(stmt.getInt(1));
		
	}

}
