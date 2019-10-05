package Solution8;

import java.util.Scanner;

public class Upperweight {
    public static void main(String[] args) {
        int upperWeight = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :-");
        String s1 = sc.next();
        for(int i = 0; i<s1.length(); i++) {
            if(s1.charAt(i)>='A' && s1.charAt(i)<= 'z'){
                upperWeight = upperWeight + (int)s1.charAt(i);

            }
        }
        System.out.println("Upperweight =" + upperWeight);
    }
}
