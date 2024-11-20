package Model;

public class Trecho {
    private String inicio;
    private String fim;
    private int duracao_min;
    private int duracao_horas;
    private float custo;

    public Trecho(String inicio, String fim, int duracao_min, int duracao_horas, float custo) {
        this.inicio = inicio;
        this.fim = fim;
        this.duracao_min = duracao_min;
        this.duracao_horas = duracao_horas;
        this.custo = custo;
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getFim() {
        return fim;
    }

    public void setFim(String fim) {
        this.fim = fim;
    }

    public int getDuracao_min() {
        return duracao_min;
    }

    public void setDuracao_min(int duracao_min) {
        this.duracao_min = duracao_min;
    }

    public int getDuracao_horas() {
        return duracao_horas;
    }

    public void setDuracao_horas(int duracao_horas) {
        this.duracao_horas = duracao_horas;
    }

    public float getCusto() {
        return custo;
    }

    public void setCusto(float custo) {
        this.custo = custo;
    }
}
