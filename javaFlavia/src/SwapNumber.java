public class SwapNumber {
    public static void main(String[] args) {
        float num1 = 3.5f, num2 = 4.65f;
        System.out.println("before swapping numbers");
        System.out.println("first number: "+ num1);
        System.out.println("second number: "+num2);
//assigninng first value to a new variable
        float newNum =  num1;
//value of the second number is assigned to the first
        num1 = num2;
//value of second is assigned to the inital value
        num2 = newNum;

        System.out.println("after swapping numbers");
        System.out.println("first number: "+num1);
        System.out.println("second number : "+ num2);
    }
}
