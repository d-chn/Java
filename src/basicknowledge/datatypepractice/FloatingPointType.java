package basicknowledge.datatypepractice;

public class FloatingPointType {
    public static void main(String[] args) {
        //声明浮点数
        //输出一个默认浮点常量
        System.out.println("默认浮点常量 = " + 360.66);
        float myMoney = 360.66f;
        double yourMoney = 360.66;
        final double PI = 360.66d; //表示double浮点数，数值后边也可以加字母d或D
        System.out.println("float浮点数 = " + myMoney);
        System.out.println("double浮点数 = " + yourMoney);
        System.out.println("PI  = " + PI);
    }
}
