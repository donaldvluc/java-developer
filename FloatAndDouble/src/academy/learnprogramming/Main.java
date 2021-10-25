package academy.learnprogramming;

/**
 * Key Takeaways:
 * 1) Single precision (float) has 32 bits and double precision (double) has 64 bits.
 *    - float range {1.4E-45, 3.4028235E+38}
 *    - double range {4.9E-324, 1.7976931348623157E+308}
 * 
 * 2) Number is default double for precision numbers.
 *
 * 3) Should use BigDecimal over float and double. Avoid floats.
 */

public class Main {

    public static void main(String[] args) {
        // Float:
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Minimum Value: " + myMinFloatValue);
        System.out.println("Float Maximum Value: " + myMaxFloatValue);

        // Double:
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Minimum Value: " + myMinDoubleValue);
        System.out.println("Double Maximum Value: " + myMaxDoubleValue);

        // Practice:
        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;
        System.out.println("My Int Value: " + myIntValue);
        System.out.println("My Float Value: " + myFloatValue);
        System.out.println("My Double Value: " + myDoubleValue);

        // Challenge:
        double myPounds = 150d;
        double kilogramsToPounds = 0.45359237d;  // per pound
        double myKilograms = myPounds * kilogramsToPounds;
        System.out.println("Pounds to Kilograms: " + myPounds + " * " + kilogramsToPounds + " = " + myKilograms);
    }
}
