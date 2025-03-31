package bai3;

public class SharedResource {
    public synchronized void printAlphabet() {
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.print(c + " ");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println();
    }
}
