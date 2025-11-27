package controller;

import model.Professor;
import service.ProfessorService;

public class ProfessorController {

    private ProfessorService professorService;

    public ProfessorController(ProfessorService professorService) {
        this.professorService = professorService;
    }

    public void cadastrarProfessor(String nome, int idade, int matricula) {
        Professor p = new Professor(nome, idade, matricula);
        professorService.cadastrar(p);
    }

    public Professor buscarProfessor(String nome) {
        return professorService.buscarPorNome(nome);
    }

    public void listarProfessores() {
        professorService.listar();
    }
}