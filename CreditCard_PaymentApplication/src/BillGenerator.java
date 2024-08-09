public interface BillGenerator {
    double generateBill(CreditCard creditCard);
}

class SimpleBillGenerator implements BillGenerator {
    @Override
    public double generateBill(CreditCard creditCard) {
        return creditCard.getBalance();
    }
}