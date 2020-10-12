import java.util.*;
import java.util.stream.Collectors;

public class Streams {

	
	public static void main(String[] args) {
		
		
		List<String> j = new ArrayList<String>();
		
		j.add("tesd");
		j.add("Rahul");
		j.add("OMG");
		j.add("fd");
		j.add("hg");
		
		  Map<Integer, String> hmap = new HashMap<Integer, String>(); 
	      hmap.put(11, "Apple"); 
	      hmap.put(22, "Orange"); 
	      hmap.put(33, "Kiwi");  
	      hmap.put(44, "Banana"); 

	      Map<Integer, String> result = hmap.entrySet() 
	          .stream() 
	          .filter(map -> map.getKey().intValue() <= 22) 
	          .collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));
 		    
	List<String> m=	j.stream().filter(s->s.startsWith("R")).collect(Collectors.toList());
	
	m.stream().forEach(System.out::println);
	}
}
