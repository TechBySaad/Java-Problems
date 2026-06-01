import java.util.Scanner;
/*
  Expected Output:
  Enter the count of Number: 3
  Enter the #1 number: 9
  Enter the #2 number: 1
  Enter the #3 number: 5
  The average of you Numbers is: 5.0
 */
public class AverageOfGivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count, num, sum = 0;
        double average= 0;

        System.out.print("Enter the count of Number: ");
        count = sc.nextInt();

        for (int i = 1; i <= count; i++) {
            System.out.print("Enter the #"+ i + " number: ");
            num = sc.nextInt();

            sum =num + sum; // stores the sum of all the numbers
        }

        average = sum/count; // calculates the average

        System.out.println("The average of you Numbers is: " + average);
    }
}
