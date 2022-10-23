package basicknowledge.calendarpractice;

import java.util.Calendar;

public class GregorianCalendar {
    public static void main(String[] args) {
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

        int year;
        // 初始化Gregorian日历
        // 使用当前时间和日期
        // 默认为本地时间和时区
        java.util.GregorianCalendar calendar = new java.util.GregorianCalendar();
        // 显示当前时间和日期的信息
        System.out.print("Date: ");
        System.out.print(months[calendar.get(Calendar.MONTH)]);
        System.out.print(" " + calendar.get(Calendar.DATE) + " ");
        System.out.println(year = calendar.get(Calendar.YEAR));
        System.out.print("Time: ");
        System.out.print(calendar.get(Calendar.HOUR) + ":");
        System.out.print(calendar.get(Calendar.MINUTE) + ":");
        System.out.println(calendar.get(Calendar.SECOND));

        //测试当前年份是否为闰年
        if (calendar.isLeapYear(year)) {
            System.out.println("当前年份是闰年");
        } else {
            System.out.println("当前年份不是闰年");
        }
    }
}
