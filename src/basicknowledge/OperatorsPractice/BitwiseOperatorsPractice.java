package basicknowledge.OperatorsPractice;

public class BitwiseOperatorsPractice {

    public static void main(String[] args) {
        byte a = 0b1010;//十进制10
        byte b = 0b1100;//十进制12,0b或0B为前缀表示二进制数。

        System.out.printf("a = %d%n", a);
        System.out.printf("b = %d%n", b);
        System.out.printf("a | b = %d%n", a | b);
        System.out.printf("a | b = %d%n", a & b);
        System.out.printf("a | b = %d%n", a ^ b);//a与b按位进行异或运算，只有两位相反时这位才为1，否则为0。
        System.out.printf("~b = %d%n", (~b));

        System.out.printf("a >> 2 = %d%n", (a >> 2));
        System.out.printf("a >> 1 = %d%n", (a >> 1));
        System.out.printf("a >>> 2 = %d%n", (a >>> 2));
        System.out.printf("a << 2 = %d%n", (a << 2));
        System.out.printf("a << 1 = %d%n", (a << 1));
    }
}
