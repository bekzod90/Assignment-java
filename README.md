# Assignment-java
Write a program to divide, multiply, subtract and addition of two numbers
public class Calculator {

    public class Calculator {

            public static void main(String[] args) {

                int number1 = 10;
                int number2 = 5;

                // Using arithmetic operators

                System.out.println("number1 + number2 = " + (number1 + number2));

                System.out.println("number1 - number2 = " + (number1 - number2));

                System.out.println("number1 * number2 = " + (number1 * number2));

                System.out.println("number1 / number2 = " + (number1 / number2));

                System.out.println("number1 % number2 = " + (number1 % number2));

            }
        }

Write a program to check if a even number is palindrome or not

public class Palindrome {

    public static void main(String[] args) {

        int num = 121, reversedInteger = 0, remainder, originalInteger;

        originalInteger = num;

        // reversed integer is stored in variable 
        while( num != 0 )
        {
            remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            num  /= 10;
        }

        // palindrome if orignalInteger and reversedInteger are equal
        if (originalInteger == reversedInteger)
            System.out.println(originalInteger + " is a palindrome.");
        else
            System.out.println(originalInteger + " is not a palindrome.");
    }
}
