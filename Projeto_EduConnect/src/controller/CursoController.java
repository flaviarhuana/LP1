package controller;

import model.Curso;
import model.Professor;
import service.CursoService;
import service.ProfessorService;

public class CursoController {

    private CursoService cursoService;
    private ProfessorService professorService;

    public CursoController(CursoService cursoService, ProfessorService professorService) {
        this.cursoService = cursoService;
        this.professorService = professorService;
    }

    public void cadastrarCurso(String nomeCurso, String nomeProfessor, int totalAulas) {
        Professor p = professorService.buscarPorNome(nomeProfessor);

        if (p == null) {
            System.out.println("Professor não encontrado!");
            return;
        }

        Curso c = new Curso(nomeCurso, p, totalAulas);
        cursoService.cadastrar(c);
    }

    public Curso buscarCurso(String nome) {
        return cursoService.buscarPorNome(nome);
    }

    public void listarCursos() {
        cursoService.listar();
    }
}