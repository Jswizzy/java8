package dateAndTime;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class ZonedTimeExample {

    public static void main(String[] args) {

        ZonedDateTime currentMeeting =
                ZonedDateTime.of(
                        LocalDate.of(2014, Month.MARCH, 12),
                        LocalTime.of(9, 30),
                        ZoneId.systemDefault()
                );

        ZonedDateTime nextMeeting =
                currentMeeting.plus(Period.ofMonths(1));

        System.out.println("Next meeting is " + nextMeeting);

        ZonedDateTime nextMeetingCentral =
                nextMeeting.withZoneSameInstant(ZoneId.of("US/Central"));

        System.out.println("Meeting in Central time " + nextMeetingCentral.toLocalTime());

        System.out.println(
                DateTimeFormatter.ISO_DATE_TIME.format(nextMeetingCentral)
        );

        System.out.println(
                DateTimeFormatter.RFC_1123_DATE_TIME.format(nextMeetingCentral)
        );
    }
}
