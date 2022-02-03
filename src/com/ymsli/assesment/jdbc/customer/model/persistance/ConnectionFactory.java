package com.ymsli.assesment.jdbc.customer.model.persistance;

import com.ymsli.assesment.jdbc.customer.model.exceptions.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {
	public static Connection getConnection() {
		Connection connection = null;
		InputStream inputStream = null;
		Properties properties = new Properties();
		
		try {
			inputStream = new FileInputStream("database.properties");
			System.out.println("class loaded");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			properties.load(inputStream);
		} catch (IOException e) {
			throw new MyException(e);
		}
		try {
			Class.forName(properties.getProperty("driver"));
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			connection=DriverManager.getConnection(properties.getProperty("url"),properties.getProperty("username"),properties.getProperty("password"));
			System.out.println("Connected");
		} catch (SQLException e) {
			throw new MyException(e);
		}

		return connection;

	}

}
