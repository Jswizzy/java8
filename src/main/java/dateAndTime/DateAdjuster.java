package dateAndTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class DateAdjuster {

    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        LocalDate nextSunday =
                now.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));

        System.out.println("Next Sunday is the " + nextSunday.get(ChronoField.DAY_OF_YEAR) + " Sunday of the year.");
    }
}
