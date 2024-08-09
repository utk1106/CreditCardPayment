public class MockBankAPI {

        public static boolean processCreditCardPayment(String cardNumber, double balance, double amount) {
            System.out.println("Processing payment of $" + amount + " for card ending in " + cardNumber.substring(cardNumber.length() - 4));
            return true;
        }
}