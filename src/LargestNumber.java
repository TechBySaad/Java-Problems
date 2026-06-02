import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int largest = 0;

        while (number != 0) {
            int digit = number % 10;
            if(digit>largest){
                largest = digit;
            }
            number = number/10;
        }
        System.out.println(largest);
        scanner.close();
    }
}
