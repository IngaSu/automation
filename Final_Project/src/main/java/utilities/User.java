package utilities;

import java.sql.SQLException;

public class User {

	Database database = new Database();
	private String login = database.getFieldByColumn("login");
	private String password = database.getFieldByColumn("password");

	public User() throws SQLException {
	}

	public String getLogin() {
		return login;
	}

	public String getPassword() {
		return password;
	}

	public static Builder newBuilder() throws SQLException {
		return new User().new Builder();
	}

	public class Builder {

		private Builder() {
		}

		public Builder setUserLogin(String userLogin) {
			User.this.login = userLogin;
			return this;
		}

		public Builder setUserPassword(String userPassword) {
			User.this.password = userPassword;
			return this;
		}

		public User build() {
			return User.this;
		}
	}
}
