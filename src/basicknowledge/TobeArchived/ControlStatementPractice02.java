package basicknowledge.TobeArchived;

import java.util.Scanner;

public class ControlStatementPractice02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("�������û�����н��");
            double mouthSalary = input.nextDouble();
            if (mouthSalary > 5000) {
                mouthSalary = mouthSalary * 0.03;
            }
            System.out.println("��Ӧ���Ͻ���˰��Ϊ��" + mouthSalary);
            System.out.println("�˳�����������exit�����������ַ���ʾ����ִ�С�");
            String statement = input.next();
            if (statement.equals("exit")) {
                break;
            }
        }
    }
}
