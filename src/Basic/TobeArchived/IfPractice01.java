package Basic.TobeArchived;

public class IfPractice01 {
    public static void main(String[] args) {
        double d = Math.random();   //����[0,1)֮����������
        int a = (int) (Math.random() * 6) + 1;   //����[1,6]֮�������һ������
        int b = (int) (Math.random() * 6) + 1;   //����[1,6]֮�������һ������
        int c = (int) (Math.random() * 6) + 1;   //����[1,6]֮�������һ������
        int count = a + b + c;
        System.out.println("�������ֱַ��ǣ�" + a + " " + b + " " + c + "������Ϊ��" + count);
        if (count > 15) {
            System.out.println("������������һ�ΰɣ�");
        }
        if (count <= 15 && count >= 10) {
            System.out.println("�����������ȿ�ˮ������~");
        }
        if (count < 10) {
            System.out.println("������̫�ã�����������~~");
        }
    }
}
