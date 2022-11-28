package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) throws ParseException {
        // JDK 7
        String birth = "1996/5/8";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date date = sdf.parse(birth);
        long birthdayTime = date.getTime();
        long currentTime = System.currentTimeMillis();
        long l = currentTime - birthdayTime;
        System.out.println(l / 1000 / 60/ 60/ 24);


        Calendar c = Calendar.getInstance();
        c.set(2000,2,1); // month: 0-11
        c.add(Calendar.DAY_OF_MONTH, -1);
        int i = c.get(Calendar.DAY_OF_MONTH); // 28 or 29?
        System.out.println(i);

        // JDK 8
        LocalDate ld1 = LocalDate.of(1996,5,8);
        LocalDate ld2 = LocalDate.now();
        long l1 = ChronoUnit.DAYS.between(ld1, ld2);
        System.out.println(l1);

        LocalDate date1 = LocalDate.of(2000, 3, 1); // 1- 12
        LocalDate date2 = date1.minusDays(1);
        int day = date2.getDayOfMonth();

        boolean b = date1.isLeapYear();
        System.out.println(b);

        System.out.println(day);

    }
}
