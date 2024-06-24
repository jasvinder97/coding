package Practice.multithreading;

public class MutltiRun implements Runnable {
    public static void main(String[] args) {
        MutltiRun m = new MutltiRun();
        Thread thread = new Thread(m);
        thread.start();
    }

    @Override
    public void run() {
        System.out.println("Thread is running");
        for (int i = 1; i < 5; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
}
