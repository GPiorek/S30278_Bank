package pjwstk.edu.pl.S30278_Bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class S30278BankApplication {
	public ClientService getClientService() {
		return clientService;
	}

	private static ClientService clientService;

	public S30278BankApplication(ClientService clientService) {
		this.clientService = clientService;
	}

	public static void run(){
		clientService.registerClient(20, 300);
		clientService.registerClient(30, 400);
		System.out.println(clientService.clients);
		clientService.printClient(20);
		clientService.addDeposit(20,300);
		clientService.transferMoney(20,10);
	}

	public static void main(String[] args) {
		SpringApplication.run(S30278BankApplication.class, args);
	run();
	}

}
