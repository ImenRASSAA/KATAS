package BankKata;

import java.util.ArrayList;
import java.util.List;

public class Account {

    public List<Transaction> transactions;
    public String iban;
    int balance;
    final int BANK_WELCOMING_GIFT = 60;

    public Account(String iban) {
        this.balance = BANK_WELCOMING_GIFT;
        this.iban = iban;

        this.transactions = new ArrayList<>();
        this.transactions.add(new Transaction ("01/01/2021", 60, 60));
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance()  {
        return this.balance;
    }
}
