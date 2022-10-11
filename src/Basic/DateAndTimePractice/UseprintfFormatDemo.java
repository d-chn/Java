package Basic.DateAndTimePractice;

import java.util.Date;

public class UseprintfFormatDemo {
    public static void main(String[] args) {
        //Initialize Data object
        Date date = new Date();
        //c
        System.out.printf("All date and time info: %tc%n", date);
        //f
        System.out.printf("year-month-day: %tF%n", date);
        //d
        System.out.printf("month/day/year: %tD%n", date);
        //r
        System.out.printf("HH:MM:SS PM format(12-hour clock): %tr%n", date);
        //t
        System.out.printf("HH:MM:SS format(24-hour clock): %tT%n", date);
        //r
        System.out.printf("HH:MM format(24-hour clock): %tR", date);
    }
}
