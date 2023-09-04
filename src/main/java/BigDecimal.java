public class BigDecimal {

    public static void main(String[] args) {

        double smallNumber = 0.1;
        double largeNumber = 10_000_000_000.0;

        double resultDouble = largeNumber + smallNumber;

        System.out.println("Result (double): " + resultDouble);
    }

}
