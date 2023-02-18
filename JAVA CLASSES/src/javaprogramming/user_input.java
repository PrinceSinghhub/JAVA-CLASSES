package javaprogramming;

import java.util.Scanner;

public class user_input {
    public static void main(String[] args) {

        Scanner khushi = new Scanner(System.in);

//        int a = khushi.nextInt();
//        System.out.println(a);
//        short s = khushi.nextShort();
//        String c = khushi.next(); // char or world
//        System.out.println(c);
//
//
//
//        String s = khushi.nextLine(); // hole line
//        System.out.println(s);
        boolean d = khushi.hasNextFloat();  // 55.22
        System.out.println(d);

        boolean a = khushi.hasNextInt();
        System.out.println(a);

        boolean d1 = khushi.hasNext();
        System.out.println(d1);

//        int a = khushi.nextInt();
//        int b = khushi.nextInt();
//        System.out.println(a+b);




//        String c = khushi.next(); // char or world
//        System.out.println(c);

    }
}
