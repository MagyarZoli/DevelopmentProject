package operators.arithmetic;

public class Main {
    public static void main(String[] args) {
        int x = 5;
        int y = 6;

        int addition = x + y;
        int subtraction = x - y;
        int multiplication = x * y;
        float division = x / (float)y;
        int modulus = x % y;
        int bitwiseAnd = x & y;
        int bitwiseOr = x | y;
        int bitwiseXOr = x ^ y;
        int bitwiseRightShift = x >> y;
        int bitwiseLeftShift = x << y;
        int increment = ++x;
        int decrement = --y;

        System.out.println(addition);
        System.out.println(subtraction);
        System.out.println(multiplication);
        System.out.println(division);
        System.out.println(modulus);
        System.out.println(bitwiseAnd);
        System.out.println(bitwiseOr);
        System.out.println(bitwiseXOr);
        System.out.println(bitwiseRightShift);
        System.out.println(bitwiseLeftShift);
        System.out.println(increment);
        System.out.println(decrement);
    }
}
