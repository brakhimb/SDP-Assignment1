package Bank;

public class SavingsAccount extends Account {
    private static final double INTEREST_RATE = 1.3;

    public SavingsAccount(double initialBalance) {
        super.balance = initialBalance;
    }

    @Override
    void updateBalance(double depositAmount) {
        super.balance += depositAmount * INTEREST_RATE;
    }

    @Override
    public double getBalance() {
        return super.balance;
    }
}
