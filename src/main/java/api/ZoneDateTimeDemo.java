package api;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDateTimeDemo {
    public static void main(String[] args) {
        ZonedDateTime time1 = ZonedDateTime.of(2023, 10,1,
                11,12,12,0, ZoneId.of("Asia/Shanghai"));
        System.out.println(time1);

        Instant instant = Instant.ofEpochMilli(0L);
        ZoneId zoneId = ZoneId.of("Asia/Shanghai");
        ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(instant, zoneId);
        System.out.println(zonedDateTime);

        // with----modify,, new object
        ZonedDateTime time3 = time1.withHour(23);
        System.out.println(time3);

        ZonedDateTime time4 = time1.minusMonths(1);
        System.out.println(time4);

    }
}
