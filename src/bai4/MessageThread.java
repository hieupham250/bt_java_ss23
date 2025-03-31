package bai4;

public class MessageThread extends Thread {
    private final Thread waitFor;
    private final String message;

    public MessageThread(Thread waitFor, String message) {
        this.waitFor = waitFor;
        this.message = message;
    }

    @Override
    public void run() {
        try {
            waitFor.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(message);
    }
}
