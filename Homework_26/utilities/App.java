package utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {

	public static User getUserdata() throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/sys?useSSL=false&serverTimezone=UTC";
		String login = "root";
		String password = "root";
		String query = "SELECT * FROM `mail.ru`.data";

		ResultSet resultset = getResultSet(url, login, password, query);
		User user = null;
		try (Connection con = DriverManager.getConnection(url, login, password);
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery(query)) {
			if (rs.next()) {

			}

		} catch (SQLException ex) {
			ex.printStackTrace();

		}
		return user;
	}

	private static User getUser(ResultSet resultSet) throws SQLException {
		User user = new User();
		user.setId(Integer.parseInt(resultSet.getString(1)));
		user.setLogin(resultSet.getString(2));
		user.setPassword(resultSet.getString(3));
		return user;

	}

	private static ResultSet getResultSet(String url, String login, String password, String query) throws SQLException {
		ResultSet resultSet = null;
		Connection connection = DriverManager.getConnection(url, login, password);
		try {
			Statement statement = connection.createStatement();
			resultSet = statement.executeQuery(query);
		} finally {
			connection.close();
		}
		return resultSet;
	}
}
