package Solution11;

import java.util.Scanner;

public class AllindexOfchar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : -");
        String s1 = sc.next();
        System.out.println("Enter the value to find index :-");
        String ch = sc.next();
        System.out.println("Index: ");
        for (int i=0; i<s1.length(); i++){
            if(s1.charAt(i) == ch.charAt(0)) {

                System.out.println(i);
            }


            }
        }
    }

