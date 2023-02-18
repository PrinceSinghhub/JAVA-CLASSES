package javaprogramming;

import java.util.Arrays;

public class variable_agrumnet {
    public static void main(String[] args) {

        myfun(1,2,3,4,5,6,7,8,9,10);
        mixarumrnt("coder",'t',1,2,3,4,5,6);
    }

   static void mixarumrnt(String n,char t,int ...a) {
       System.out.println(n);
       System.out.println(t);
       System.out.println(Arrays.toString(a));
    }

    static void myfun(int ...a){//String ...s
        System.out.println(Arrays.toString(a));
    }

    //mix argument

}
