package Solution7;

import java.util.Scanner;

public class TotalWeightOfChar {
    public static void main(String[] args) {
        int totalWeight =0;
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        int a2 =s1.length();
        for(int i=0; i<a2; i++){
            int weightOfChar = (int)s1.charAt(i);
            totalWeight = totalWeight + weightOfChar;

        }
        System.out.println("Total Weight = " +totalWeight);

    }
}
