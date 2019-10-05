package Solution6;

import java.util.Scanner;

public class Uppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :-");
        String s1 = sc.next();
        String s2 = s1.toUpperCase();
        System.out.println(s2);
    }
}
