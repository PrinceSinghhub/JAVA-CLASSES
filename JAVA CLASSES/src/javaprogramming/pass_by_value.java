package javaprogramming;

import java.util.Scanner;

public class pass_by_value {
    public static void main(String[] args) {
        String s = "khushi";
        myname(s);
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int res = add(a,b);
        System.out.println(res);

        int se = add(a,b);
        System.out.println(se);

    }

    static int add(int a, int b) {
        return a+b;
    }

    static void myname(String d) {
       System.out.println(d);
    }

}
