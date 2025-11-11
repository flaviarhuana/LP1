package service;

import model.Aluno;

import java.util.ArrayList;
import java.util.List;

public class AlunoService {
    private List<Aluno> alunos = new ArrayList<>();
    public void cadastrarAluno(Aluno a) {
        alunos.add(a); }
    public List<Aluno> listarAlunos() {
        return alunos;
    }
    public void atualizarAluno(String nome, String novoNome) {
        for (Aluno a : alunos) {
            if (a.getNome().equalsIgnoreCase(nome)) {
                a.setNome(novoNome);
                System.out.println("Atualizado com sucesso!");
                return; }
        } System.out.println("Aluno não foi encontrado."); }
    public void deletarAluno(String nome) {
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getNome().equalsIgnoreCase(nome)) {
                alunos.remove(i);
                System.out.println("Deletado com sucesso!");
                return; }
            System.out.println("Aluno não encontrado."); }
    }
}
