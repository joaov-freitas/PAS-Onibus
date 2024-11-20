/* 
package View;
import Model.*;
import Model.Exceptions.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        SistemaViagemService sistema = new SistemaViagemService();
        
        try {
            Onibus onibus = new Onibus("ABC1234", 40, "Executiva", 500);
            sistema.cadastrarOnibus(onibus);

            Motorista motorista = new Motorista("12345678900", "João", 40, 200);
            sistema.cadastrarMotorista(motorista);

            Passageiro passageiro = new Passageiro("98765432100", "Maria", "maria@gmail.com");
            sistema.cadastrarPassageiro(passageiro);

            Trecho trecho1 = new Trecho("São Paulo", "Campinas", 1, 30, 50);
            Trecho trecho2 = new Trecho("Campinas", "Rio de Janeiro", 5, 0, 200);
            ArrayList lista_trechos = new ArrayList<Trecho>();
            lista_trechos.add(trecho1);
            lista_trechos.add(trecho2);
            Rota rota = new Rota("São Paulo", "Rio de Janeiro", lista_trechos);
            sistema.cadastrarRota("ROTA1", rota);
            
            System.out.println("Onibus: " + onibus.getPlaca());
            System.out.println("Motorista: " + motorista.getNome());
            System.out.println("Origem: " + rota.getOrigem());
            System.out.println("Destino: " + rota.getDestino());

        } catch (CadastroDuplicadoException | RotaInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
*/

package View;
import Controller.MainController;
public class Main {
    public static void main(String[] args) {
        MainController controller = new MainController();
    }
}