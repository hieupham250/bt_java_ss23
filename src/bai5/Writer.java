package bai5;

public class Writer extends Thread {
    private final SharedData sharedData;
    public Writer(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    public void run() {
        String[] messages = {"Xin chào!", "Bạn khỏe không?", "Hẹn gặp lại!"};
        for (String msg : messages) {
            sharedData.writeMessage(msg);
            try {
                Thread.sleep(1000); // Giả lập thời gian gửi tin nhắn
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
