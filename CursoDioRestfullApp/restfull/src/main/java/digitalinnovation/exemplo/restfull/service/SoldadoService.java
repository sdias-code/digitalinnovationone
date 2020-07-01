package digitalinnovation.exemplo.restfull.service;

import digitalinnovation.exemplo.restfull.controller.request.SoldadoEditResquest;
import digitalinnovation.exemplo.restfull.dto.Soldado;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class SoldadoService {

    public Soldado buscarSoldado(String cpf){
        Soldado soldado = new Soldado();
        soldado.setCpf(cpf);
        soldado.setNome("Légolas");
        soldado.setRaca("Elfo");
        soldado.setArma("Arco e flexa");
        return soldado;
    }

    public void criarSoldado(Soldado soldado){

    }

    public void alterarSoldado(String cpf, SoldadoEditResquest soldadoEditResquest) {

    }

    public void deletarSoldado(String cpf) {

    }

    public List<Soldado> buscarSoldados(){
        Soldado soldado1 = new Soldado();
        soldado1.setCpf("123456789");
        soldado1.setNome("Andreza");
        soldado1.setRaca("Elfo");
        soldado1.setArma("Espada");

        Soldado soldado2 = new Soldado();
        soldado2.setCpf("987654321");
        soldado2.setNome("Roberto");
        soldado2.setRaca("Humano");
        soldado2.setArma("Machado");

        return Arrays.asList(soldado1, soldado2);
    }
}
