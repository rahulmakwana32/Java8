import java.util.function.Supplier;

public class SupplierFunction {
	public static void main(String[] args) {

		Supplier<String> f = () -> new User("r", "d").toString();

		System.out.println(f.get());

	}
}
