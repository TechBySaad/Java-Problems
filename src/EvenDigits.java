import java.util.Scanner;
// Count how many even digits in the given number
public class EvenDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (more than 2 digits): ");
        int number = sc.nextInt();
        int count = 0;
        while (number != 0) {
            int digit = number % 10;// extracts each digit
            if(digit % 2 ==0){ // checks if each digit is even or not
                count++;
            }
            number = number / 10; // removes the last number


        }
        System.out.println("There are total " + count + " even number(s) in the given number");

        sc.close();
    }

}