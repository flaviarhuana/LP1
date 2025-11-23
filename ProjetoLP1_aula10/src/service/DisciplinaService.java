package service;

import model.Disciplina;

import java.util.ArrayList;
import java.util.List;

public class DisciplinaService {
    private List<Disciplina> disciplinas = new ArrayList<>();
    public void cadastrarDisciplina(Disciplina d) {
        disciplinas.add(d); }
    public List<Disciplina> listarDisciplinas() {
        return disciplinas;
    }
    public void atualizarDisciplina(String nome, String novoNome) {
        for (Disciplina d : disciplinas) {
            if (d.getNome().equalsIgnoreCase(nome)) {
                d.setNome(novoNome);
                System.out.println("Atualizado com sucesso!");
                return; }
        } System.out.println("Coordenador não foi encontrado."); }
    public void deletarCoordenador(String nome) {
        for (int i = 0; i < disciplinas.size(); i++) {
            if (disciplinas.get(i).getNome().equalsIgnoreCase(nome)) {
                disciplinas.remove(i);
                System.out.println("Deletada com sucesso!");
                return; }
            System.out.println("Disciplina não encontrada."); }
    }
}
