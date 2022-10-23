package basicknowledge.OperatorsPractice;

public class BitwiseOperatorsPractice {

    public static void main(String[] args) {
        byte a = 0b1010;//ʮ����10
        byte b = 0b1100;//ʮ����12,0b��0BΪǰ׺��ʾ����������

        System.out.printf("a = %d%n", a);
        System.out.printf("b = %d%n", b);
        System.out.printf("a | b = %d%n", a | b);
        System.out.printf("a | b = %d%n", a & b);
        System.out.printf("a | b = %d%n", a ^ b);//a��b��λ����������㣬ֻ����λ�෴ʱ��λ��Ϊ1������Ϊ0��
        System.out.printf("~b = %d%n", (~b));

        System.out.printf("a >> 2 = %d%n", (a >> 2));
        System.out.printf("a >> 1 = %d%n", (a >> 1));
        System.out.printf("a >>> 2 = %d%n", (a >>> 2));
        System.out.printf("a << 2 = %d%n", (a << 2));
        System.out.printf("a << 1 = %d%n", (a << 1));
    }
}
