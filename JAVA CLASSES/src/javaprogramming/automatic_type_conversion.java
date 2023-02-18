package javaprogramming;

public class automatic_type_conversion {
    public static void main(String[] args) {
//        int a = 65000;
//        short b = (short) a; // todo 1 bytes = 256 > a  257%256 = 1   255%256 = -1   a%65536
//
//        System.out.println(b);
//
//        System.out.println(a%65536);
//
//        byte x = 40;
//        byte y = 30;
//        byte z = 10;
//
//        int r = x*y/z;
//        System.out.println(r);

//        byte a = 100;
//        a = 50*2;
//        byte b = 50;
//        b = (byte)(b * 2);
//        System.out.println(b);

//        int a = 'न';
//        System.out.println(a);

//        todo summery
        byte b =42;
        char c = 'k';
        short s = 1024;
        int i = 365700;
        float f = 5.32f;
        double d = 55.50;

        double result = (f*b) + (d*c) - (b*i);
        //               f    +  d    -  i
        System.out.println(f*b);
        System.out.println(d*c);
        System.out.println(b*i);
//         223.44 + 5639.5 + 15359400
        System.out.println(223.44 + 5639.5 - 15359400);
        System.out.println(result);


    }


}
