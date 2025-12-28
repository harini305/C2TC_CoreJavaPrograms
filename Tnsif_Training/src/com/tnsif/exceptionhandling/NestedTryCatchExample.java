package com.tnsif.exceptionhandling;

public class NestedTryCatchExample {
    public static void main(String[] args) {

        try {
            
            int[] numbers = {10, 20, 30};

            try {
                
                int result = numbers[1] / 0; 
                System.out.println(result);
            }
            catch (ArithmeticException e) {
                System.out.println("Inner catch: Cannot divide by zero!");
            }

            System.out.println(numbers[5]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer catch: Array index out of bounds!");
        }

        System.out.println("Program continues normally...");
    }
}
