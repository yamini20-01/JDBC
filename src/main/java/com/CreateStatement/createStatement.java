package com.CreateStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class createStatement {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "root");
		Statement st=con.createStatement();
		st.execute("create table nonstaff(id int,name varchar(20));");
		System.out.println("Database created Successfully");
	}
}
