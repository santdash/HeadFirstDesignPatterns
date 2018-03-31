package sant.learn.concurrency.createingAndRunningThread;

import java.util.ArrayList;
import java.util.List;

public class TestThredExecution {
    public static void main(String[] args) throws InterruptedException {
        RunnableThread rt = new RunnableThread();

        List<Thread> runningThreads = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            Thread th = new Thread(rt);
            th.start();
            runningThreads.add(th);
        }

        for (Thread th: runningThreads){
            if ( th.isAlive() ) {
                th.join();
                System.out.println("Thread: " + th.getName() + " completed");
            }
        }

        System.out.println("END of Runnable");



        ExtendThread extendThread = new ExtendThread();
        extendThread.setName("ExtendedThread: ");
        extendThread.start();
        extendThread.join();
        System.out.println("END of Main");

    }
}
