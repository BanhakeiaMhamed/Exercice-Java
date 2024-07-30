package Ninja;

import java.sql.SQLOutput;
import java.util.Objects;

public class BancKAccount {
    private String accountNumber;
    private double balance;

    public BancKAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public BancKAccount() {
    }

    public synchronized void withdraw(double x) {
        if(this.balance>0 && this.balance>=x) {
            this.balance -=x;
            System.out.println("un prlevement a eu lieu de "+x+" : "+this.accountNumber);
            System.out.println("balance: "+this.balance+" : "+this.accountNumber);
        } else {
            System.out.println("votre solde est inssufisant :"+balance+" pour le prelevement "+x);
        }

    }

    public synchronized void deposit(double y) {
        if(y>0) {
            this.balance+=y;
            System.out.println("un viremment a eu lieu d'un monant de "+y+" : "+this.accountNumber);
            System.out.println("balance: "+this.balance+" : "+this.accountNumber);
        }

    }

    public  synchronized String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public synchronized double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BancKAccount that = (BancKAccount) o;
        return Double.compare(balance, that.balance) == 0 && Objects.equals(accountNumber, that.accountNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, balance);
    }

    @Override
    public String toString() {
        return "BancKAccount = [ " +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ']';
    }


}
