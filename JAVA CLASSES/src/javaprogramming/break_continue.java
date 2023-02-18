package javaprogramming;
public class break_continue {
    public static void main(String[] args) {
        for (int i = 0; i <=5; i++) {
//            System.out.print(i+" ");
            if(i==4 || i==2){
                continue;
            }

            System.out.print(i+" ");

        }
    }
}
