package javaprogramming;

import java.util.Scanner;
public class user_input_and_print {
    public static void main(String[] args) {
////        System.out.print("hello khushi");
////        System.out.println("hello ajeet");
//        System.out.printf("%s","hello world\n");
        Scanner s = new Scanner(System.in);
        System.out.print("Enter No1: ");
        int x = s.nextInt();
        System.out.print("Enter No2: ");
        int y = s.nextInt();

        int sum = x+y;
        System.out.println("ADDITION IS: "+ sum);
        System.out.print(x+y);

        System.out.printf("the addition of %d + %d = %d",x,y,sum);


    }
}
