package basicknowledge.OperatorsPractice;

public class LogicalOperatorsPractice {
    public static void main(String[] args) {
        //������������
        int a = 10;
        int b = 9;
        boolean c = (a < b) && a++ == --b;//a<bΪfalse��֮��ı��ʽ���ټ��㡣
        System.out.printf("(a < b) && a++ == --b = %b%n", c);
        System.out.printf("a = %d%n", a);
        System.out.printf("b = %d%n", b);

        //���³�ʼ������
        a = 10;
        b = 9;
        c = (a < b) || a++ == --b;
        System.out.printf("(a < b) || a++ == --b = %b%n", c);
        System.out.printf("a = %d%n", a);
        System.out.printf("b = %d%n", b);

        //���³�ʼ������
        a = 10;
        b = 9;
        c = (a < b) & a++ == --b;//a<bΪfalse��֮��ı��ʽ���ټ��㡣
        System.out.printf("(a < b) && a++ == --b = %b%n", c);
        System.out.printf("a = %d%n", a);
        System.out.printf("b = %d%n", b);

        //���³�ʼ������
        a = 10;
        b = 9;
        c = (a < b) | a++ == --b;
        System.out.printf("(a < b) || a++ == --b = %b%n", c);
        System.out.printf("a = %d%n", a);
        System.out.printf("b = %d%n", b);

    }
}
