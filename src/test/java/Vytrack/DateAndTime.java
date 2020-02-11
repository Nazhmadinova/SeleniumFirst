package Vytrack;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Scrap {

    public static void main(String[] args) {

        //Current Date:
        String currentDate = LocalDate.now().format(DateTimeFormatter.ofPattern("MMM d, yyy"));
        System.out.println(currentDate);
        //Current Time
        String currentTime = LocalTime.now().minusHours(2).format(DateTimeFormatter.ofPattern("h:mm a"));
        System.out.println(currentTime);

    }
}
