package model;

public class Curso {
    private String nome;
    private Professor professor;
    private int totalAulas;

    public Curso() {

    }
    public Curso(String nome, Professor professor, int totalAulas) {
        this.nome = nome;
        this.professor = professor;
        this.totalAulas = totalAulas;
    }

    public String getNome() {

        return nome;
    }
    public int getTotalAulas() {

        return totalAulas;
    }
    public Professor getProfessor() {

        return professor;
    }

    @Override
    public String toString() {
        return "Curso: " + nome + " | Professor: " + professor.getNome() + " | Aulas: " + totalAulas;
    }
}
