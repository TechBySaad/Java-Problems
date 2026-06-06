import java.util.Scanner;

public class RemoveDigits {
    // remove digits from a string
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        int length = word.length();
       String NewWord = "";

        for (int i = 0; i < length; i++) {
            char ch = word.charAt(i);
            if(Character.isAlphabetic(ch)){
                NewWord += ch;
            }

        }
        System.out.println(NewWord);

        scanner.close();
    }
}
