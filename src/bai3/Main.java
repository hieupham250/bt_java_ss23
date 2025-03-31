package bai3;

public class Main {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        Thread thread1 = new AlphabetThread(sharedResource);
        Thread thread2 = new AlphabetThread(sharedResource);

        thread1.start();
        thread2.start();
    }
}
