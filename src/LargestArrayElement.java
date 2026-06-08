import java.util.Scanner;

public class LargestArrayElement {
    public static void main(String[] args) {

     //   int[] numbers = {2, 3, 4, 9, 5, 6};
        Scanner scanner = new Scanner(System.in);

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

        int largest = numbers[0];
        int length = numbers.length;

        for(int i = 0; i<= length-1; i++){
            int number = numbers[i];
            if(number > largest){
                largest = number;
            }
        }
        System.out.println("The largest Element is: "+largest);
    }
}
