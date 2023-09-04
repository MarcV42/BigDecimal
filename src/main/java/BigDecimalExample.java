import java.math.BigDecimal;

public class BigDecimalExample {
    public static void main(String[] args) {
        BigDecimal smallNumber = new BigDecimal("0.1");
        BigDecimal largeNumber = new BigDecimal("10000000000.0");

        BigDecimal resultBigDecimal = largeNumber.add(smallNumber);

        System.out.println("Result (BigDecimal): " + resultBigDecimal);
    }
}

