import java.util.Scanner;

public class IndexSmallElement {
     static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter the size of Array: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        for(int i = 0; i<numbers.length;i++){
            System.out.print("Enter the #" + (i+1) + " number: ");
            numbers[i] = scanner.nextInt();
        }
        int index = 0;

        int smallest = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]<smallest){
                smallest = numbers[i];
                index = i;
            }
        }
        System.out.println("The smallest number of this array is: "+smallest);
        System.out.println("It's index is: "+index);

        scanner.close();
    }
}
