package com.Updation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class updation {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "root");
		Statement st=con.createStatement();
		st.execute("update student set name='Karthi' where id=1");
		System.out.println("Values updated");
	}

}
