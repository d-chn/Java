package basicknowledge.datatypepractice;

public class ReferenceType {
    public static void main(String[] args) {
        int x = 7;
        int y = x;

        String str1 = "Hello";//�������ñ���str1����������Hello������
        String str2 = str1;//str2��str1ָ����ͬ���ڴ��ַ������ͬһ������
        str2 = "World";//str2��str1����ָ����ͬ���ڴ��ַ��
    }
}
