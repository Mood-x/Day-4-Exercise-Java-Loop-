
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in); 
        
//// ================ Task 1 ================
// 1.Write a program that prints the numbers from 1 to 100 such that: If the number is a multiple of 3, you need to print "Fizz" instead of that number.

        for (int i = 1; i <= 100; i++){
                if (i % 5 == 0 && i % 3){
                        System.out.println("FizzBuzz");
                }else if (i % 3 == 0){
                        System.out.println("Fizz");
                }else if (i % 5 == 0){
                        System.out.println("Buzz");
                }else {
                        System.out.println(i);
                }
        }

//// ================ Task 2 ================
// 2.Write a Java program to reverse a string. Test Data: Input a string: The quick brown fox Expected Output: Reverse string: xof nworb kciuq ehT

        String str = "The quick brown fox "; 
        String reversedStr = ""; 
        for (int i = str.length() -1; i >= 0; i--){
                reversedStr += str.charAt(i);
        }

        System.out.println(str + "Reverse string: " + reversedStr);

//// ================ Task 3 ================
// 3.Write a program to find the factorial value of any number entered through the keyboard.

        System.out.print("Enter a number: ");
        int num = input.nextInt(); 

        int factorial = 1; 
        
        for(int i = 1; i <= num; i++){
                factorial *= i; 
        }

        System.out.println("Factorial of " + num + " is: " + factorial);

//// ================ Task 4 ================
// 4.Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the power of another. (Do not use Java built-in method)


        System.out.print("Enter the base number: ");
        int numberOne = input.nextInt(); 

        System.out.print("Enter the exponent: ");
        int numberTwo = input.nextInt(); 

        int power = 1; 

        for(int i = 1; i <= numberTwo; i++){
                power *= numberOne; 
        }

        System.out.println(numberOne + " raised to the power of " + numberTwo + " is " + power);

//// ================ Task 5 ================
// 5.Write a program that reads a set of integers, and then prints the sum of the even and odd integers.

        int even = 0; 
        int odd = 0; 

        while(true){
                System.out.print("Enter integers press 0 to quit: ");
                int number = input.nextInt(); 

                if (number == 0){
                        break; 
                }

                if (number % 2 == 0){
                        even += number; 
                }else {
                        odd += number; 
                }
        }

        System.out.println("Sum of even numbers = "+ even);
        System.out.println("Sum of odd numbers = "+ odd);

        

//// ================ Task 6 ================
// 6.Write a program that prompts the user to input a positive integer. It should then output a message indicating whether the number is a prime number.

        System.out.print("Enter a posivie integer: ");
        int postiveNumber = input.nextInt(); 

        boolean isPrime = true; 

        if(postiveNumber <= 1){
                isPrime = false; 
        }else {
                if( postiveNumber % 2 == 0 || postiveNumber % 3 == 0){
                        isPrime = false; 
                }else {
                        for (int i = 5; i * i <= postiveNumber; i += 6){
                                if (postiveNumber % i == 0 || postiveNumber % (i + 2) == 0){
                                        isPrime = false; 
                                        break;
                                }
                        }
                }
        }

        System.out.println(postiveNumber + ( isPrime ? " is a prime number" : " is not a prime number"));


//// ================ Task 7 ================
// 7.Use a for loop to print headings for four weeks (Weeks 1 - 4). Then use another for loop to print the days (Days 1 -7) for each week. Expected Output:

        int week = 4;
        int day = 7;

        for(int i = 1; i <= week; i++){
                System.out.println("Week " + i);
                System.out.println();

                for(int j = 1; j <= day; j++){
                        System.out.println("    Day " + j);
                        System.out.println();
                }
        }

//// ================ Task 8 ================
// 8.Write a program thats check if the word is a palindrome or not. hint: A string is // said to be a palindrome if it is the same if we start reading it from left to right or right to left.

        System.out.print("Enter a word to check if it is a palindrome: ");

        String word = input.nextLine(); 

        word = word.toLowerCase();
        boolean isPalindrome = true; 

        for(int i = 0; i < word.length() / 2; i++){
                if(word.charAt(i) != word.charAt(word.length() - 1 - i)){
                        isPalindrome = false;
                        break; 
                }
        }
        System.out.println(isPalindrome ? "'" + word + "' is a palindrome." : "'" + word + "' is not a palindrome.");
        }
}
