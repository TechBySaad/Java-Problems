import java.util.Scanner;

public class StringPalindrome {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a Word: ");
        String word = scanner.next();
        String original = word;
        String rev = "";
        int length = word.length();

        for (int i = 0; i < length; i++) {
            char ch = word.charAt(i);
            rev = ch + rev;
        }
        if(original.equals(rev)){
            System.out.println("The string is palindrome.");
        } else {
            System.out.println("The string is not a palindrome");
        }

        scanner.close();
    }
}
