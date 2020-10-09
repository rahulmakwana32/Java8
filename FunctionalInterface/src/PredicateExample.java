import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {

		Predicate<String> j = i -> i.equals("Rahul");
		System.out.println(j.test("Rahuls"));

		String[] name = { "Rahul", "Pallavi", "Kareena", "RahulMakwana" };

		Predicate<String> k = s -> s.startsWith("R");

		for (String s : name) {
			if (k.test(s)) {
				System.out.println(s);

			}
			;

		}

	}
}
