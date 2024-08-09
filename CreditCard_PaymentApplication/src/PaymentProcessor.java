public interface PaymentProcessor {
    boolean processPayment(CreditCard creditCard, double amount);
}

class BankPaymentProcessor implements PaymentProcessor {
    @Override
    public boolean processPayment(CreditCard creditCard, double amount) {
        if (MockBankAPI.processCreditCardPayment(creditCard.getCardNumber(), creditCard.getBalance(), amount)) {
            creditCard.makePayment(amount);
            return true;
        }
        return false;
    }
}