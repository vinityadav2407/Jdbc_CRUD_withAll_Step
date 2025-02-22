package com.jspider.jdbc_simple_crud_operation_statement.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDeletionByIdController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection=null;
		try {
			// step-1 load/register Driver
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// step-2 create connection by providing url,userName,password
			
			String url = "jdbc:mysql://localhost:3306/jdbc-e4";
			String user = "root";
			String password = "Vinityadav@123";
			
			
			// this class is present into the jdbc API
			 connection = DriverManager.getConnection(url, user, password);
			 
			//step -3 create statement
			 
			Statement statement = connection.createStatement();
			System.out.print(connection);
			
			// step-4 execute query
			
			String deletebyStudentById="delete from student where id=123";
			int a=statement.executeUpdate(deletebyStudentById);
			if(a!=0) {
				System.out.print("Deleted data");
			}else {
				System.out.print("Not deleted pls check your student id");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// its give the whole path of exception accure
			e.printStackTrace();
		}finally {
			try {
				// step -5 close connection
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
