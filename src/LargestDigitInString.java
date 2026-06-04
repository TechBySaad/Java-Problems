import java.util.Scanner;

public class LargestDigitInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.next();
        int length = word.length();
        int largest = 0;

        for(int i = 0; i < length; i++) {
            char ch = word.charAt(i);
            if(Character.isDigit(ch)){
              int digit =  Character.getNumericValue(ch);
                if(digit>largest){
                    largest = digit;
                }

        }

        }
        System.out.println("The largest digit is " + largest);

        scanner.close();

    }
}
