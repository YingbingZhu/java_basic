package api;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterDemo {
    public static void main(String[] args) {
        ZonedDateTime time = ZonedDateTime.of(2023,10,1,1,1,1,1,
                ZoneId.of("Asia/Shanghai"));
        System.out.println(time);

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println(dtf1.format(time));
    }
}
