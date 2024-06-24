package Practice.multithreading;

public class Multithreading extends Thread {

    @Override
    public void run() {
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        Multithreading multithreading = new Multithreading();
        multithreading.start();
    }
}
