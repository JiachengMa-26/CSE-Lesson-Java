package P2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginModel {
	Connection connection = null;

	public LoginModel() {
		connection = SqliteConnection.connector();
		if (connection == null) {
			System.out.println("Connection not successfull");
			System.exit(1);
		}
	}

	public boolean isDbConnected() {
		try {
			return !connection.isClosed();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean isLogin(String user, String pass) {
		resetConnection();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		String query = "select * from Students where UserName=? and Password=?";
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, user);
			preparedStatement.setString(2, pass);
			resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				return true;
			} else {
				return false;
			}
		} catch (SQLException e) {
			return false;
		} finally {
			try {
//				if (preparedStatement != null) {
					preparedStatement.close();
//				}
//				if (resultSet != null) {
					resultSet.close();
//				}
				connection.close();
			} catch (SQLException e) {
				return false;
			}
		}
	}

	public void resetConnection() {
		try {
			if (connection.isClosed()) {
				connection = SqliteConnection.connector();
				if (connection == null) {
					System.out.println("Connection not successful.");
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
