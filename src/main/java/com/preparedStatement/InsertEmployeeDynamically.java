package com.preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertEmployeeDynamically {

	public static void main(String[] args) throws SQLException {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","root");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id");
		int id=sc.nextInt();
		System.out.println("Enter name");
		String name=sc.next();
		System.out.println("Enter role");
		String role=sc.next();
		System.out.println("Enter Years Of Exp");
		int yoe=sc.nextInt();
		System.out.println("Enter Salary");
		Double salary=sc.nextDouble();
		PreparedStatement ps=con.prepareStatement("insert into employee(id,name,role,yoe,salary) values(?,?,?,?,?)");
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setString(3, role);
		ps.setInt(4, yoe);
		ps.setDouble(5, salary);
		ps.execute();
		System.out.println("Values inserted");
	}
}
