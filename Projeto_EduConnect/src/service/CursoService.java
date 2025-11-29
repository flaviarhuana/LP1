package service;

import model.Curso;
import java.util.ArrayList;

public class CursoService {
    private ArrayList<Curso> cursos = new ArrayList<>();

    public void cadastrar(Curso c) {
        cursos.add(c);
        System.out.println("Curso cadastrado!"+ c.getNome());
    }

    public void listar() {
        for (Curso c : cursos) {
            System.out.println(c);
        }
    }

    public Curso buscarPorNome(String nome) {
        for (Curso c : cursos) {
            if (c.getNome().equalsIgnoreCase(nome)) return c;
        }
        return null;
    }

}