public class ArithmeticExceptionHandling {
    public static void main(String[] args) {
        try {
            int dividend = 10;
            int divisor = 0;
            int result = dividend / divisor; // This line will cause an ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        }
    }
}
