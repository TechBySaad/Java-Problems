import java.util.Scanner;

public class SmallestArray {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter the size of array: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        for(int i = 0 ; i < size; i++){

            System.out.print("Enter the #" + i + " number: ");
            numbers[i] = scanner.nextInt();
        }

        int smallest = numbers[0];

        for (int i = 1; i < size; i++) {
            int number = numbers[i];
            if(smallest>number){
                smallest = number;
            }
        }

        System.out.println("The Smallest element is: "+ smallest);

        scanner.close();
    }

}
