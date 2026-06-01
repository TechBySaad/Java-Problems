import java.util.Scanner;

public class FirstnNumbers {
    // Formula (n*(n+1))/2
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an N number (example 5): ");
        int n = sc.nextInt();
        int sum = 0;

        // Using Formula
        //int sum = (n*(n+1))/2;

        // Using for-loop
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }

        System.out.println("The Sum of First N numbers is: "+ sum);
    }
}
