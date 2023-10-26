package com.br.javawars.kyu_7.dayoftheyear;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateToInt {

    public static int toDayOfYear(int[] date){
        LocalDate initialDateTime = LocalDate.of(date[2], 1, 1);
        LocalDate endDateTime = LocalDate.of(date[2], date[1], date[0]);

        return (int) ChronoUnit.DAYS.between(initialDateTime, endDateTime) + 1;
    }
}
