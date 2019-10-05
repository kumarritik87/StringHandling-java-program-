package Solution5;

import java.util.Scanner;

public class ReplaceString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:-");
        String s1 = sc.next();
        System.out.println("Enter the Substring");

        String substring1 = sc.next();
        System.out.println("enter the value to replaced with Substring : ");
        String s3 = sc.next();
        String ansString = s1.replace(substring1,s3);
        System.out.println(ansString);
    }
}
