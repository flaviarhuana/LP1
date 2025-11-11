package controller;

import model.Aluno;
import service.AlunoService;

import java.util.List;

public class AlunoController {
    private AlunoService aS = new AlunoService();

    public void cadastrarAluno(Aluno a) {
        aS.cadastrarAluno(a);
    }
    public List<Aluno> listarAlunos() {
        return aS.listarAlunos();
    }
    public void atualizarAluno(String nome, String novoNome) {
        aS.atualizarAluno(nome, novoNome);
    }
    public void deletarAluno(String nome) {
        aS.deletarAluno(nome);
    }
}
