package pjwstk.edu.pl.S30278_Bank;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientService {
    List<Client> clients = new ArrayList<>();

    void registerClient(int id, long saldo) {
        Client client = new Client(id, saldo);
        clients.add(client);
    }

    void printClient(int id){
        for(Client client : clients){
            if(client.getId() == id){
                System.out.println(client);
            }
            else{
                System.out.println("Client is not registered");
            }
        }
    }

    void addDeposit(int id, int amount) {
        for(Client client : clients){
            if(client.getId() == id){
                System.out.println("Old saldo before deposit= " + client.getSaldo());
                client.setSaldo(client.getSaldo() + amount);
                System.out.println("New saldo after deposit = " + client.getSaldo());
            }
            else{
                System.out.println("Client is not registered");
            }
        }
    }

    void transferMoney(int id, int amount) {
        for(Client client : clients){
            if(client.getId() == id){
                    System.out.println("Old saldo from client who transfer money = " + client.getSaldo());
                    client.setSaldo(client.getSaldo() - amount);
                    System.out.println("New saldo from client who transfer money = " + client.getSaldo());
            }
            if(client.getId() != id){
                System.out.println("Client is not registered");
            }

        }
    }
}
