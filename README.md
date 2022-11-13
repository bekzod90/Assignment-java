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

        int num = 121, reversedInteger = 0, remainder, originalInteger; //declaring variables num, reversedInteger, remainder, originalInteger

        originalInteger = num; //assigning value of num to originalInteger

        // reversed integer is stored in variable reversedInteger
        while( num != 0 )
        {
            remainder = num % 10; //getting remainder of num
            reversedInteger = reversedInteger * 10 + remainder; //reversing the number and storing it in reversedInteger
            num  /= 10; //getting quotient of num
        }

        // palindrome if originalInteger and reversedInteger are equal
        if (originalInteger == reversedInteger)
            System.out.println(originalInteger + " is a palindrome.");
        else
            System.out.println(originalInteger + " is not a palindrome.");
    }
}


//Write a program to find if numbers which are divisible by 23 between 10 to 150


 Declaring an array of 10 elements.

2. Declaring a variable to store the sum of the elements.

3. For loop to iterate through the array.

4. Adding the elements of the array to the sum variable.

5. Printing the sum.

public class Main {



    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; //declaring an array of 10 elements. //1

        int sum = 0; //declaring a variable to store the sum of the elements. //1

        for (int i = 0; i < 10; i++) { //for loop to iterate through the array. //n

            sum += array[i]; //adding the elements of the array to the sum variable. //n

        }

        System.out.println(sum); //printing the sum.

    }

}

	public static void main(String[] args) {
		
		for(int i=10; i<=150; i++) { //for loop to iterate from 10 to 150
			if(i%23==0) { //if condition to check if the number is divisible by 23
				System.out.println(i); //print the number
			}
		}
	}
}
