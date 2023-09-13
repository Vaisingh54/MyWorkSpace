package MultiThreading.CompanyProj;

public class Main {

    public static void main(String[] args) {

        Company com = new Company();
        Pruducer p = new Pruducer(com);
        Consumer c = new Consumer(com);

        p.start();
        c.start();

    }

}
