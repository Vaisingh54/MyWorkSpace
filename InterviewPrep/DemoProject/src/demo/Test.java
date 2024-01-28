package demo;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		MyThead t1 = new MyThead();
		
		Thread thread1 = new Thread(t1);
		
		thread1.start();
		

	}

}
