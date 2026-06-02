import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int number = sc.nextInt();
        int reverse = 0;

        while(number !=0){
            int digit = number % 10; // Extracts each digit.
            reverse = reverse * 10 + digit;
            number = number / 10; // removes the last number
        }

        System.out.println(reverse);
        sc.close();
    }
}
