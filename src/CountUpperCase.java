import java.util.Scanner;

public class CountUpperCase {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.print("Enter a word: ");
        String word = scanner.next();


        int length = word.length(); // length of the string
        int count = 0;


        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if(Character.isUpperCase(ch)){
                count++;
        }
        }
        System.out.println("There are total " + count + " Upper case characters.");
        scanner.close();
    }
}
