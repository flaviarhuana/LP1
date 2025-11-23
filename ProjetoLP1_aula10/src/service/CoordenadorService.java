package service;

import model.Coordenador;

import java.util.ArrayList;
import java.util.List;

public class CoordenadorService {
    private List<Coordenador> coordenadores = new ArrayList<>();
    public void cadastrarCoordenador(Coordenador c) {
        coordenadores.add(c); }
    public List<Coordenador> listarCoordenadores() {
        return coordenadores;
    }
    public void atualizarCoordenador(String nome, String novoNome) {
        for (Coordenador c : coordenadores) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNome(novoNome);
                System.out.println("Atualizado com sucesso!");
                return; }
        } System.out.println("Coordenador não foi encontrado."); }
    public void deletarCoordenador(String nome) {
        for (int i = 0; i < coordenadores.size(); i++) {
            if (coordenadores.get(i).getNome().equalsIgnoreCase(nome)) {
                coordenadores.remove(i);
                System.out.println("Deletado com sucesso!");
                return; }
            System.out.println("Coordenador não encontrado."); }
    }
}
