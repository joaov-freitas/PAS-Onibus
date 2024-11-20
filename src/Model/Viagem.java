package Model;

import java.time.LocalDateTime;
import java.util.Map;

public class Viagem {
    private String Id;
    private Onibus onibus;
    private Motorista motorista;
    private Rota rota;
    private LocalDateTime data_inicio;
    private Map<Integer,Passageiro> assentos_ocupados;
    private float preco;

    public Viagem(Onibus onibus, Motorista motorista, Rota rota, LocalDateTime data_inicio, Map<Integer, Passageiro> assentos_ocupados, float preco) {
        this.onibus = onibus;
        this.motorista = motorista;
        this.rota = rota;
        this.data_inicio = data_inicio;
        this.assentos_ocupados = assentos_ocupados;
        this.preco = preco;
        this.Id = this.onibus.getPlaca() + "-" + this.motorista.getCPF() + "-" + this.data_inicio.toString();
    }
    
    public Onibus getOnibus() {
        return onibus;
    }

    public void setOnibus(Onibus onibus) {
        this.onibus = onibus;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public Rota getRota() {
        return rota;
    }

    public void setRota(Rota rota) {
        this.rota = rota;
    }

    public LocalDateTime getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(LocalDateTime data_inicio) {
        this.data_inicio = data_inicio;
    }

    public Map<Integer,Passageiro> getAssentos_ocupados() {
        return assentos_ocupados;
    }

    public void setAssentos_ocupados(Map<Integer,Passageiro> assentos_ocupados) {
        this.assentos_ocupados = assentos_ocupados;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }
    
    
}
