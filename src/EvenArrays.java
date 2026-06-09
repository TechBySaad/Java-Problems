import java.util.Scanner;

public class EvenArrays {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter Size of Array: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        for(int i = 0; i < size; i++){
            System.out.print("Enter the #"+ (i+1) + " number: ");
            numbers[i] = scanner.nextInt();
        }
       int count = 0;
        for (int i = 0; i < size; i++) {
            if(numbers[i] % 2 == 0){
                count++;
            }
        }
        System.out.println("Total Even numbers in this array are: "+ count);

        scanner.close();
    }
}
