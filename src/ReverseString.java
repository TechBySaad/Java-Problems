import java.util.Scanner;

public class ReverseString {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter a Word: ");
        String word = scanner.next();
        String reverseWord = "";
        int length = word.length();

        for(int i = 0; i< length; i++ ){
            char ch = word.charAt(i);
            reverseWord = ch + reverseWord;
        }
        System.out.println("The reverse of the word is: "+ reverseWord);

        scanner.close();
    }
}
