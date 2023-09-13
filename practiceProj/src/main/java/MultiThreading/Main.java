package MultiThreading;

public class Main {

    public static void main(String[] args) {

        MyThread t1 = new MyThread();
        Thread tt = new Thread(t1);
        tt.start();

        MyNewThread t2 = new MyNewThread();
        t2.start();

    }
}