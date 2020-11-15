package hw.lesson5;

public class Exponentiation {
    public static void main(String[] args) {

        System.out.println("For number 0 and exponent 7 result is: "
                + doExponentiation(0, 7));

        System.out.println("For number 8 and exponent 0 result is: "
                + doExponentiation(8, 0));

        System.out.println("For number 7 and exponent 5 result is: "
                + doExponentiation(7, 5));

        System.out.println("For number 5 and exponent -4 result is: "
                + doExponentiation(5, -4));

        System.out.println("For number -5 and exponent 3 result is: "
                + doExponentiation(-5, 3));

        System.out.println(doExponentiation(0, -7));
    }

    private static double doExponentiation(double number, int exponent) {
        if (number == 0) {
            if (exponent <= 0) {
                throw new IllegalArgumentException("For number with value = 0 exponent must be > 0!");
            } else {
                return 0;
            }
        } else if (exponent == 0){
            return 1;
        } else if (exponent > 0) {
            return number * doExponentiation(number, exponent - 1);
        } else {
            return 1 / (number * doExponentiation(number, -exponent - 1));
        }
    }
}
