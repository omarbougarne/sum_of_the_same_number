package sumsame;

import java.util.Scanner;

public class SumSameNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int result = 0;

        System.out.print("Enter a number: ");
        number = input.nextInt();

        while (number > 0) {
            int digit = number % 10;
            result += digit;          
            number = number / 10;     
        }

        System.out.println("The sum of the digits is: " + result);
        input.close();
    }
}

