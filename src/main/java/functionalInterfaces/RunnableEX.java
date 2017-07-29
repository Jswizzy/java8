package functionalInterfaces;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableEX {

    public static void main(String[] args) {
        Runnable r = () -> {
            int i = 0;
            while (i++ < 10) {
                System.out.println("It works!");
            }
        };

        ExecutorService es = Executors.newSingleThreadExecutor();

        es.execute(r);
        es.shutdown();

    }
}
