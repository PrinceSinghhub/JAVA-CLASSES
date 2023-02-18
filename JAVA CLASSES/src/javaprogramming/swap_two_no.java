package javaprogramming;

import java.util.Arrays;

public class swap_two_no {
    public static void main(String[] args) {
        int a = 30;
        int b = 40;

        swap(a,b); // swap(30,40)
//        System.out.println(a+b);
        System.out.println(a); // 40
        System.out.println(b); // 30



//        todo note preimitive data type like int,char,float etc all just pass the value not pass by reference
        // todo for complex data types pass value of reverence variabl  like arry,map,hash,tree also non as non primitive
        // pass by reference &a = [1,2,3,45,6,,9,9,,1]
        // pass value using reference varivale = a[2] = 600;
        // a = [1,2,3,4,5]     a[2] = 900

        int[] arr ={1,2,3,4,5};
        changearr(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void changearr(int[] arr) {
        arr[2] = 600;
    }

    static void swap(int a, int b) {
        int temp = a;
        a = b ;
        b = temp;
        System.out.println(a); // 40
        System.out.println(b); // 30

    }
}
