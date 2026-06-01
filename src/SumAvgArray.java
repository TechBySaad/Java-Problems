public class SumAvgArray {
    // sum and average of array
    /*
       Expected Output:
       The sum of all the elements of the given array is: 63
       The average of all the elements of the given array is: 12.6
     */
    public static void main(String[] args) {

        int[] array = {1,22,31,4,5};
        int length = array.length;
        int sum = 0;

        for (int i = 0; i < length; i++) {
            sum = sum + array[i];
        }
        double average = (double) sum / length; // Type cast here to store int values in double. (int values are converted to decimal values so the output won't be accurate

        System.out.println("The sum of all the elements of the given array is: " + sum);
        System.out.println("The average of all the elements of the given array is: " + average);

    }
}
