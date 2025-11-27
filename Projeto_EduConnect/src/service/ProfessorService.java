package service;

import model.Professor;
import java.util.ArrayList;

public class ProfessorService {
    private ArrayList<Professor> professores = new ArrayList<>();

    public void cadastrar(Professor p) {
        professores.add(p);
        System.out.println("Professor cadastrado!");
    }

    public void listar() {
        for (Professor p : professores) {
            System.out.println(p);
        }
    }

    public Professor buscarPorNome(String nome) {
        for (Professor p : professores) {
            if (p.getNome().equalsIgnoreCase(nome)) return p;
        }
        return null;
    }
}
