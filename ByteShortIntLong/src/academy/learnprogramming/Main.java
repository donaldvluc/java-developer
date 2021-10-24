package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // Test Int:
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted Integer Minimum Value = " + (myMinIntValue - 1));
        System.out.println("Busted Integer Maximum Value = " + (myMaxIntValue + 1));

        System.out.println("---------------------------------------------------");

        // Test Byte:
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);
        System.out.println("Busted Byte Minimum Value = " + (myMinByteValue - 1));
        System.out.println("Busted Byte Maximum Value = " + (myMaxByteValue + 1));

        System.out.println("---------------------------------------------------");

        // Test Short:
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);
        System.out.println("Busted Short Minimum Value = " + (myMinShortValue - 1));
        System.out.println("Busted Short Maximum Value = " + (myMaxShortValue + 1));

        System.out.println("---------------------------------------------------");

        // Test Long:
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);
        System.out.println("Busted Long Minimum Value = " + (myMinLongValue - 1));
        System.out.println("Busted Long Maximum Value = " + (myMaxLongValue + 1));

        System.out.println("---------------------------------------------------");

        // Program Challenge:
        byte myByte = 126;  // -128 to 127
        short myShort = 32766;  // -32768 to 32767
        int myInt = 2147483646;  // -2147483648 to 2147483647
        long answer = (long) 50_000 + (10 * (myByte + myShort + myInt));
        System.out.println("Program Challenge: " + answer);
    }
}
