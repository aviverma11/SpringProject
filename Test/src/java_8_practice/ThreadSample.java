package java_8_practice;

interface avi{
	
}

public class ThreadSample implements avi  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		avi obj = new ThreadSample();
			System.out.println("its working");
			Thread t1 =  new Thread(()->System.out.println("its working"));	
	}

}
