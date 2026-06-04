import java.util.Scanner;

public class CountDigitsInString {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter a word: ");
        String word = scanner.next();
        int count = 0;
        int length = word.length();

        for(int i = 0; i<length; i++){
            char ch = word.charAt(i);
            if(Character.isDigit(ch)){
                count++;
            }
        }
        System.out.println("There are total "+ count + " digits in your string");

        scanner.close();
    }
}
