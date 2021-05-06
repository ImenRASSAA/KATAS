
package BankKata;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class BankTest {

    //Test list :
    // When get balance on a new account, must return 60
    // When getBalance on an existing account with 50, must return 50
    // When depositing 10 on an account with 50, account has 60
    // When retrieving 10 on an account with 50, account has 40
    // When retrieving 50 on an account with 20, account stays at 20 (it does nothing)
    // When retrieving 20 on an account with 20, account has 0
    // When listing transactions of a new account created on 05/06/2021, returns
        // => ""
    // When listing transactions of a new account created on 05/06/2021 + gift by bank, returns
        // => 05/06/2021 | 60.00 | 60.00
    // When listing transactions of an existing account (created the 04/06/2021 + transaction +50 on 05/06/2021)
        // => 05/06/2021 | 50.00 | 110.00
        // => 04/06/2021 | 60.00 | 60.00

    //Features :
    // Connaitre le solde de son compte
    // Faire un dépot
    // Faire un retrait
    // Faire la liste des transactions sous la forme
    // Si un c'est un nouveau compte, le solde est de 60
    // Le solde ne doit pas être négatif


    //Tests
    // When get balance on a new account, must return 60
    @Test
    void when_balance_on_new_account_return_60() {
        // Given
        Account account = new Account("abcdeabcdeabcdeabcdeabcdeabcd1");
        Bank bank = new Bank();
        // When
        int balance = bank.getBalance(account);
        // Then
        assertThat(balance).isEqualTo(60);
    }

    // When getBalance on an existing account with 50, must return 50
    @Test
    void when_balance_on_existing_account_50_return_50() {
        // Given
        Account account = new Account("abcdeabcdeabcdeabcdeabcdeabcd1");
        account.setBalance(50);
        Bank bank = new Bank();
        // When
        int balance = bank.getBalance(account);
        // Then
        assertThat(balance).isEqualTo(50);
    }

    // When depositing 10 on an existing account with 50, account has 60
    @Test
    void when_depositing_10_on_existing_account_with_50_account_has_60() {
        // Given
        Account account = new Account("abcdeabcdeabcdeabcdeabcdeabcd1");
        account.setBalance(50);
        Bank bank = new Bank();
        // When
        bank.deposit(account, 10, "01/01/2021");
        int balance = bank.getBalance(account);
        // Then
        assertThat(balance).isEqualTo(60);
    }

    // When retrieving 10 on an account with 50, account has 40
    @Test
    void when_retrieving_10_on_existing_account_with_50_account_has_40() {
        // Given
        Account account = new Account("abcdeabcdeabcdeabcdeabcdeabcd1");
        account.setBalance(50);
        Bank bank = new Bank();
        // When
        bank.withdraw(account, 10, "01/01/2021");
        int balance = bank.getBalance(account);
        // Then
        assertThat(balance).isEqualTo(40);
}

    // When retrieving 50 on an account with 20, account stays at 20 (it does nothing)
    @Test
    void when_retrieving_50_on_existing_account_with_20_account_has_20() {
        // Given
        Account account = new Account("abcdeabcdeabcdeabcdeabcdeabcd1");
        account.setBalance(20);
        Bank bank = new Bank();
        // When
        bank.withdraw(account, 50, "01/01/2021");
        int balance = bank.getBalance(account);
        // Then
        assertThat(balance).isEqualTo(20);
    }

    // When retrieving 20 on an account with 20, account has 0
    @Test
    void when_retrieving_20_on_existing_account_with_20_account_has_0() {
        // Given
        Account account = new Account("abcdeabcdeabcdeabcdeabcdeabcd1");
        account.setBalance(20);
        Bank bank = new Bank();
        // When
        bank.withdraw(account, 20, "01/01/2021");
        int balance = bank.getBalance(account);
        // Then
        assertThat(balance).isEqualTo(00);
    }

    // When listing transactions of a new account created on 01/01/2021, returns
    // => 01/01/2021 | 60.00 | 60.00
    @Test
    void when_listing_transactions_of_new_account_is_60() {
        // Given
        Account account = new Account("abcdeabcdeabcdeabcdeabcdeabcd1");
        Bank bank = new Bank();
        // When
        List<Transaction> transactions = bank.getTransactions(account);
        // Then
        assertThat(transactions.get(0).dateOfTransaction).isEqualTo("01/01/2021");
        assertThat(transactions.get(0).amount).isEqualTo(60);
        assertThat(transactions.get(0).balance).isEqualTo(60);
    }

    // When listing transactions of an existing account (created on 01/01/2021 + transaction +50 on 01/01/2021)
        // => 01/01/2021 | 50.00 | 110.00
        // => 01/01/2021 | 60.00 | 60.00
    @Test
    void Given_deposit_1000_when_get_transaction_then_listing_transactions_contains_new_transaction_1060() {
        Account account = new Account("abcdeabcdeabcdeabcdeabcdeabcd1");
        Bank bank = new Bank();
        bank.deposit(account,1000, "03/01/2021");

        List<Transaction> transactions = bank.getTransactions(account);

        assertThat(transactions.get(0).dateOfTransaction).isEqualTo("03/01/2021");
        assertThat(transactions.get(0).amount).isEqualTo(1000);
        assertThat(transactions.get(0).balance).isEqualTo(1060);
    }

    @Test
    void Given_deposit_1000_with_a_date_when_get_transaction_then_listing_transactions_contains_transaction_with_date() {
        Account account = new Account("abcdeabcdeabcdeabcdeabcdeabcd1");
        Bank bank = new Bank();
        bank.deposit(account,1100, "18/03/2021");

        List<Transaction> transactions = bank.getTransactions(account);

        assertThat(transactions.get(0).dateOfTransaction).isEqualTo("18/03/2021");
    }

    @Test
    void Given_withdraw_10_when_get_transaction_then_listing_transactions_contains_new_transaction_50() {
        Account account = new Account("abcdeabcdeabcdeabcdeabcdeabcd1");
        Bank bank = new Bank();
        bank.withdraw(account,10, "01/01/2021");

        List<Transaction> transactions = bank.getTransactions(account);

        assertThat(transactions.get(0).amount).isEqualTo(10);
        assertThat(transactions.get(0).balance).isEqualTo(50);
    }


    @Test
    void When_getAccountByIban_on_newAccount_then_get_uniqueAccount() {
        Account account = new Account("abcdeabcdeabcdeabcdeabcdeabcd1");

        Bank bank = new Bank();
        bank.accounts = List.of(account);

        Account foundAccount = bank.getAccountByIban("abcdeabcdeabcdeabcdeabcdeabcd1");

        assertThat(foundAccount.balance).isEqualTo(60);
    }

    @Test
    void When_getAccountByIban_on_anAccountForIban_then_get_foundAccount() {
        Account accountA = new Account("abcdeabcdeabcdeabcdeabcdeabcd1");
        accountA.balance = 100;
        Account accountB = new Account("abcdeabcdeabcdeabcdeabcdeabcd2");
        accountB.balance= 200;

        Bank bank = new Bank();
        bank.accounts= List.of(accountA, accountB);

        Account foundAccount = bank.getAccountByIban("abcdeabcdeabcdeabcdeabcdeabcd1");

        assertThat(foundAccount.balance).isEqualTo(100);
    }

    @Test
    void When_getAccountByIban_on_anUnknownAccount_then_get_no_account() {
        Account accountA = new Account("abcdeabcdeabcdeabcdeabcdeabcd1");
        accountA.balance = 100;

        Bank bank = new Bank();
        bank.accounts= List.of(accountA);

        Account foundAccount = bank.getAccountByIban("abcdeabcdeabcdeabcdeabcdeabcd2");

        assertThat(foundAccount).isNull();
    }
}