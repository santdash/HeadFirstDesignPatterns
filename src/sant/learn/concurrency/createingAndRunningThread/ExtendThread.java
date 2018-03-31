package sant.learn.concurrency.createingAndRunningThread;

public class ExtendThread extends Thread{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "Saying hi...");
    }
}
