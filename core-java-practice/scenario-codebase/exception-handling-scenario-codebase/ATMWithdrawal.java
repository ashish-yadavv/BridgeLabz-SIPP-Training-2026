class InsufficientBalanceException extends Exception {
    private double requested;
    private double balance;

    public InsufficientBalanceException(double requested, double balance) {
        super("Insufficient balance: requested ₹" + requested + " but available balance is ₹" + balance);
        this.requested = requested;
        this.balance = balance;
    }

    public double getRequested() { return requested; }
    public double getBalance() { return balance; }
}

public class ATMWithdrawal {
    public static void withdraw(double balance, double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException(amount, balance);
        }
        System.out.println("Withdrawal successful. Remaining balance: ₹" + (balance - amount));
    }

    public static void main(String[] args) {
        double balance = 5000;
        double request = 8000;

        try {
            withdraw(balance, request);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
            System.out.println("You are short by ₹" + (e.getRequested() - e.getBalance()));
        }
    }
}
