package com.preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateDataDynamically {
	public static void main(String[] args) throws SQLException {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","root");
		PreparedStatement st=con.prepareStatement("update employee set yoe=? where id=?");
		System.out.println("Enter new name");
		Scanner sc=new Scanner(System.in);
		int yoe=sc.nextInt();
		System.out.println("Enter id");
		int id=sc.nextInt();
		st.setInt(1,yoe);
		st.setInt(2,id);
		st.execute();
		System.out.println("Values Updated");
	}
}
