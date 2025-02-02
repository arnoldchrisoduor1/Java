public class Customized {
    public class InsufficientFundsException extends Exception {
        private double amount;

        public InsufficientFundsException(double amount) {
            super("Insufficient funds: missing " + amount);
            this.amount = amount;
        }
        public double getAmount() {
            return amount;
        }
    }
}

public void withdraw(double amount) throws InsufficientFundsException {
    if (balance < amount) {
        throw new InsufficientFundsException(amount - balance);
    }
}
