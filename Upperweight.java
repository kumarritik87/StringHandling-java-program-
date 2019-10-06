package Solution8;

import java.util.Scanner;

public class Upperweight {
    public static void main(String[] args) {
        int upperWeight = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :-");
        String s1 = sc.next();
        for(int i = 0; i<s1.length(); i++) {
            if((int)s1.charAt(i)>64 && (int)s1.charAt(i)< 98){
                upperWeight = upperWeight + (int)s1.charAt(i);

            }
        }
        System.out.println("Upperweight =" + upperWeight);
    }
}
