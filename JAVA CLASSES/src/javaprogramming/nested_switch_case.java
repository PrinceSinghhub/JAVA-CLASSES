package javaprogramming;

import java.util.Scanner;

public class nested_switch_case {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        String name = n.next();
        int id = n.nextInt();

        switch (id) {
            case 100 -> System.out.println("coder");
            case 200 -> System.out.println("khushi");
            case 300 -> {
                System.out.println("Branches");
                switch (name) {
                    case "khushi" -> System.out.println("CSE");
                    case "coder" -> System.out.println("it");
                    case "codex" -> System.out.println("AI");
                }
            }
            case 400 -> System.out.println("kj");
            case 500 -> {
                System.out.println("branches");
                switch (name) {
                    case "coder":
                        System.out.println("it");
                    case "codex":
                        System.out.println("AI");
                        break;
                }
            }
            default -> System.out.println("sorry");
        }
    }
}
