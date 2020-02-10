package userData.sys;

public class userModel
{
	private int id;
	private String username;
	private String password;
	private String email;
	private String phonenumber;
	private String birthday;
	private String fruits;
	private double price;
	private String number;
	private double total;
	
	
	
	
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}



	public userModel(String fruits, String number ,Double price,Double total) {
		super();
		this.fruits = fruits;
		this.number = number;
		this.price = price;
		this.total=total;	
	}





	public String getFruits() {
		return fruits;
	}

	public void setFruits(String fruits) {
		this.fruits = fruits;
	}



	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	

	public userModel(int id, String username, String password, String email, String phonenumber, String birthday)
	{
		this.id=id;
		this.username=username;
		this.password=password;
		this.email=email;
		this.phonenumber=phonenumber;
		this.birthday=birthday;
	}
	
	public userModel(String username, String password, String email, String phonenumber, String birthday)
	{
		this.username=username;
		this.password=password;
		this.email=email;
		this.phonenumber=phonenumber;
		this.birthday=birthday;
	}
	

	public userModel(String password) {
		super();
		this.password = password;
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

	public String getPhonenumber()
	{
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber)
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

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	
	
	
}
