package basicknowledge.datatypepractice;

public class AutomaticTypeConversion {
    public static void main(String[] args) {
        //������������
        byte byteNum = 16;
        short shortNum = 16;
        int intNum = 16;
        long longNum = 16L;

        //��byte����ת��Ϊint����
        intNum = byteNum;
        //����char����
        char charNum = 'H';
        //��char����ת��Ϊint����
        intNum = charNum;
        //�����������
        //��long����ת��Ϊ��������
        float floatNum = longNum;
        //��float����ת��Ϊdouble����
        double doubleNum = longNum;
        //���ʽ������������double
        double result = floatNum + intNum + doubleNum / shortNum;
        System.out.println("������Ϊ��" + result);
    }
}
