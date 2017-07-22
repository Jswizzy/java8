package dateAndTime;

import java.time.Instant;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalTimeExample {

    public static void main(String[] args) {

        LocalTime now = LocalTime.now();
        Instant.now().plus(1000, ChronoUnit.SECONDS);

        LocalTime time = LocalTime.of(10, 20); // 10:20

        LocalTime bedtime = LocalTime.of(23, 0);
        LocalTime wakeUpTime = bedtime.plusHours(8);

        System.out.println(wakeUpTime);
    }
}
