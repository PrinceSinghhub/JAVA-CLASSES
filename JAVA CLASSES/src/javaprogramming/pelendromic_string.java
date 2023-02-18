package javaprogramming;
import java.util.Scanner;

public class pelendromic_string {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        String res = yes_or_not(name);
        System.out.println(res);
    }

    static String yes_or_not(String name) {
        String rev = "";
        for (int i = name.length()-1; i >=0; i--) {
            rev+=name.charAt(i);
        }
        if (rev.equals(name)){
            return "True";
        }
        else{
            return "False";
        }
    }
}
