import java.util.Scanner;

public class LinearSearch {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int sum = 0;
        System.out.print("Enter Size of Array: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter the #" + (i + 1) + " number: ");
            numbers[i] = scanner.nextInt();
        }
        // Loop to display all the elements in an array;
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.print("Search for an element's index: ");
        int search = scanner.nextInt();

        boolean found = false;
        int index = 0;
        for (int i = 0; i < size; i++) {
            if(search == numbers[i]){
                    found = true;
                    index = i;
                    break;
            }
        }
        if (found) {
            System.out.println("The number is at index: " + index);
        } else {
            System.out.println("Element not found");
        }

        scanner.close();

    }
}
