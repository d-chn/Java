package Basic.TobeArchived;

import java.util.Scanner;

public class ControlStatementPractice01 {
    public static void main(String[] args) {
        //��дһ���򵥵ĳ˷�����н��������
        //��дһ��������ѭ����һ��������н��һ����������
        //�ٵȴ��û�����exit����next���ֱ��Ӧbreak��continue
        System.out.println("�ҵ���н������");
        while (true) {
            int flag = 0;
            Scanner input = new Scanner(System.in);
            System.out.print("�����뵱ǰ�û�����н(ֻ��Ϊ���֣���λ��Ԫ)��");
            int monthSalary = input.nextInt();
            System.out.print("�����뵱ǰ�û���ȡнˮ������(ֻ��Ϊ���֣���λ����)��");
            int month = input.nextInt();
            int yearSalary = monthSalary * month;
            System.out.println("���û�����нΪ��" + yearSalary);
            System.out.print("����Ҫ����ʹ�ã�����next�������˳����������exit�������������ַ���ʾ����ִ��");
            input.nextLine();                //��������Ϊ��input��ȡ��֮ǰnextInt���ڻ������Ļ��з�������Status�޷������һ�μ�������
            String status = input.nextLine();
            if (status.equals("next")) {
                System.out.println("�������ִ����");
                continue;
            } else if (status.equals("exit")) {
                System.out.println("����˳���");
                break;
            }
        }
    }
}
