public class Transaction {
    private String transactionId;
    private String date;
    private double amount;

    public Transaction(String transactionId, String date, double amount) {
        this.transactionId = transactionId;
        this.date = date;
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
