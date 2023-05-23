public class NumberSum {
    public static void main (String[] args) {
        //Initialize array
        int [] myArray = {5, 6, 3, 4, 5};
        int sum = 0;
        //Loop through the array to calculate sum of elements
        for (int i = 0; i < myArray.length; i++) {
            sum = sum + myArray[i];
        }
        System.out.println("Sum of elements of an array: " + sum);
    }
}
