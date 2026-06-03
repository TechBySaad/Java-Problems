import java.util.Scanner;

public class LargestNNumber {
    // Find the largest number given by the user;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter the count of numbers you want to compare: ");
        int count = scanner.nextInt();
        System.out.print("Enter the #1 number: ");
        int firstNum = scanner.nextInt();
        int largest = firstNum;
        int secondLargest = 0;

        for (int i = 2; i <= count; i++) {
            System.out.print("Enter the #" + i + " number: ");
            int number = scanner.nextInt();
            if(number > largest){
                secondLargest = largest;
                largest = number;
            }
            else if(number > secondLargest){
                secondLargest = number;
            }

        }
        System.out.print("The largest Number is: " + largest);
        System.out.println();
        System.out.println("The Second largest Number is: " + secondLargest);

        scanner.close();
    }


}


