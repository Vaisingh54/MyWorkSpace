package demo;

public class MyThead implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i = 0;
		while(i <= 5) {
			System.out.println(" Hi Number "+ i);
			i++;
		}
		
	}

}
