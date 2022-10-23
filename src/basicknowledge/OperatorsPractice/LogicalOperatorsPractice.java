package basicknowledge.OperatorsPractice;

public class LogicalOperatorsPractice {
    public static void main(String[] args) {
        //声明两个变量
        int a = 10;
        int b = 9;
        boolean c = (a < b) && a++ == --b;//a<b为false，之后的表达式不再计算。
        System.out.printf("(a < b) && a++ == --b = %b%n", c);
        System.out.printf("a = %d%n", a);
        System.out.printf("b = %d%n", b);

        //重新初始化变量
        a = 10;
        b = 9;
        c = (a < b) || a++ == --b;
        System.out.printf("(a < b) || a++ == --b = %b%n", c);
        System.out.printf("a = %d%n", a);
        System.out.printf("b = %d%n", b);

        //重新初始化变量
        a = 10;
        b = 9;
        c = (a < b) & a++ == --b;//a<b为false，之后的表达式不再计算。
        System.out.printf("(a < b) && a++ == --b = %b%n", c);
        System.out.printf("a = %d%n", a);
        System.out.printf("b = %d%n", b);

        //重新初始化变量
        a = 10;
        b = 9;
        c = (a < b) | a++ == --b;
        System.out.printf("(a < b) || a++ == --b = %b%n", c);
        System.out.printf("a = %d%n", a);
        System.out.printf("b = %d%n", b);

    }
}
