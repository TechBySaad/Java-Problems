import java.util.Scanner;
/*
  Expected Output:
  Enter the count of numbers: 2
  Enter the #1 number: 3
  Enter the #2 number: 7
  The sum of Numbers is: 10
 */
public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count, num, sum = 0;
        System.out.print("Enter the count of numbers: ");
        count = sc.nextInt();

        for (int i = 1; i <= count; i++) {
            System.out.print("Enter the #" + i + " number: ");
            num = sc.nextInt(); // stores all the number user gives

            sum += num; // adds all the number user gives
        }
        System.out.println("The sum of Numbers is: " + sum);


        sc.close();

    }
}