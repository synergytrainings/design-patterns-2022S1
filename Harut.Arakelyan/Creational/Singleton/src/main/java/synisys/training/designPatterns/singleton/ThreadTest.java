package synisys.training.designPatterns.singleton;

/**
 * @author harut.arakelyan
 */
public class ThreadTest extends Thread {
    private Thread t;
    private String threadName;

    public ThreadTest( String name) {
        threadName = name;
        System.out.println("Creating " +  threadName   + " - " + AppConfiguration.getInstance().configLoadTime);
    }

    public void run() {
        System.out.println("Running " +  threadName   + " - " + AppConfiguration.getInstance().configLoadTime);
        try {
            for(int i = 4; i > 0; i--) {
                // Let the thread sleep for a while.
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " +  threadName + " interrupted.");
        }
        System.out.println("Thread " +  threadName + " exiting."  + " - " + AppConfiguration.getInstance().configLoadTime);
    }

    public void start () {
        System.out.println("Starting " +  threadName   + " - " + AppConfiguration.getInstance().configLoadTime);
        if (t == null) {
            t = new Thread (this, threadName);
            t.start ();
        }
    }
}

