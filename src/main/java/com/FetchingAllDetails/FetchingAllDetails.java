package com.FetchingAllDetails;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchingAllDetails {

	public static void main(String[] args) throws SQLException {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from student");
		while(rs.next()) {
			System.out.print(rs.getInt("id"));
			System.out.print(" ");
			System.out.print(rs.getString("name"));
			System.out.print(" ");
			System.out.print(rs.getInt("age"));
			System.out.println();
		}
		System.out.println("Details are fetched");
	}
}
