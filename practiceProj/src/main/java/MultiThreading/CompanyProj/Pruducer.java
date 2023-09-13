package MultiThreading.CompanyProj;

public class Pruducer extends Thread {

    Company c;
    int i = 1;

    public Pruducer(Company c) {
        this.c = c;
    }

    @Override
    public void run() {
        while (true) {
            try {
                this.c.producer_On(i);
                i++;
                Thread.sleep(2000);
            } catch (Exception e) {
            }
        }
    }

}
