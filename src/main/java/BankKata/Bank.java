package BankKata;

import java.util.List;

public class Bank {

    public List<Account> accounts;

    public int getBalance(Account account) {
        return account.getBalance();
    }

    public void deposit(Account account, int deposit, String date) {
        account.setBalance(account.getBalance() + deposit);
        account.transactions.add(0, new Transaction(date, deposit, account.getBalance()));
    }

    public void withdraw(Account account, int amount, String date) {
        if (account.getBalance()>=amount) {
            account.setBalance(account.getBalance() - amount);
            account.transactions.add(0, new Transaction(date, amount, account.getBalance()));
        }
    }

    public List<Transaction> getTransactions(Account account) {
        return account.transactions;
    }

    public Account getAccountByIban(String ibanFrom) {
        for(Account account: this.accounts){
            if(account.iban.equals(ibanFrom)){
                return account;
            }
        }
        return null;
    }
}
