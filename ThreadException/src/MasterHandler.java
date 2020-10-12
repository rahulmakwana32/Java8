import java.lang.Thread.UncaughtExceptionHandler;

public class MasterHandler implements UncaughtExceptionHandler{

	public void uncaughtException(Thread t, Throwable e) {
		// TODO Auto-generated method stub
		System.out.println(t.getName());
		 e.printStackTrace();
		
	}

}
