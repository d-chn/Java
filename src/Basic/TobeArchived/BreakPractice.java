package Basic.TobeArchived;

public class BreakPractice {
    public static void main(String[] args) {
        int total = 0;

        int i;
        do {
            ++total;
            i = (int) Math.round(Math.random() * 100.0);
        } while (i != 88);

        System.out.println(i);
        System.out.println("总共运行了：" + total + "次，得到了数字88");
    }
}
