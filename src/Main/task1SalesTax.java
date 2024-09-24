import java.util.Scanner;
public class task1SalesTax {
    public static void main(String[] args) {
        int priceOfPurchase = (int) 10.0;
        double salesTax = (0.05 * priceOfPurchase);
        System.out.println("The price of the purchase is" + priceOfPurchase + "and the sales tax is" + salesTax);
    }
}
