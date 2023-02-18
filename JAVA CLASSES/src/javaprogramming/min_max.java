package javaprogramming;

import java.util.Scanner;

public class min_max {
    public static void main(String[] args) {
        //113%10 = last digit
        int min; //1203 = 0 max= 3
        int max = 0;
        Scanner n = new Scanner(System.in);
        System.out.print("Enter no: ");
        int a = n.nextInt();
        min = a; //123

//        todo max
        while(a>0){
            int rem = a%10;
            if(rem>max){
                max= rem;
            }
            if(rem<min){
                min = rem;
            }
            a=a/10;

        }
        System.out.println("Max no: " + max);
        System.out.println("Min no: " + min);
    }
}
