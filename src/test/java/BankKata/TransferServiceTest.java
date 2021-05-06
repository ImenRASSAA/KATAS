package BankKata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

class TransferServiceTest {

    @Mock
    ExternalTransferService stubExternalServiceTransfer;

    @BeforeEach
    void Init(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void When_externalTransfer_isOK_then_return_transfer_OK() {
        String ibanFrom = "abcdeabcdeabcdeabcdeabcdeabcd1";
        String ibanTo = "abcdeabcdeabcdeabcdeabcdeabcd2";
        when(stubExternalServiceTransfer.transfer(ibanFrom, ibanTo, 100)).thenReturn(202);

        TransferService transferService = new TransferService(stubExternalServiceTransfer);
        boolean isTransferOK = transferService.transfer(ibanFrom, ibanTo, 100);

        assertThat(isTransferOK).isTrue();
    }

    @Test
    void When_externalTransfer_isKO_then_return_transfer_KO() {
        String ibanFrom = "abcdeabcdeabcdeabcdeabcdeabcd1";
        String ibanTo = "abcdeabcdeabcdeabcdeabcdeabcd2";
        when(stubExternalServiceTransfer.transfer(ibanFrom, ibanTo, 100)).thenReturn(400);

        TransferService transferService = new TransferService(stubExternalServiceTransfer);
        boolean isTransferOK = transferService.transfer(ibanFrom, ibanTo, 100);

        assertThat(isTransferOK).isFalse();
    }

}