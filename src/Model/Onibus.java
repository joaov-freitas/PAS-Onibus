package Model;

public class Onibus {
    private String placa;
    private int qtdLugares;
    private String classe; //econômica, executiva ou luxo
    private float custo;

    public Onibus(String placa, int qtdLugares, String classe, float custo) {
        this.placa = placa;
        this.qtdLugares = qtdLugares;
        this.classe = classe;
        this.custo = custo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getQtdLugares() {
        return qtdLugares;
    }

    public void setQtdLugares(int qtdLugares) {
        this.qtdLugares = qtdLugares;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public float getCusto() {
        return custo;
    }

    public void setCusto(float custo) {
        this.custo = custo;
    }
}
