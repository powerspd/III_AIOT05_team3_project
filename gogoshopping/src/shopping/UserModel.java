package shopping;

public class UserModel {
	
	protected String user;
	protected String password;
	protected String email;
	protected String token;
	protected Boolean isLogin;

	public UserModel(String user, String password, String email, String token, Boolean isLogin) {
		super();
		this.user = user;
		this.password = password;
		this.email = email;
		this.token = token;
		this.isLogin = isLogin;
	}
	
	public UserModel(String user) {
		super();
		this.user = user;
	}
	
	public UserModel(String user, String password) {
		super();
		this.user = user;
		this.password = password;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Boolean getIsLogin() {
		return isLogin;
	}

	public void setIsLogin(Boolean isLogin) {
		this.isLogin = isLogin;
	}

}
