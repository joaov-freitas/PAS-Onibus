package Model;
import java.util.ArrayList;

public class Rota {
    private String origem;
    private String destino;
    private ArrayList<Trecho> lista_trechos;

    public Rota(String origem, String destino, ArrayList<Trecho> lista_trechos) {
        this.origem = origem;
        this.destino = destino;
        this.lista_trechos = lista_trechos;
    }
    
    public boolean validaRota() {
        return !lista_trechos.isEmpty() && lista_trechos.get(0).getInicio().equals(origem) &&
               lista_trechos.get(lista_trechos.size() - 1).getFim().equals(destino);
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public ArrayList<Trecho> getLista_trechos() {
        return lista_trechos;
    }

    public void setLista_trechos(ArrayList<Trecho> lista_trechos) {
        this.lista_trechos = lista_trechos;
    }
    
}
