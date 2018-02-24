package com.example.gracevictoria.atlhack2018;


import android.widget.TimePicker;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Grace Victoria on 2/24/2018.
 */

public class Clock {
    private LocalTime localTime;

    public Clock(LocalTime localTime) {
        this.localTime = localTime;
        outputTime();
    }


    public Date outputTime() {
    Date currentTime = Calendar.getInstance().getTime();
       return currentTime;

    }


    //////////////////////////////


}
