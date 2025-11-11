package model;

import enums.CARGO;
import model.interfaces.FolhaPagamento;

public final class Coordenador extends Pessoa implements FolhaPagamento {
    private String especialidade;
    public CARGO cargo;
    private int matricula;


    public Coordenador(){

    }

    public Coordenador(String nome, int idade, int matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    @Override
    public void payment() {
        System.out.println("Salário: R$ 4200.00");

    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public CARGO getCargo() {
        return cargo;
    }

    public void setCargo(CARGO cargo) {
        this.cargo = cargo;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }


    @Override
    public String toString() {
        return "Coordenador{" +
                "especialidade='" + especialidade + '\'' +
                ", cargo=" + cargo +
                ", matricula=" + matricula +
                ", idade=" + idade +
                ", nome='" + nome + '\'' +
                '}';
    }

    @Override
    public void quemSouEu() {

    }

    @Override
    public void minhaAtividade() {

    }
}
