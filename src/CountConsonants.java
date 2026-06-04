import java.util.Scanner;

public class CountConsonants {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {


        System.out.print("Enter a word: ");
        String word = scanner.next();
        System.out.println(word.length());

        int length = word.length(); // length of the string
        int count = 0;


        for (int i = 0; i < length; i++) {
            char ch = word.charAt(i);
            if (ch == 'a' || ch == 'A' ) {
                count++;
            } else if (ch == 'e' || ch == 'E' ) {
                count++;
            } else if (ch == 'i' || ch == 'I' ) {
                count++;
            } else if (ch == 'o' || ch == 'O' ) {
                count++;
            } else if (ch == 'u' || ch == 'U' ) {
                count++;
            }
        }

        int consonants = length - count;
        System.out.println("The Consonants are "+consonants);
        scanner.close();
    }
}
