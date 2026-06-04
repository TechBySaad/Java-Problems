import java.util.Scanner;

public class CountLowerCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.next();
        int length = word.length();
        int count = 0;

        for(int i = 0; i<length; i++){
            char ch = word.charAt(i);
            if(Character.isLowerCase(ch)){
                count++;
            }
        }
        System.out.println("Lowe Case Characters: "+ count);

    }
}
