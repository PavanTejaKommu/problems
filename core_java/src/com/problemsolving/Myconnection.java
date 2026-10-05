package com.problemsolving;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.spi.DirStateFactory.Result;

public class Myconnection {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/emp_details";

		String userName = "root";
		String password = "root";




		try {
			
			Connection connection = DriverManager.getConnection(url, userName, password);


			System.out.println("Connection Succesfull");
			
			java.sql.Statement smt = connection.createStatement();
			
			ResultSet rs = smt.executeQuery(
					"select * from emp"
			);
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				
				rs.toString();
			}

		} catch (SQLException e) {
			System.out.println(e.toString());
			System.out.println("Sql Exception Occured ");
		}

	}

}
