public class Main {
    public static void main(String[] args) throws InterruptedException {

    Runner1 r1 = new Runner1();
    Runner2 r2 = new Runner2();
    Worker worker = new Worker();
    Thread th = new Thread(worker);
    long startTime1 = System.currentTimeMillis();
    r1.start();
    r2.start();
    th.start();

    r1.join();
    r2.join();
    th.join();
    long stopTime1 = System.currentTimeMillis();

    long startTime2 = System.currentTimeMillis();
    r1.run();
    r2.run();
    long stopTime2 = System.currentTimeMillis();
    System.out.println(stopTime1-startTime1);
    System.out.println(stopTime2-startTime2);


    }
}
