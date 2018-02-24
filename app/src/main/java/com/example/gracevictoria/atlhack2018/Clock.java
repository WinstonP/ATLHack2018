package com.example.gracevictoria.atlhack2018;

import java.sql.Time;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by Grace Victoria on 2/24/2018.
 */

public class Clock {
    private LocalTime localTime;



    public static void outputTime() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
    }


    //////////////////////////////


}
