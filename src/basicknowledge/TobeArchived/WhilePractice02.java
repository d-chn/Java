package basicknowledge.TobeArchived;

public class WhilePractice02 {
    public static void main(String[] args) {
        int i = 0;
        int oddSum = 0;
        int evenSum = 0;
        while (i <= 100) {
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
            i++;
        }
        System.out.println("1-100�����ĺ�Ϊ��" + oddSum + ",ż���ĺ�Ϊ��" + evenSum);
//        int a = 1;
//        int b = 2;
//        int sum1 = 0;   //�������ĺ�
//        int sum2 = 0;   //��ż���ĺ�
//        while(a<=99){
//            sum1 += a;
//            a = a+2;
//        }
//        while(b<=100){
//            sum2 += b;
//            b = b+2;
//        }
//        System.out.println("1-100�����ĺ�Ϊ��"+sum1+" "+"1-100ż���ĺ�Ϊ��"+sum2);
    }
}
