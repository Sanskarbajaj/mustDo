package multithreadandsync;

public class bankobj {

	private int accountNo;
    private int balance;

    public int getAccountNo() {
        return accountNo;
    }

    public bankobj(int accountNo, int balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
