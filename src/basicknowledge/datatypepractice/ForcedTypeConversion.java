package basicknowledge.datatypepractice;

public class ForcedTypeConversion {
    public static void main(String[] args) {
        //int型变量
        int i = 10;
        //将int型变量i强制转换成byte
        byte b = (byte) i;
        //不需要强制转换
        int i1 = (int) i;
        int i2 = (int) i;

        float c1 = i / 3;//大的范围被自动转换成小的范围
        System.out.println("c1=" + c1);
        //将int型变量i强制转换为float
        float c2 = (float) i / 3;
        System.out.println("c2=" + c2);

        //精度丢失示例
        long yourNumber = 6666666666L;
        System.out.println(yourNumber);
        int myNumber = (int) yourNumber;
        System.out.println(myNumber);//将大范围转换成小范围，出现了精度丢失
    }
}
