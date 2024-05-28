package com.example.demo;


import org.mariadb.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQL {
	private static Connection connection;
	
	public static void main(String[] args) throws SQLException {
		doConnect();
	}
	
	public static void doConnect() throws SQLException {
		System.out.println("Connecting to the database...");
		
		connection = DriverManager.getConnection(
				"jdbc:mariadb://localhost:330/demo",
				"root", "root");
		System.out.println("Connected to the database." + connection.isValid(5));
	}
	
	public static void doDisconnect() throws SQLException {
		System.out.println("Disconnecting from the database...");
		connection.close();
		System.out.println("Disconnected from the database.");
	}
}
