package com.revature.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

	public void testConnection() throws SQLException, ClassNotFoundException {
		Class.forName("net.sourceforge.jtds.jdbc.Driver");
		Connection conn = DriverManager
				.getConnection("jdbc:jtds:sqlserver://localhost:1433;database=COSEC;instance=SQLEXPRESS");
		System.out.println("connected to mssql hello hai");
		Statement sta = conn.createStatement();
		String Sql = "select * from Mx_VSTRTypeMst;";
		System.out.println("---------------------");
		ResultSet rs = sta.executeQuery(Sql);
		while (rs.next()) {
			System.out.println(rs.getString("Name"));
		}
		System.out.println("---------------------");
	}

}
