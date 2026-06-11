import java.util.Scanner;

public class OccurrenceOfNumber {
     static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {



        int[] numbers = {2,4,4,5,6};

        for (int number : numbers) {
            System.out.print(number  + " ");
        }

        System.out.print("\nSelect a Number: ");
        int select = scanner.nextInt();

        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]==select){
                count++;
            }
        }
        System.out.println(select + " is repeated "+ count + " times.");
    }
}
