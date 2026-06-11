import java.util.Scanner;

public class IndexOfLargestArray {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter the size of array: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter the #" + (i + 1) + " number: ");
            numbers[i] = scanner.nextInt();
        }
        int largest = numbers[0];

        int index = 0;
        for (int i = 1; i < size; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
                index = i;

            }
        }
        System.out.println(index);

    }

}
