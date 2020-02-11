package Vytrack;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateAndTime {

    public static void main(String[] args) {

        //Current Date:
//        String currentDate = LocalDate.now().format(DateTimeFormatter.ofPattern("MMMMM d, yyy"));
//        System.out.println(currentDate);
//        //Current Time
//        String currentTime = LocalTime.now().minusHours(2).format(DateTimeFormatter.ofPattern("h:mm a"));
//        System.out.println(currentTime);

//        LocalDate current = LocalDate.now();
//        LocalDate date = LocalDate.of(2022,1,1);
//
//        String d = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
//        System.out.println(date);
//
//        String own = date.format(DateTimeFormatter.ofPattern("MMMM dd, yyyy"));
//        System.out.println(own);
//
//        DateTimeFormatter f = DateTimeFormatter.ofPattern("MM d yyyy");
//        LocalDate date3 = LocalDate.parse("01 02 2015", f);
//        System.out.println(date3);
//        LocalTime time = LocalTime.now();
//        LocalDateTime dateTime = LocalDateTime.now();

        DateTimeFormatter f = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        LocalDate date = LocalDate.now();
        String str = f.format(date);
        String str2 = date.format(f);
        System.out.println(f.format(date));
        System.out.println(date.format(f));

    }
}
