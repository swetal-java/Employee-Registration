package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import Coonect.dbConnection;
import Model.userModel;


public class userDao {

	public static void insertUser(userModel um) {
		try {
			Connection con = dbConnection.connect();
			String sql1 = "insert into user_tbl (email,gender,contact,password,address) values (?,?,?,?,?)";
			PreparedStatement pStatement = con.prepareStatement(sql1);
			pStatement.setString(1, um.getEmail());
			pStatement.setString(2, um.getGender());
			pStatement.setLong(3, um.getContact());
			pStatement.setString(4, um.getPassword());
			pStatement.setString(5, um.getAddress());
			pStatement.executeUpdate();
			String sql2 = "insert into emp_tbl (empid,empname,emp_designation) values (?,?,?)";
			PreparedStatement pStatement1 = con.prepareStatement(sql2);
			pStatement1.setInt(1, um.getEmpid());
			pStatement1.setString(2, um.getEmpname());
			pStatement1.setString(3, um.getDesignation());
			pStatement1.executeUpdate();
			System.out.println("Inserted..");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
