package MultiThreading.CompanyProj;

public class Consumer extends Thread {

    Company c;

    public Consumer(Company c) {
        this.c = c;
    }

    @Override
    public void run() {
        while (true) {
            try {
                this.c.consumer_On();
                Thread.sleep(3000);
            } catch (Exception e) {
            }
        }
    }

}
