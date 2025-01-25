package pjwstk.edu.pl.S30278_Bank;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ClientServiceTest {
    ClientService clientService = new ClientService();

    @Test
    void shouldTakeOutMoneyAfterTransfer() {
        //GIVEN
        Client client = new Client(2, 500);
        clientService.clients.add(client);
        //WHEN
        clientService.transferMoney(2, 200);
        //THEN
        assertTrue(client.getSaldo() == 300);
    }


    @Test
    void shouldAddDeposite() {
        //given
        Client client = new Client(2, 500);
        clientService.clients.add(client);
        //when
        clientService.addDeposit(2, 300);
        //then
        assertTrue(client.getSaldo() == 800);
    }
}