
@FunctionalInterface
interface Funct{

	public void m(int a);
	
 
	
}

 

 public class FunctInterface{
	
	public static void main(String[] argss) {
		
	 
		
		Funct j1=  (a)->	System.out.println("Implemented"+a);
		j1.m(5);
		
		
	Runnable r=()-> {
		
		System.out.println("Runs "+Thread.currentThread().getName());
		
	};
	
	Thread h= new Thread(r);
h.start();
	
	}
	
}
