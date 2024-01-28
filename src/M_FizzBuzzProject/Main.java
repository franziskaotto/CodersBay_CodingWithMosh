package M_FizzBuzzProject;

import java.util.Scanner;

public class Main {

    /*
      FizzBuzz

      Fizz: if number is /5 write Fizz
      Buzz: if number is /3 write Buzz
      FizzBuzz if number is /5 and /3 write FizzBuzz
      if nothing is true write the number

     */


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number here: ");

        byte number = scan.nextByte();

        if (number % 5 == 0 && number%3 == 0) {
            System.out.println("FizzBuzz");
        }  else if (number % 5 == 0) {
            System.out.println("Fizz");
        } else if (number % 3 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(number);
        }

        // it is important to put the if statement with the && at top



    }

}
