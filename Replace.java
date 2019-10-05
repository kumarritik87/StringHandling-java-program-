package Solution3;
import java.util.Scanner;
public class Replace {
        public static void main(String[] args) {
            int count = 0;
            Scanner scanner = new Scanner(System.in);
            String inputString = scanner.next();

            inputString = inputString.toLowerCase();
            for (int i = 0; i < inputString.length(); i++) {
                if (inputString.charAt(i) == 'a' || inputString.charAt(i)=='e' || inputString.charAt(i)=='o' || inputString.charAt(i)=='u' || inputString.charAt(i)=='i') {
                    char replaceChar = inputString.charAt(i);
                    count += 1;

                            inputString = inputString.replace(replaceChar, '*');
                }
            }
            System.out.println(inputString);
            scanner.close();
        }
    }