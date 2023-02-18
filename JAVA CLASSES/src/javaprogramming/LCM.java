package javaprogramming;

public class LCM {
    public static void main(String[] args) {

        int n = 6;
        int m = 8;
        int res = lcm_find(n,m);
        System.out.println(res);
    }

    static int lcm_find(int n, int m) {
        int great = 0;
        int lcm= 0;

        if(n>m){
            great = n;
        }
        else {
            great = m;
        }

        while (true){
            if(great%n==0 && great%m==0){
                lcm  = great;
                break;
            }
            great++;
        }
        return lcm;
    }
}
