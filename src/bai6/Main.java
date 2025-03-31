package bai6;

public class Main {
    public static void main(String[] args) {
        PriorityThread thread1 = new PriorityThread("Thread 1 (LOW)");
        PriorityThread thread2 = new PriorityThread("Thread 2 (MEDIUM)");
        PriorityThread thread3 = new PriorityThread("Thread 3 (HIGH)");

        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.NORM_PRIORITY);
        thread3.setPriority(Thread.MAX_PRIORITY);

        thread1.start();
        thread2.start();
        thread3.start();
    }

    /*
        - Mức độ ưu tiên của luồng không đảm bảo 100% thứ tự thực hiện giữa chúng.
        - giải thích: Mức độ ưu tiên (priority) trong Java chỉ là một gợi ý cho trình lập lịch luồng (Thread
        Scheduler) của hệ điều hành, nhưng nó không bắt buộc hệ điều hành phải chạy luồng theo đúng thứ tự ưu tiên
    */
}
