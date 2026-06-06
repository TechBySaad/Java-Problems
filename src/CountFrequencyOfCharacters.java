import java.util.Scanner;
public class CountFrequencyOfCharacters {
    // i/p = Programming
    // o/p = character: m , Frequency: 2.
    public static void main(String[] args) {

        String word = "Programming";
        int length = word.length();
        int count = 0;
        char c=' ';

        for (int i = 0; i < length; i++) {
            char ch = word.charAt(i);
            if (ch == 'm'||ch == 'M') {
                c = ch;
                count++;
            }
        }

        System.out.println("The Word is: " + word);
        System.out.println("The Character is: " + c);
        System.out.println("The frequency is: " + count);
    }

}
