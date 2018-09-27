package com.rohith.prac;

import java.util.*;
import java.text.*;

class DateRange {
    Date start;
    Date end;
    int value;

    public DateRange(Date start, Date end, int value) {
        this.start = start;
        this.end = end;
        this.value = value;
    }
}

public class DateRangePrac {
    public static void main(String args[]) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        // new SimpleDateFormat("MM/dd/yy").parse("2/1/15")
        int output;
        List<DateRange> dates = new ArrayList<>();
        dates.add(new DateRange(new SimpleDateFormat("MM/dd/yy").parse("1/1/15"), new SimpleDateFormat("MM/dd/yy").parse("2/1/15"), 5));
        dates.add(new DateRange(new SimpleDateFormat("MM/dd/yy").parse("2/15/15"), new SimpleDateFormat("MM/dd/yy").parse("2/22/15"), 9));
        dates.add(new DateRange(new SimpleDateFormat("MM/dd/yy").parse("1/15/15"), new SimpleDateFormat("MM/dd/yy").parse("1/20/15"), 2));
        dates.add(new DateRange(new SimpleDateFormat("MM/dd/yy").parse("2/1/15"), new SimpleDateFormat("MM/dd/yy").parse("2/10/15"), 1));
        dates.add(new DateRange(new SimpleDateFormat("MM/dd/yy").parse("1/16/15"), new SimpleDateFormat("MM/dd/yy").parse("1/22/15"), 3));

        Date testDate = new SimpleDateFormat("MM/dd/yy").parse("1/20/15");

        output = dates.stream().filter(eachDateRange -> isWithInRange(testDate, eachDateRange.start, eachDateRange.end)).mapToInt(eachDateRange -> eachDateRange.value).sum();

        System.out.println(output);
    }


    public static boolean isWithInRange(Date testDate, Date startDate, Date endDate) {
        return testDate.getTime() >= startDate.getTime() && testDate.getTime() <= endDate.getTime();
    }
}
