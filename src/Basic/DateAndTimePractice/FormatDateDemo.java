package Basic.DateAndTimePractice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatDateDemo {
    public static void main(String[] args) {
        Date dateNow = new Date();
        System.out.println("Now is: " + dateNow.toString());
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println("Now is: " + format.format(dateNow));
    }
}
