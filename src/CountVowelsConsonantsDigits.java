import java.util.Scanner;

public class CountVowelsConsonantsDigits {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter a String(numbers and alphabets): ");
        String string = scanner.next();
        int length = string.length();
        int digit = 0;
        int vowels = 0;
        int consonants = 0;


        for (int i = 0; i < length; i++) {
            char ch = string.charAt(i);
            if(ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I' || ch == 'i'||ch == 'U' || ch == 'u' ||ch == 'O' || ch == 'o'){
                vowels++;
            } else if(Character.isDigit(ch)){
                digit++;
            }
        }

        consonants = length - vowels - digit;
        System.out.println("Total number of vowels in the string are: "+vowels);
        System.out.println("Total number of consonants in the string are: "+consonants);
        System.out.println("Total number of digits in the string are: "+digit);




        scanner.close();
    }

}
