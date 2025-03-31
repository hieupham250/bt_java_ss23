package bai4;

public class Main {
    public static void main(String[] args) {
        NumberThread thread1 = new NumberThread();
        MessageThread thread2 = new MessageThread(thread1, "Thread 2 bắt đầu...");
        MessageThread thread3 = new MessageThread(thread1, "Thread 3 bắt đầu...");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
