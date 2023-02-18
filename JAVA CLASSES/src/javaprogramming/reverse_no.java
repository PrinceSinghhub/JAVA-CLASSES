package javaprogramming;
import java.util.Scanner;

public class reverse_no {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //0 0 0 0 = string
        // 132 = reverse = 0 = reverse*10 + 123%10 reverse = 3  3*10 = 30 + 2 32
        System.out.print("Enter no: ");
        String input = s.nextLine();



        char  first = input.charAt(0);
        char second = input.charAt(input.length()-1);

        int f = Character.getNumericValue(first);
        int l = Character.getNumericValue(second);

        int reverse = 0;
        String result = "";

        if((f==0 && l==0) || (f==0 || l==0)){
            for (int i = input.length()-1; i >= 0; i--) {
                result+=input.charAt(i);
            }

            System.out.println("Reverse no: " + result);
        }
        else{
            int n = Integer.parseInt(input);

            do{
                reverse = (reverse*10)+(n%10); //987654321+0 = 987654321
                n = n/10;
            }while (n>0);


            System.out.println("Reverse no: " + reverse);
        }

    }
}
