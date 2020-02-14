package shopping;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {
	
	private String jdbcURL = "jdbc:mysql://localhost:3306/shopping?useSSL=false&serverTimezone=CST";
	private String jdbcUsername = "root";
	private String jdbcPassword = "12345678";

	private static final String SELECT_USER_BY_TOKEN = "select user from users where token=?;";
	private static final String SELECT_USER_BY_EMAIL = "select user, password from users where email=?;";
	
	public UserDAO() {
	}

	protected Connection getConnection() {
		
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return connection;
		
	}

	public UserModel selectUserbyToken(String token) throws IOException {
		
		UserModel user = null;
		
		// Step 1: Establishing a Connection
		try (Connection connection = getConnection();
			
			// Step 2:Create a statement using connection object
			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USER_BY_TOKEN)) {
			
			preparedStatement.setString(1, token);
			
			// Step 3: Execute the query or update query
			ResultSet rs = preparedStatement.executeQuery();

			// Step 4: Process the ResultSet object.
			while (rs.next()) {
				user = new UserModel(rs.getString("user"));
			}
			
		} catch (SQLException e) {
			printSQLException(e);
		}
		
		return user;
		
	}
	
	
	public UserModel selectUserbyEmail(String email) throws IOException {
		
		UserModel user = null;
		
		// Step 1: Establishing a Connection
		try (Connection connection = getConnection();
			
			// Step 2:Create a statement using connection object
			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USER_BY_EMAIL)) {
			
			preparedStatement.setString(1, email);
			
			// Step 3: Execute the query or update query
			ResultSet rs = preparedStatement.executeQuery();

			// Step 4: Process the ResultSet object.
			while (rs.next()) {
				user = new UserModel(rs.getString("user"), rs.getString("password"));
				
			}
			
		} catch (SQLException e) {
			printSQLException(e);
		}
		
		return user;
		
	}
	
	
	private void printSQLException(SQLException ex) {
		
		for (Throwable e : ex) {
			if (e instanceof SQLException) {
				e.printStackTrace(System.err);
				System.err.println("SQLState: " + ((SQLException) e).getSQLState());
				System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
				System.err.println("Message: " + e.getMessage());
				Throwable t = ex.getCause();
				while (t != null) {
					System.out.println("Cause: " + t);
					t = t.getCause();
				}
			}
		}
		
	}

}