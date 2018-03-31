package sant.QueCheck;

import java.util.Queue;

/**
 * Created by dashsan on 28/5/17.
 */
public class QueueManager implements Runnable {

    private Queue<String> queue;
    private boolean stop = false;

    public QueueManager(Queue<String> queue) {
       this.queue = queue;
    }

    private boolean isStopRequested(){
        return stop;
    }

    public void stop() {
        stop = true;
    }

    @Override
    public void run() {
        while(! isStopRequested() ){
            System.out.println("Waiting for data...");
            if ( queue.isEmpty() ) continue;
            String poll = queue.poll();
            System.out.println("Polled value is: " + poll);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (queue.isEmpty()) break;
        }
        System.out.println("END of Life...");

    }
}
