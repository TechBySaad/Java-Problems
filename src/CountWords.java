import java.util.Scanner;

public class CountWords {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a Sentence: ");
        String sentence = scanner.nextLine();

        int length = sentence.length();
        int space = 0;


        for (int i = 0; i < length; i++) {
            char ch = sentence.charAt(i);
            if(ch == ' '){
                space++;
            }
        }

        int words = space + 1;
        System.out.println("Total number of words in your sentence are: " + words);


        scanner.close();
    }
}
