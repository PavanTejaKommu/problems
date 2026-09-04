package com.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;

import com.task.BankApplication;
import com.task.DBConnection;
public class BankDAO {
	
	public void saveCustomer(BankApplication customer) {

	    try {

	        Connection con = DBConnection.getConnection();

	        String sql = "INSERT INTO customer VALUES(?,?,?,?)";

	        PreparedStatement ps = con.prepareStatement(sql);

	        ps.setLong(1, customer.getCustomerNumber());
	        ps.setString(2, customer.getCustomerName());
	        ps.setString(3, customer.getCustomerAdress());
	        ps.setDouble(4, customer.getBalance());

	        ps.executeUpdate();

	        System.out.println("Customer Saved Successfully");

	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	}

}
