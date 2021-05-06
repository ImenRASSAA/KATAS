package BankKata;

public interface ExternalTransferService {
    int transfer(String ibanFrom, String ibanTo, int amount);
}
