package Basic.TobeArchived;

public class IfPractice02 {
    public static void main(String[] args) {
        double r = Math.random() * 4;
        double area = Math.PI * r * r;
        double circle = Math.PI * r * 2;
        System.out.println("�뾶�ǣ�" + r);
        System.out.println("����ǣ�" + area);
        System.out.println("�ܳ��ǣ�" + circle);
        if (area >= circle) {
            System.out.println("�������ֵ���ڵ����ܳ�����ֵ��");
        } else {
            System.out.println("�������ֵС���ܳ�����ֵ��");
        }
    }
}
