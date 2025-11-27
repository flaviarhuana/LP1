package model;

public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected int matricula;

    public Pessoa() {}
    public Pessoa(String nome, int idade, int matricula) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {

        return idade;
    }
    public void setIdade(int idade) {

        this.idade = idade;
    }

    public int getMatricula() {

        return matricula;
    }

    public void setMatricula(int matricula) {

        this.matricula = matricula;
    }
}
