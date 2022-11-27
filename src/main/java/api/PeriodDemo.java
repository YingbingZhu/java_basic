package api;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class PeriodDemo {
    public static void main(String[] args) {
        LocalDateTime time = LocalDateTime.now();
        System.out.println(time);

        LocalDateTime time1 = LocalDateTime.of(2023, 10, 1,
                23,22,12);
        Duration d = Duration.between(time, time1);
        System.out.println(d);

        System.out.println(d.toDays());
        System.out.println(ChronoUnit.YEARS.between(time, time1));
    }
}
