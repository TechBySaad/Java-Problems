import java.util.Scanner;

public class SumOfArrays {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter the size of array: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter the #" + (i+1) + " number: ");
            numbers[i] = scanner.nextInt();
        }

        int sum = 0;

        for (int i = 0; i < size; i++) {
            sum = numbers[i] + sum;
        }
        System.out.println("Sum of Arrays is: " +sum);
        scanner.close();
    }
}
