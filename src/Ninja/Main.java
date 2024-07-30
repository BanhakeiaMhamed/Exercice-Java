package Ninja;

public class Main {
    public static void main(String[] args) {

        System.out.println("Les transaction dans une banque ce passe comme suit: ");
        Bank bank = new Bank();
        bank.performTransactions();
    }
}
