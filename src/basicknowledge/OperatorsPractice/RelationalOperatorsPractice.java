package basicknowledge.OperatorsPractice;

public class RelationalOperatorsPractice {
    public static void main(String[] args) {
        //�����������ͱȽ�
        System.out.println("---�Ƚϻ�����������---");
        int v1 = 1;
        int v2 = 2;

        System.out.printf("v1==v2 Ϊ %b%n", v1 == v2);
        System.out.printf("v1!=v2 Ϊ %b%n", v1 != v2);
        System.out.printf("v1>v2 Ϊ %b%n", v1 > v2);
        System.out.printf("v1<v2 Ϊ %b%n", v1 < v2);
        System.out.printf("v1>=v2 Ϊ %b%n", v1 >= v2);

        //�����������ͱȽ�
        System.out.println("---�Ƚ�������������---");
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        String s3 = s1;
        System.out.printf("�Ƚ�s1��s2�Ƿ�Ϊͬһ������%b%n", s1 == s2);
        System.out.printf("�Ƚ�s1��s2�������Ƿ���ͬ��%b%n", s1.equals(s2));
        System.out.printf("�Ƚ�s1��s3�Ƿ�Ϊͬһ������%b%n", s1 == s3);
        
    }
}
