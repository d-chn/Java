package basicknowledge.datatypepractice;

public class ForcedTypeConversion {
    public static void main(String[] args) {
        //int�ͱ���
        int i = 10;
        //��int�ͱ���iǿ��ת����byte
        byte b = (byte) i;
        //����Ҫǿ��ת��
        int i1 = (int) i;
        int i2 = (int) i;

        float c1 = i / 3;//��ķ�Χ���Զ�ת����С�ķ�Χ
        System.out.println("c1=" + c1);
        //��int�ͱ���iǿ��ת��Ϊfloat
        float c2 = (float) i / 3;
        System.out.println("c2=" + c2);

        //���ȶ�ʧʾ��
        long yourNumber = 6666666666L;
        System.out.println(yourNumber);
        int myNumber = (int) yourNumber;
        System.out.println(myNumber);//����Χת����С��Χ�������˾��ȶ�ʧ
    }
}
