package basicknowledge.OperatorsPractice;

public class BinaryArithmeticOperatorsPractice {
    public static void main(String[] args) {
        //声明一个字符类型的变量
        char charNum = 'B'; //字符类型数据在计算机内存储的是Unicode编码。
        System.out.printf("%d%n", charNum + 1);
        System.out.printf("%d%n", charNum - 1);
        System.out.printf("%d%n", charNum * 2);
        System.out.printf("%d%n", charNum / 2);
        System.out.printf("%d%n", charNum + 8);
        System.out.printf("%d%n", charNum % 7);

        System.out.println("----浮点型变量----");
        //声明一个浮点型变量
        double doubleResult = 10.0;
        System.out.printf("%f%n", doubleResult - 1);
        System.out.printf("%f%n", doubleResult * 2);
        System.out.printf("%f%n", doubleResult / 2);
        System.out.printf("%f%n", doubleResult + 8);
        System.out.printf("%f%n", doubleResult % 7);
    }
}
