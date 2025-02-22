package com.jspider.jdbc_simple_crud_operation_statement.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertStudentController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection = null;

		try {
			// Step-1 load/register the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/jdbc-e4";
			String user = "root";
			String password = "Vinityadav@123";
			// step-2 Great the connection by the providing the url,username,password..
			connection = DriverManager.getConnection(url, user, password);
          // step-3 create the statement
			Statement statement = connection.createStatement();
			// step -4 execute the query
			String insertStudentQuery = "insert into student values	(33,'deepak','deepak@gmail.com',7686867890,'2004-01-10','GreaterNoida','A')";

			int a = statement.executeUpdate(insertStudentQuery);
			if (a != 0) {
				System.out.print("Data save");
			} else {
				System.out.print("Someting went worng");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				// step-5 close connection...
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
