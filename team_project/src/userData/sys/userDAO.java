package userData.sys;

import java.sql.*;
import java.sql.Date;
import userData.sys.userModel;

public class userDAO
{
	//setting the mysql database connection
	private String jdbc="jdbc:mysql://localhost:3306/team_userdata?useSSl=false&serverTimezone=CST";										//setting the link address
	private String jdbcUsername="root";																										//setting the login user
	private String jdbcPassword="power1234";																								//setting the user password
	
	//setting the myslq format
	private final String INSERT_USER="INSERT INTO users"+" (username, password, email, phonenumber, birthday) "+"(?, ?, ?, ?, ?)";			//the insert function format of mysql
	private final String SELECT_USER_BY_NAME="select username, password, email, phonenumber, birthday from users where username=?";			//the select function format of mysql
	private final String DELETE_USER="delete from users where id=?";																		// the delete function format of mysql
	private final String UPDATE_USER="update users set username=?, password=?, email=?, phonenumber=?, birthday=? where id=?";				//the update function format of mysql
	
	//the constructor of userDAO class
	public userDAO() {}
	
	//the connection build up function for mysql database,this will return a connection object
	protected Connection getConnection()
	{
		 Connection connection=null;																										//declare a connection object
		 try
		 {
			 Class.forName("com.mysql.jdbc.Driver");																						//search for mysql connection driver
			 connection=DriverManager.getConnection(jdbc, jdbcUsername, jdbcPassword);														//make a connection to mysql database
		 }
		 catch(Exception e)																													//catch all Exception may occur in the try loop(including ClassNotFoundException and IOException)
		 {
			 e.printStackTrace();																											//print out the exception information
		 }
		 
		 return connection;																													//return a connection function
	}
	
	public void insertUser(userModel user)throws SQLException
	{
		try(Connection connection=getConnection(); PreparedStatement preparedStatement=connection.prepareStatement(INSERT_USER))
		{
			preparedStatement.setString(1, user.getUsername());
			preparedStatement.setString(2, user.getPassword());
			preparedStatement.setString(3, user.getEmail());
			preparedStatement.setInt(4, user.getPhonenumber());
			preparedStatement.setDate(5, Date.valueOf(user.getBirthday()));
			
			System.out.println(preparedStatement.toString());
			preparedStatement.executeUpdate();
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}
	
	public userModel selectUser(String name)throws SQLException
	{
		userModel user=null;
		
		try(Connection connection=getConnection(); PreparedStatement preparedStatement=connection.prepareStatement(SELECT_USER_BY_NAME))
		{
			preparedStatement.setString(1, name);
			System.out.println(preparedStatement.toString());
			
			ResultSet rs=preparedStatement.executeQuery();
			
			while(rs.next())
			{
				String password=rs.getString("password");
				String email=rs.getString("email");
				int phonenumber=rs.getInt("phonenumber");
				Date birthday=rs.getDate("Birthday");
				
				user=new userModel(name, password, email, phonenumber, birthday.toString());
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		
		return user;
	}
	
	public boolean deleteUser(int id)throws SQLException
	{
		boolean suc=false;
		try(Connection connection=getConnection();PreparedStatement preparedStatement=connection.prepareStatement(DELETE_USER))
		{
			preparedStatement.setInt(1,  id);
			System.out.println(preparedStatement.toString());
			suc=preparedStatement.executeUpdate()>0;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return suc;
	}
	
	public boolean updateUser(userModel user)throws SQLException
	{
		boolean suc=false;
		try(Connection connection=getConnection();PreparedStatement preparedStatement=connection.prepareStatement(UPDATE_USER))
		{
			preparedStatement.setString(1, user.getUsername());
			preparedStatement.setString(2, user.getPassword());
			preparedStatement.setString(3, user.getEmail());
			preparedStatement.setInt(4, user.getPhonenumber());
			preparedStatement.setDate(5, Date.valueOf(user.getBirthday()));
			preparedStatement.setInt(6, user.getId());
			System.out.println(preparedStatement.toString());
			
			suc=preparedStatement.executeUpdate()>0;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return suc;
	}
	
}