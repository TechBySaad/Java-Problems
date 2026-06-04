import java.util.Scanner;

public class SumOfDigitInString {

        static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {

            System.out.print("Enter a word: ");
            String word = scanner.next();
            int count = 0;
            int length = word.length();
            int digit = 0;

            for(int i = 0; i<length; i++){
                char ch = word.charAt(i);
                if(Character.isDigit(ch)){
                   digit += Character.getNumericValue(ch);

                }
            }
            System.out.println("Sum of digits is: " + digit);

            scanner.close();
        }
    }

