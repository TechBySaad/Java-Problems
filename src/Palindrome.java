import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Number to check if it is a palindrome or not: ");
        int number = scanner.nextInt();

        int original = number; // this is used to preserve the original number as it is during loops
        int reverse = 0;

        while (number != 0) {
            int digit = number % 10;
            reverse = reverse *10 + digit;
            number = number / 10;
        }
        if(original == reverse){
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It is not a palindrome");

        }



        scanner.close();
    }
}
