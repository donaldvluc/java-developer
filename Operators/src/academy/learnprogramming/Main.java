package academy.learnprogramming;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("Result Summation: " + result);
        result = result - 1;
        System.out.println("Result Subtraction: " + result);
        result = result * 10;
        System.out.println("Result Multiplication: " + result);
        result = result / 5;
        System.out.println("Result Division: " + result);
        result = result % 3;
        System.out.println("Result Modulo: " + result);

        result++;
        System.out.println("Result ++: " + result);
        result--;
        System.out.println("Result --: " + result);
        result += 2;
        System.out.println("Result +=: " + result);
        result *= 10;
        System.out.println("Result *=: " + result);
        result /= 3;
        System.out.println("Result /=: " + result);
        result -= 2;
        System.out.println("Result -=: " + result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens...");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 95;
        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than second top score and less than 100.");
        }

        if (topScore > 90 || secondTopScore <= 90) {
            System.out.println("Either or both of the conditions are true.");
        }

        // Program Challenge:
        double twenty = 20.00;
        double eighty = 80.00;
        double ansOne = 100.00 * (twenty + eighty);
        double ansTwo = ansOne % 40.00;
        boolean ansThree = ansTwo == 0 ? true : false;
        System.out.println("Program Challenge: " + ansThree);
        if (!ansThree) {
            System.out.println("Got some remainder.");
        }
    }
}
