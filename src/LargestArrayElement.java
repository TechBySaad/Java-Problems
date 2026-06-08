public class LargestArrayElement {
    public static void main(String[] args) {

        int[] numbers = {2, 3, 4, 9, 5, 6};
        int largest = numbers[0];
        int length = numbers.length;

        for(int i = 1; i< length; i++){
            int number = numbers[i];
            if(number > largest){
                largest = number;
            }
        }
        System.out.println(largest);
    }
}
