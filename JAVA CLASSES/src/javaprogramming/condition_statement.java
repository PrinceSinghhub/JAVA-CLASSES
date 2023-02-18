package javaprogramming;

import java.util.Scanner;

public class condition_statement {
    public static void main(String[] args) {

        boolean n = false;
        if(n==true){ //false == false = true    by default  = 1
            System.out.println("Hello");
        }
        //else if = combine more then one if condition
        else if(n == false){
            System.out.println("else if");
        }
        else{
            System.out.println("no");        //by defalut = 0
        }



    }
}
