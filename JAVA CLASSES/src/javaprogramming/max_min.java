package javaprogramming;

import java.util.Scanner;

public class max_min {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max=Math.max(c,Math.max(a,b));
        int min=Math.min(c,Math.min(a,b));

        System.out.println(max);
        System.out.println(min);


    }
}
