package controller;

import model.Coordenador;
import service.CoordenadorService;

import java.util.List;

public class CoordenadorController {
    private CoordenadorService cS = new CoordenadorService();

    public void cadastrarCoordenador(Coordenador c) {
        cS.cadastrarCoordenador(c);
    }
    public List<Coordenador> listarCoordenadores() {
        return cS.listarCoordenadores();
    }
    public void atualizarCoordenador(String nome, String novoNome) {
        cS.atualizarCoordenador(nome, novoNome);
    }
    public void deletarCoordenador(String nome) {
        cS.deletarCoordenador(nome);
    }
}
