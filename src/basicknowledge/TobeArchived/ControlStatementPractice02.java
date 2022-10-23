package basicknowledge.TobeArchived;

import java.util.Scanner;

public class ControlStatementPractice02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("请输入用户的月薪：");
            double mouthSalary = input.nextDouble();
            if (mouthSalary > 5000) {
                mouthSalary = mouthSalary * 0.03;
            }
            System.out.println("您应该上交的税款为：" + mouthSalary);
            System.out.println("退出程序，请输入exit。其他任意字符表示继续执行。");
            String statement = input.next();
            if (statement.equals("exit")) {
                break;
            }
        }
    }
}
