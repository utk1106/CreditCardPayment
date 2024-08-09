public class PaymentApp {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard("1234567890123456", "Utkarsh Thaokar", "12/25", "123");

        creditCard.addTransaction(100.0);
        creditCard.addTransaction(50.0);

        BillGenerator billGenerator = new SimpleBillGenerator();
        double billAmount = billGenerator.generateBill(creditCard);
        System.out.println("Outstanding Bill: $" + billAmount);

        PaymentProcessor paymentProcessor = new BankPaymentProcessor();
        boolean paymentSuccess = paymentProcessor.processPayment(creditCard,50.0);

        if (paymentSuccess) {
            System.out.println("Payment successful. New balance: $" + creditCard.getBalance());
        } else {
            System.out.println("Payment failed.");
        }
    }
}
