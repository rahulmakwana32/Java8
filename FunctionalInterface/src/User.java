
public class User {

	
	String User;
	
	String pwd;

	public User(String user, String pwd) {
		super();
		User = user;
		this.pwd = pwd;
	}

	@Override
	public String toString() {
		return "User [User=" + User + ", pwd=" + pwd + "]";
	}
	
	
}
