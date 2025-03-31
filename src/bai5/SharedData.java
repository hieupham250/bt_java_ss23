package bai5;

public class SharedData {
    private String message;
    private boolean hasMessage = false;

    public synchronized void writeMessage(String msg) {
        while (hasMessage) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.message = msg;
        hasMessage = true;
        System.out.println("Người gửi: " + msg);
        notify();
    }

    public synchronized void readMessage() {
        while (!hasMessage) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Người nhận: " + message);
        hasMessage = false;
        notify();
    }
}
