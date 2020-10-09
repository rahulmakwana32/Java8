import java.util.function.Predicate;

public class PredicateAuthentication {
	public static void main(String[] args) {

		 System.out.println( new PredicateAuthentication().Validate(new User("Rahusl", "Rahul")));
	}

	public String Validate(User users) {

		Predicate<User> h = s -> s.User.equals(s.pwd);
		
		

		if (h.test(users)) {

			return "Success";
		}

		return "Faile";

	}

}
