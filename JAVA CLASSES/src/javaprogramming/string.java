package javaprogramming;

import java.security.SecureRandom;
import java.util.Locale;

public class string {
    public static void main(String[] args) {

        String name = "Coder";


//        todo string methode
        // len()
        System.out.println(name.length());

        // lowercase
        System.out.println(name.toLowerCase());

        // uppercase
        System.out.println(name.toUpperCase());

        // trim remove L AND R balnk spacess
        String s = "      coder      ";
        System.out.println("           coder            ");
        System.out.println(s.trim());

        //Substring just like a slicing
        String sli = "khushi jaiswal";
        //3 12
        System.out.println(sli.substring(3,12));

        // replace repace a char with some cahr
        String re = "coder coder apple";
        //d = khushi
        System.out.println(re.replace("coder","khushi"));

        // startswith return boolen
        String sw = "coder codex";
        System.out.println(sw.startsWith("d"));

        //endwith
        String ew = "coder khushi";
        System.out.println(ew.endsWith("shi"));

        //most imp index
        // ChatAt use for print s char with particulat index
        String id = "khushi";
        System.out.println(id.charAt(2));

        //indexOF use to char to index
        String ci = "khushi";
        System.out.println(ci.indexOf("h"));

        String ui = "coder";
        System.out.println(ui.indexOf("d",3));

        //lastindex
        //khushi = 4
        String ls = "khushi";
        System.out.println(ls.lastIndexOf("h"));
        System.out.println(ls.lastIndexOf("h",4));

        // comperession euqal
        //aman equal aman =true

        String a = "khusi";
        String b ="khushi";
       // boolean boo = a.equals(b);
        System.out.println(a.equals(b));

        //equalsignorecase  = sating only compare not cheak upper or lower
        String u = "KHUSHI";
        String l = "khushi";
        System.out.println(u.equalsIgnoreCase(l));

        //contains use for chek char are present or not
        String p = "coderx coder";
        System.out.println(p.contains("copy"));

        //empty check empty or not

        String em = "khushi";
        System.out.println(em.isEmpty());

        //imp lenth for find lenth a string
        String len = "Khushi";
        System.out.println(len.length());

        // replacefirst
        String rf = "khushi jaiswal";
        //k = l
        System.out.println(rf.replaceFirst("jaiswal","123"));


        //replace all
        String rall = "khushi khushi coder codex";
        System.out.println(rall.replaceAll("i","123"));


//        todo onluy use with loops
        // split split with particupar cahr or word

        String sp = "khushi is good boy";
        for(String n: sp.split("is")){
            System.out.println(n.trim());
        }

    }


}
