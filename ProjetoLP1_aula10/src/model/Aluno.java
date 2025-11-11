package model;

public final class Aluno extends Pessoa {
    private int matricula;
    private double nota1, nota2, nota3, media;

    public void calcularMedia() {
        media = (nota1+nota2+nota3)/3;
    }

    @Override
    public void quemSouEu() {

    }

    @Override
    public void minhaAtividade() {

    }

    @Override
    public String toString() {
        return "Aluno{" +
                "matricula=" + matricula +
                ", nota1=" + nota1 +
                ", nota2=" + nota2 +
                ", nota3=" + nota3 +
                ", media=" + media +
                ", idade=" + idade +
                ", nome='" + nome + '\'' +
                '}';
    }

    //construtor inserido em Aluno devido aos dados de parâmetros (nome, idade, matricula) prefixados na main
    //construtor tem como função setar os dados para a memória
    public Aluno(String nome, int idade, int matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    public Aluno() {

    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public void cadastrarAluno(Aluno a) {

    }
}
