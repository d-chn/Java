package Basic.TobeArchived;

public class WhilePractice04 {
    public static void main(String[] args) {
        int i = 0;
//        int flag = 1;
//        while(i<=130){
//            System.out.print(i+"\t");
//            i++;
//            flag++;
//            if(flag==7){
//                System.out.println("");
//                flag = 1;
//            }
//        }
        //不加flag的方法
        while (i <= 130) {
            System.out.print(i + "\t");
            if ((i + 1) % 8 == 0) {
                System.out.print("\n");
            }
            i++;
        }
    }
}
