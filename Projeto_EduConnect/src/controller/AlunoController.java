package controller;

import model.Aluno;
import service.AlunoService;

public class AlunoController {

    private AlunoService alunoService;

    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    public void cadastrarAluno(String nome, int idade, int matricula) {
        Aluno a = new Aluno(nome, idade, matricula);
        alunoService.cadastrar(a);
    }

    public void registrarPresenca(String nomeAluno, int totalAulas) {
        Aluno a = alunoService.buscarPorNome(nomeAluno);

        if (a != null) {
            a.setTotalAulas(totalAulas);
            a.registrarPresenca();
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }

    public void inserirNotas(String nomeAluno, double n1, double n2, double n3) {
        Aluno a = alunoService.buscarPorNome(nomeAluno);

        if (a != null) {
            a.setNotas(n1, n2, n3);
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }

    public void emitirCertificado(String nomeAluno) {
        Aluno a = alunoService.buscarPorNome(nomeAluno);

        if (a != null) {
            a.emitirCertificado();
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }

    public Aluno buscarAluno(String nome) {
        return alunoService.buscarPorNome(nome);
    }

    public void listarAlunos() {
        alunoService.listar();
    }
}
