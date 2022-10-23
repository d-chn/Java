package basicknowledge.datatypepractice;

public class AutomaticTypeConversion {
    public static void main(String[] args) {
        //声明整数变量
        byte byteNum = 16;
        short shortNum = 16;
        int intNum = 16;
        long longNum = 16L;

        //将byte类型转换为int类型
        intNum = byteNum;
        //声明char变量
        char charNum = 'H';
        //将char类型转换为int类型
        intNum = charNum;
        //声明浮点变量
        //将long类型转换为浮点类型
        float floatNum = longNum;
        //将float类型转换为double类型
        double doubleNum = longNum;
        //表达式计算后的类型是double
        double result = floatNum + intNum + doubleNum / shortNum;
        System.out.println("运算结果为：" + result);
    }
}
