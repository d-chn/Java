package basicknowledge.dateandtimepractice;

import java.util.Date;

public class SleepDemo {
    public static void main(String[] args) {
        try {
            System.out.println(new Date() + "\n");
            Thread.sleep(1000 * 3);//sleep for 3 second
            System.out.println(new Date() + "\n");
        } catch (Exception e) {
            System.out.println("Got an exception!");
        }
    }
}