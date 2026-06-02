import java.util.Scanner;

public class FindFactorial {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter a number to find it's factorial: ");
        int number = sc.nextInt();
        int result = 1;
        for (int i = number; i >= 1; i--) {
            result = result * i;
        }
        System.out.println("The factorial of the given number is: "+ result);

        sc.close();

    }
}
