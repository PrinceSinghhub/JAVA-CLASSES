package javaprogramming;

public class myfun {
    public static void main(String[] args) {
        int a = myAdd();
        System.out.println(a);
        String s = myname();
        System.out.println(s);
        String s1 = notnull();
        System.out.println(s1);


    }

    static String notnull() {
        return null;
    }


    static String myname() {
        System.out.println("Hello");
        return "hello";
    }

    static int myAdd() {
        int a = 50;
        System.out.println("hello");
        return a; //end the function
//        System.out.println("hello");
    }
}

