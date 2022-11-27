package api;

import java.time.LocalDate;
import java.time.LocalTime;

public class CalendarDemo {
    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        System.out.println(nowDate);

        int year = nowDate.getYear();
        System.out.println(year);

        int month = nowDate.getMonthValue();
        System.out.println(month);

        LocalTime l = LocalTime.now();
        System.out.println(l);

        System.out.println(LocalTime.of(23, 30));
    }
}
