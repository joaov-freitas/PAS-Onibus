package Model;

import java.util.HashMap;
import java.util.Map;
import Model.Exceptions.CadastroDuplicadoException;
import Model.Exceptions.RotaInvalidaException;

public class SistemaViagemService {
    private Map<String, Onibus> onibusMap = new HashMap<>();
    private Map<String, Motorista> motoristaMap = new HashMap<>();
    private Map<String, Passageiro> passageiroMap = new HashMap<>();
    private Map<String, Rota> rotaMap = new HashMap<>();
    private Map<String, Viagem> viagemMap = new HashMap<>();

    public void cadastrarOnibus(Onibus onibus) throws CadastroDuplicadoException {
        if (onibusMap.containsKey(onibus.getPlaca())) {
            throw new CadastroDuplicadoException("Ônibus com a placa " + onibus.getPlaca() + " já está cadastrado.");
        }
        onibusMap.put(onibus.getPlaca(), onibus);
    }

    public void cadastrarMotorista(Motorista motorista) throws CadastroDuplicadoException {
        if (motoristaMap.containsKey(motorista.getCPF())) {
            throw new CadastroDuplicadoException("Motorista com o CPF " + motorista.getCPF() + " já está cadastrado.");
        }
        motoristaMap.put(motorista.getCPF(), motorista);
    }

    public void cadastrarPassageiro(Passageiro passageiro) throws CadastroDuplicadoException {
        if (passageiroMap.containsKey(passageiro.getCPF())) {
            throw new CadastroDuplicadoException("Passageiro com o CPF " + passageiro.getCPF() + " já está cadastrado.");
        }
        passageiroMap.put(passageiro.getCPF(), passageiro);
    }

    public void cadastrarRota(Rota rota) throws CadastroDuplicadoException, RotaInvalidaException {
        String rotaId = rota.getOrigem() + "-" + rota.getDestino();
        if (rotaMap.containsKey(rotaId)) {
            throw new CadastroDuplicadoException("Rota com o ID " + rotaId + " já está cadastrada.");
        }

        if (!rota.validaRota()) {
            throw new RotaInvalidaException("A origem ou o destino não fazem parte do conjunto de trechos da rota.");
        }

        rotaMap.put(rotaId, rota);
    }

    public void cadastrarViagem(Viagem viagem) throws CadastroDuplicadoException {
        String viagemId = viagem.getId();
        if (viagemIdExist(viagemId)) {
            throw new CadastroDuplicadoException("Viagem já cadastrada com o mesmo ônibus, motorista e data de início.");
        }
        viagemMap.put(viagemId,viagem);
    }

    private boolean viagemIdExist(String viagemId) {
        return viagemMap.containsKey(viagemId);
    }
}
