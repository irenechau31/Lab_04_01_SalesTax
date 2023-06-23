public class SaleTaxCalculator {
    public static void main(String[] args) {
       System.out.println("Enter the price of the purchase: ");
       double purchasePrice = 0;
       double salesTax = purchasePrice * 0.05;
       System.out.println("Purchase price ($): " + purchasePrice);
       System.out.println("The sales tax for the purchase is ($): " + salesTax);
    }
}