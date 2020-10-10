import java.util.function.Function;

public class FunctionalInetface {
	public static void main(String[] args) {

		User f = new User("Rahul", "pass");
		Function<User, Boolean> fs = s -> s.User.equals("Rahul");

		Function<Boolean, String> fs1 = s -> {
			if (s) {

				return "Trussse";
			} else {
				return "False";
			}
		};

		System.out.println(fs.andThen(fs1).apply(f));
	}
}
