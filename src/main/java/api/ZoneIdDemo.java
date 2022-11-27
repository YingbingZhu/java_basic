package api;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZoneIdDemo {
    public static void main(String[] args) {
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(zoneIds); // Asia/Shanghai

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);

        ZoneId id = ZoneId.of("Asia/Pontianak");
        System.out.println(id);

        Instant instant1 = Instant.ofEpochMilli(0L);
        System.out.println(instant1);

        Instant instant2 = Instant.ofEpochSecond(1L);
        System.out.println(instant2);

        ZonedDateTime time = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));
        System.out.println(time);

        boolean b = Instant.ofEpochMilli(0L).isBefore(Instant.ofEpochMilli(1000L));
        System.out.println(b);

        Instant instant = Instant.ofEpochMilli(3000L);
        System.out.println(instant.minusSeconds(1));
    }
}
