package basicknowledge.TobeArchived;

public class IfPractice03 {
    public static void main(String[] args) {
        int age = (int) (Math.random() * 100);
        System.out.print("������" + age + "������");
        if (age < 20) {
            System.out.println("����");
        } else if (age < 35) {
            System.out.println("����");
        } else if (age < 50) {
            System.out.println("׳��");
        } else if (age < 65) {
            System.out.println("������");
        } else if (age < 80) {
            System.out.println("����");
        } else {
            System.out.println("ĺ��");
        }
    }
}
