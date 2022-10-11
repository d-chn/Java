package Basic.TobeArchived;

public class NestedLoopPractice03 {
    public static void main(String[] args) {
        for (int i = 9; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + "*" + i + "=" + (i * j) + "\t");
            }
            System.out.println();
        }
    }
}
