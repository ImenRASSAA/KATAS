package BankKata;

public class TransferService {
    private ExternalTransferService externalServiceTransfer;

    public TransferService(ExternalTransferService externalServiceTransfer) {
        this.externalServiceTransfer = externalServiceTransfer;
    }

    public boolean transfer(String ibanFrom, String ibanTo, int amount) {
        return externalServiceTransfer.transfer(ibanFrom, ibanTo, amount) == 202;
    }
}
