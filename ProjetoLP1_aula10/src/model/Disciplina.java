package model;

public final class Disciplina {

    String nome;
    int codigo;

    public Disciplina(String nome, int codigo){
        this.nome = nome;
        this.codigo = codigo;
    }

    public Disciplina(){

    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "nome='" + nome + '\'' +
                ", codigo=" + codigo +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
