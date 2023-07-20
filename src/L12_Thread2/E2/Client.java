package L12_Thread2.E2;

public class Client {
    private int balance;

    public Client(int balance) {
        this.balance = balance;
    }

    public void pay( int sum){
        balance -= sum;
    }

    public int getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Client{" +
                "balance=" + balance +
                '}';
    }
}
