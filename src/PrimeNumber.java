import java.util.Scanner;

public class PrimeNumber {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int num = number - 1;
        boolean isPrime = true;

        for (int i = num; i >= 2; i--) { // if we have to check if a number is not prime, we should divide it by numbers apart from 1 and itself.
            int result = number % i;
            if (result == 0) {
                isPrime = false;
                break;
            }

        }
        if (isPrime) {
            System.out.println("It is a Prime Number");
        } else {
            System.out.println("It is not a Prime number");
        }


        scanner.close();
    }
}
