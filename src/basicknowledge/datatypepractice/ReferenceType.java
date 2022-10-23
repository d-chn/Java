package basicknowledge.datatypepractice;

public class ReferenceType {
    public static void main(String[] args) {
        int x = 7;
        int y = x;

        String str1 = "Hello";//声明引用变量str1，并创建“Hello”对象
        String str2 = str1;//str2和str1指向相同的内存地址，引用同一个对象。
        str2 = "World";//str2和str1不再指向相同的内存地址。
    }
}
