package com.trial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectProduct {
	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/product";
		String user = "gurkirat";
		String pass = "gurkirat";
		String cmd = "SELECT * from prod";
		int i=0;
		Connection cn =null;
		Statement st = null;
		ResultSet rs = null;
		try {
			cn = DriverManager.getConnection(url, user, pass);
			st = cn.createStatement();
			rs =  st.executeQuery(cmd);
			while(rs.next()) {
				int id = rs.getInt("i");
				String type = rs.getString("type");
				int price = rs.getInt("pp");
				System.out.println(id + "     " + type + "   "+ price);
				
			}

			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
