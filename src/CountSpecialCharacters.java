import java.util.Scanner;

public class CountSpecialCharacters {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // count special characters

        System.out.print("Enter a string: ");
        String word = scanner.nextLine();

        int length = word.length();
        int count = 0;

        for (int i = 0; i < length; i++) {
            char ch = word.charAt(i);

            if(Character.isDigit(ch) || Character.isAlphabetic(ch)){
             continue;
            } else {
                count++;
            }
        }
        int characters = count;
        System.out.println("Number of Special characters are: " + characters);


        scanner.close();
    }

}
