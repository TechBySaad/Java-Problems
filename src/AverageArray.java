import java.util.Scanner;

public class AverageArray {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int sum = 0;
        System.out.print("Enter Size of Array: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        for(int i = 0; i < size; i++){
            System.out.print("Enter the #"+ (i+1) + " number: ");
            numbers[i] = scanner.nextInt();
        }

        for(int i = 0; i < size; i++) {
            sum = sum + numbers[i];
        }
        double result = (double) sum / size;
        System.out.println("Average of Array: "+result);


        scanner.close();
    }
}
