package com.ymsli.assesment.jdbc.customer.model.persistance;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.*;

public class CustomerDaoImplementation implements CustomerDao {
	public Connection connection;

	public CustomerDaoImplementation() {
		this.connection = ConnectionFactory.getConnection();
	}

	@Override
	public Customer getCustomerByCustomerId(int custId) {
		Customer customer=null;
		try {
			PreparedStatement pstmt=connection.prepareStatement("Select * from customer where id=?");
			pstmt.setInt(1, custId);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {
				customer=new Customer(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getDate(5));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return customer;

	}


}
