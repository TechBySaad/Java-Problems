import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, sum = 0;
        System.out.print("Enter a Number (more than 1 digit): ");
        number = sc.nextInt();

        while(number != 0){
            int digit = number % 10; // give the last number
            sum = sum + digit;
            number = number / 10;
        }
        System.out.println("The sum of all the digits of this Number is: " + sum);
        sc.close();
    }
}
