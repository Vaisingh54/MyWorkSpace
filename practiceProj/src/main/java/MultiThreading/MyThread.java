package MultiThreading;

public class MyThread implements Runnable {

    @Override
    public void run() {
        // task
        for (int i = 0; i <= 50; i++) {
            System.out.println(i);
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
            }
        }
    }

}
