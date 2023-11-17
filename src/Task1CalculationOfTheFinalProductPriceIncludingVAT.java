import java.math.BigDecimal;
import java.util.Scanner;

class Task1CalculationOfTheFinalProductPriceIncludingVAT {
    public static void main(String[] args) {

        double priceExcludingVAT;
        double priceIncludingVAT;
        boolean isPositiveAndHasTwoDecimals;
        String requirement = "";

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter price of a product excluding VAT" + requirement + ": ");
            priceExcludingVAT = scanner.nextDouble();

            isPositiveAndHasTwoDecimals = (BigDecimal.valueOf(priceExcludingVAT).scale() <= 2) && (priceExcludingVAT > 0);
            requirement = " (positive, no more than two decimals)";
        } while (!isPositiveAndHasTwoDecimals);

        priceIncludingVAT = priceExcludingVAT * 1.2;

        System.out.printf("Price excluding VAT: %.2f, Price including VAT: %.2f",priceExcludingVAT, priceIncludingVAT);

        scanner.close();
    }
}