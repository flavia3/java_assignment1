public class OddAndEvenCount {
    public static void main(String[] args) {
//        initializing  the variables
        int number = 123456, oddCount = 0, evenCount = 0;

//        looping through the number and using the if statements to compare
        while (number > 0) {

            if (number % 2 == 0) {
                evenCount++;
            }
            else {
                oddCount++;
            }

            number /= 10;
        }
        System.out.println("the number of even count is " + evenCount);
        System.out.println(("the number of odd count is " + oddCount));
    }
}
