package service;

import model.Aluno;
import java.util.ArrayList;

public class AlunoService {
    private ArrayList<Aluno> alunos = new ArrayList<>();

    public void cadastrar(Aluno a) {
        alunos.add(a);
        System.out.println("Aluno cadastrado!");
    }

    public void listar() {
        for (Aluno a : alunos) {
            System.out.println(a);
        }
    }

    public Aluno buscarPorNome(String nome) {
        for (Aluno a : alunos) {
            if (a.getNome().equalsIgnoreCase(nome)) return a;
        }
        return null;
    }
}
