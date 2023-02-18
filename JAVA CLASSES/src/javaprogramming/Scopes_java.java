package javaprogramming;

public class Scopes_java {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);

    }

//    static void functionScope(int n){
//        System.out.println(a);
//    }
    static  void bloaccode(int n){

            int a = 600;


        System.out.println(a);

        {

            a = 600;
            System.out.println(a);
        }
//        System.out.println(r);
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
//        System.out.println(i);
    }

        }
