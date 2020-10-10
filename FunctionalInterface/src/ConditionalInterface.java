import java.util.function.Consumer;

public class ConditionalInterface {
	public static void main(String[] args) {
		
		
		
		Consumer<String> m=s->System.err.println(s);
		Consumer<String> m2=s->System.err.println(s);

		
		m.andThen(m2).accept("Rahul");
 	}

}
