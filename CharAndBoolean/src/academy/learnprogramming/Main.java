package academy.learnprogramming;

/**
 * Key Takeaways:
 * 1) Chars take up 16 bits, or 2 bytes, to support Uncode characters (total 65535).
 *    e.g. char myUnicodeChar = '\u0044';
 */

public class Main {

    public static void main(String[] args) {
        // Char:
        char myChar = 'D';
        char myUnicodeChar = '\u0044';
        char myCopyrightChar = '\u00A9';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        System.out.println(myCopyrightChar);

        // Boolean:
        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;
        boolean isCustomerOverTwentyOne = true;
    }
}
