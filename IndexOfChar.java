package Solution10;

import java.util.Scanner;

public class IndexOfChar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :- ");
        String a1 = sc.next();
        System.out.println("Enter the value to find index : -");
        char ch = sc.next().charAt(0);
        int a3 = a1.indexOf(ch);
        System.out.println(a3);


    }
}
