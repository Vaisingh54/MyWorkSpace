package MultiThreading.CompanyProj;

public class Company {

    int n;
    boolean f = false;

    // If false producer turn
    synchronized public void producer_On(int n) throws Exception {
        if (f) {
            wait();
        }
        this.n = n;
        System.out.println("Produced : " + n);
        f = true;
        notify();
    }

    // If true Consumer turn
    synchronized public int consumer_On() throws Exception {
        if (!f) {
            wait();
        }
        System.out.println("Consumed : " + this.n);
        f = false;
        notify();
        return this.n;
    }

}
