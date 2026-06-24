import java.util.Scanner;

public class EvenSumArray {
     static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {



        // to take the size of array
        System.out.print("Enter the size of array: ");
        int size = scanner.nextInt();

        // declaring the array of the size given my user.
        int[] numbers = new int[size];

        // taking the elements to add in an array
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the #" + (i+1) + " element: ");
            numbers[i] = scanner.nextInt();
        }
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sum = sum + numbers[i];
            }

        }
        System.out.println("The sum of all the Even numbers in the array is: "+sum);
    }
}
