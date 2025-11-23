package controller;

import model.Professor;
import service.ProfessorService;

import java.util.List;

public class ProfessorController {
    private ProfessorService pS = new ProfessorService();

    public void cadastrarProfessor(Professor professor) {
        pS.cadastrarProfessor(professor);
    }
    public List<Professor> listarProfessores() {
        return pS.listarProfessores();
    }
    public void atualizarProfessor(String nome, String novoNome) {
        pS.atualizarProfessor(nome, novoNome);
    }
    public void deletarProfessor(String nome) {
        pS.deletarProfessor(nome);
    }
}
