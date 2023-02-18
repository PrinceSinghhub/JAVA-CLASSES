package javaprogramming;

import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No: ");
        int n = sc.nextInt();


//        if(n<5){
//            System.out.println("hello");
//        }
//        else if(n<=5){
//            System.out.println("good");
//
//        }
//        else if(n==2){
//            System.out.println("nice");
//
//        }
//        else {
//            System.out.println("sorry");
//        }


        // code break by default beauty of code code small
//        switch (n) {
//            case 1 -> System.out.println("khushi");
//            case 2 -> System.out.println("hello ji");
//            case 3 -> System.out.println("coder");
//            case 4 -> System.out.println("codex coder");
//            case 5 -> System.out.println("ok byy");
//            case 6 -> System.out.println("heeji");
//            default -> System.out.println("sorry");
//        }

//        todo multile line code
        //            default -> System.out.println("sorry");
        //        }
        //        String a = "codex";
        //        String b = "codex";
        //        if (a.equals(b)) {
        //            System.out.println("hello");
        //        }
        switch (n) {
            case 1 -> {
                int i = 1;
                System.out.println(n == i);
                System.out.println("good");
            }
            case 2 -> {
                System.out.println("big");
                System.out.println("hello");
                System.out.println("if else");
            }
            case 3 -> System.out.println("coder");
            case 4 -> {
                System.out.println("codex coder");
                System.out.println("codex coder");
                System.out.println("codex coder");
                System.out.println("codex coder");
            }
            case 5 -> System.out.println("ok byy");
            case 6 -> System.out.println("heeji");
            case 7, 8, 9, 10, 11 -> System.out.println("all true");
            default -> System.out.println("sorry");
        }
    }
}

