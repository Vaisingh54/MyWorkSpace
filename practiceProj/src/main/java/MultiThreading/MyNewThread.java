package MultiThreading;

public class MyNewThread extends Thread {

    @Override
    public void run() {
        // task
        for (int i = 10; i >= 1; i--) {
            System.out.println("I am new : " + i);
            try {
                Thread.sleep(5000);
            } catch (Exception e) {
            }
        }
    }

}