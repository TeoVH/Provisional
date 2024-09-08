public class Account {
    private float balance;

    public float getBalance() {
        return this.balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public Account() {
        this.balance = 0;
    }

    public void spend(float amount) {
        balance = balance - amount;
    }

    public void deposit(float amount) {
        balance = balance + amount;
    }
}