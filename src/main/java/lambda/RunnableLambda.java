package lambda;

public class RunnableLambda {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = () -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("Hello {" +
                Thread.currentThread().getName() +
                "}");
            }
        };

        Thread t = new Thread(runnable);
        t.start();
        t.join();
    }
}
