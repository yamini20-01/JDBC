package com.preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteDynamically {	public static void main(String[] args) throws SQLException {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","root");
		PreparedStatement st=con.prepareStatement("delete from employee where id=?");
		System.out.println("Enter id to delete");
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		st.setInt(1,id);
		st.execute();
		System.out.println("Deleted");
	}
}
