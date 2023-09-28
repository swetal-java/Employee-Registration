package Coonect;

import java.sql.Connection;
import java.sql.DriverManager;

public class dbConnection {
	public static Connection connect() {
		Connection conn= null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advancejava","root","");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return conn;
	}
}
