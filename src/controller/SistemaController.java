package controller;

import service.AlunoService;
import service.CursoService;
import service.ProfessorService;

public class SistemaController {

    private AlunoController alunoController;
    private ProfessorController professorController;
    private CursoController cursoController;

    public SistemaController(ProfessorService ps, AlunoService as, CursoService cs) {
        this.professorController = new ProfessorController(ps);
        this.alunoController = new AlunoController(as);
        this.cursoController = new CursoController(cs, ps);
    }

    public AlunoController getAlunoController() {
        return alunoController;
    }

    public ProfessorController getProfessorController() {
        return professorController;
    }

    public CursoController getCursoController() {
        return cursoController;
    }
}
