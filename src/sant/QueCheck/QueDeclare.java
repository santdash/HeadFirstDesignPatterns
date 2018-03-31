package sant.QueCheck;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

/**
 * Created by dashsan on 28/5/17.
 */
public class QueDeclare implements Runnable{
    private Queue<String> sQueue = new ConcurrentLinkedDeque<>();
    private QueueManager queueManager;
    private boolean stop = false;

    public QueDeclare() {
        this.queueManager = new QueueManager(sQueue);
    }

    public QueueManager getQueueManager() {
        return queueManager;
    }

    private boolean isStopRequested(){
        return stop;
    }

    void stop() {
        stop = true;
    }
/* Sending the data after it is passed to QueDeclare
    to check if still data gets received
 */
    @Override
    public void run() {
        int i = 0;
        while(! isStopRequested() ){
            System.out.println("Adding string to the queue .." + Thread.currentThread().getName());
            sQueue.offer("Hi There: " + Thread.currentThread().getName() + ++i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("End of data sending...");
    }
}
