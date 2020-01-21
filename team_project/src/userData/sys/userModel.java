package userData.sys;

public class userModel
{
	private int id;
	private String username;
	private String password;
	private String email;
	private int phonenumber;
	private String birthday;
	
	public userModel(int id, String username, String password, String email, int phonenumber, String birthday)
	{
		this.id=id;
		this.username=username;
		this.password=password;
		this.email=email;
		this.phonenumber=phonenumber;
		this.birthday=birthday;
	}
	
	public userModel(String username, String password, String email, int phonenumber, String birthday)
	{
		this.username=username;
		this.password=password;
		this.email=email;
		this.phonenumber=phonenumber;
		this.birthday=birthday;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getUsername() 
	{
		return username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password) 
	{
		this.password = password;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public int getPhonenumber()
	{
		return phonenumber;
	}

	public void setPhonenumber(int phonenumber)
	{
		this.phonenumber = phonenumber;
	}

	public String getBirthday()
	{
		return birthday;
	}

	public void setBirthday(String birthday)
	{
		this.birthday = birthday;
	}
	
	
}
