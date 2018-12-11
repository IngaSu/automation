package utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Database {
	public Database() throws SQLException {
	}

	private static ResultSet getUserData() throws SQLException {
		ArrayList<String> userData = new ArrayList<String>();
		String url = "jdbc:mysql://localhost:3306/sys?useSSL=false&serverTimezone=UTC";
		String login = "root";
		String password = "root";
		String query = "SELECT * FROM `mail.ru`.data";
		Connection con = DriverManager.getConnection(url, login, password);
		Statement st = con.createStatement();
		return st.executeQuery(query);
	}

	private ResultSet userDataSet = getUserData();

	public String getFieldByColumn(String columnName) throws SQLException {
		userDataSet.first();
		return userDataSet.getString(columnName);
	}
}
