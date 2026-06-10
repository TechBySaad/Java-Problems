import java.util.Scanner;

public class Fibonacci {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the number for Iteration: ");
        int iteration = scanner.nextInt();

        int start = 0;
        int second = 1;

        for (int i = 1; i <= iteration; i++) {
            System.out.print(start + " ");
            int next = start + second;
             start = second;
             second = next;

        }
    }
}
