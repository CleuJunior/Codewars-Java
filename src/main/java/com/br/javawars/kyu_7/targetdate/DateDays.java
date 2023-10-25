package com.br.javawars.kyu_7.targetdate;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateDays {
    public static String dateNbDays(double a0, double a, double p) {
        int daysNeeded = 0;
        double currentAmount = a0;
        while (currentAmount < a) {
            currentAmount += currentAmount * (p / 36000);
            daysNeeded++;
        }

        Calendar calendar = Calendar.getInstance();
        calendar.set(2016, Calendar.JANUARY, 1);
        calendar.add(Calendar.DAY_OF_YEAR, daysNeeded);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(calendar.getTime());
    }
}
