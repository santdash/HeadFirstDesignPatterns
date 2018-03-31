package sant.QueCheck;

/**
 * Created by dashsan on 28/5/17.
 */
public class QueueTest {
    public static void main(String[] args) throws InterruptedException {
        QueDeclare qd = new QueDeclare();
        QueueManager qm = qd.getQueueManager();

        Thread th1 = new Thread(qd, "THOne ");
        Thread th2 = new Thread(qm, "THTwo "); // Starts quemanager thread.
        Thread th3 = new Thread(qd, "THThree ");
        th1.start();
        th2.start();
        th3.start();

        Thread.sleep(10000);
        qd.stop();
    }
}
