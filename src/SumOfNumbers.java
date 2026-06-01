import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count, num, sum = 0;
        System.out.print("Enter how many numbers you want to add: ");
         count = sc.nextInt();

        for(int i = 1; i <= count; i++){
            System.out.print("Enter the #" + i + " number: ");
            num = sc.nextInt();

            sum += num;
        }
        System.out.println("The sum of Numbers is: "+sum);


        sc.close();

    }
}


// test run
// 3
// 10 20 30
// 60