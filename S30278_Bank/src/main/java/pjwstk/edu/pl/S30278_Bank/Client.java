package pjwstk.edu.pl.S30278_Bank;

import org.springframework.context.annotation.Bean;


public class Client {
    private int id;
    private long saldo;

    public Client(int id, long saldo) {
        this.id = id;
        this.saldo = saldo;
    }

    public int getId() {
        return id;
    }

    public long getSaldo() {
        return saldo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSaldo(long saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", saldo=" + saldo +
                '}';
    }
}
