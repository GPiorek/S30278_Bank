package pjwstk.edu.pl.S30278_Bank;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientService {
    List<Client> clients = new ArrayList<>();


    void registerClient(int id, long saldo) {
        for (Client client : clients) {}
        Client client = new Client(id, saldo);
        clients.add(client);
        System.out.println("Client with ID " + id + " has been registered. His account ammount = " + saldo);
    }

    void printClient(int id){
        for(Client client : clients){
            if(client.getId() == id){
                System.out.println(client);
                break;
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
                break;
            }
            else{
                System.out.println("Client is not registered");
            }
        }
    }

    void transferMoney(int id, int amount) {
        for(Client client : clients){
            if(client.getId() == id){
                if(client.getSaldo() >= amount) {
                    System.out.println("Old saldo from client id: " + id + " who transfer money = " + client.getSaldo());
                    client.setSaldo(client.getSaldo() - amount);
                    System.out.println("New saldo from client id: " + id + " who transfer money = " + client.getSaldo());
                    break;
                }else {
                    System.out.println("You dont have enough amount to make this transfer. Transaction DECLINED");
                    break;
                }
            }
            else{
                System.out.println("Client is not registered");
            }

        }
    }
}
