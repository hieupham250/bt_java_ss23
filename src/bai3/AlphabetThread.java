package bai3;

public class AlphabetThread extends Thread {
    private final SharedResource resource;
    public AlphabetThread(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        resource.printAlphabet();
    }
}
