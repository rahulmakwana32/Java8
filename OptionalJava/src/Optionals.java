import java.util.Optional;

public class Optionals {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		
		Integer m=null;
		Optional<Integer> k = Optional.empty();
		
		k = Optional.of(null);
		
		
		
		
		System.out.println(k.toString());
		System.out.println(m.toString());
		
	}

}
