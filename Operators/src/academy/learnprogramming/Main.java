package academy.learnprogramming;

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
    }
}
