
package Model;

public class Motorista {
    private String CPF;
    private String nome;
    private int idade;
    private float valor_diaria;
    
    public Motorista(String CPF, String nome, int idade, float valor_diaria) {
        this.CPF = CPF;
        this.nome = nome;
        this.idade = idade;
        this.valor_diaria = valor_diaria;
    }

    public String getCPF() {
        return CPF;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public float getValor_diaria() {
        return valor_diaria;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setValor_diaria(float valor_diaria) {
        this.valor_diaria = valor_diaria;
    }
}


