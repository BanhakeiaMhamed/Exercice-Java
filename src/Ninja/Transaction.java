package Ninja;

public class Transaction implements Runnable{

    private BancKAccount bancKAccount;

    private boolean isDeposit;
    private boolean isWithDraw;
    private double amount;

    public Transaction( BancKAccount bancKAccount, boolean isDeposit, boolean isWithDraw, double amount) {
        this.bancKAccount = bancKAccount;
        this.isDeposit = isDeposit;
        this.isWithDraw = isWithDraw;
        this.amount = amount;
    }
    @Override
    public void run() {
        System.out.println(this.bancKAccount);
        if(this.isDeposit) {
            System.out.println("|"+Thread.currentThread().getName()+"|=>un virement arrive sur "+this.bancKAccount.getAccountNumber());
            this.bancKAccount.deposit(this.amount);

        }
        if(this.isWithDraw) {
            System.out.println("|"+Thread.currentThread().getName()+"|=>un prélévement arrive sur "+this.bancKAccount.getAccountNumber());
            this.bancKAccount.withdraw(this.amount);

        }

    }
}
