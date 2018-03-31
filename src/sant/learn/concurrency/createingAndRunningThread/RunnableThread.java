package sant.learn.concurrency.createingAndRunningThread;

public class RunnableThread implements Runnable {

    public final void sayHi() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println(Thread.currentThread().getName() + ": Saying Hi...");
        System.out.println(this.getClass().getSimpleName());

    }

    @Override
    public void run() {
        try {
            sayHi();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
