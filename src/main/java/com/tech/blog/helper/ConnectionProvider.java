package com.tech.blog.helper;

import java.sql.*;

public class ConnectionProvider {
	private static Connection con;
	public static Connection getConnection()
	{
		try {
			
			
			
				Class.forName("com.mysql.cj.jdbc.Driver");

				//creating a connection
				String url="jdbc:mysql://localhost:3306/youtube";
				String username="root";
				String password="Zunaid#70";
				con=DriverManager.getConnection(url,username,password);
				
				System.out.println(con);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return con;
	}
	public static void main(String args[])
	{
		System.out.println("hi i am india");
		Connection con=ConnectionProvider.getConnection();
		System.out.println(con);
	}

}
