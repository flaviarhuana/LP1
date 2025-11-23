package model;

import enums.CARGO;
import model.interfaces.FolhaPagamento;

public final class Professor extends Pessoa implements FolhaPagamento {
    private String especialidade;
    public CARGO cargo;

    @Override
    public void payment() {
        System.out.println("Salário: R$ 4200.00");
    }

    @Override
    public String toString() {
        return "Professor{" +
                "especialidade='" + especialidade + '\'' +
                ", cargo=" + cargo +
                '}';
    }

    @Override
    public void quemSouEu() {

    }

    @Override
    public void minhaAtividade() {

    }

    public CARGO getCargo() {
        return cargo;
    }

    public void setCargo(CARGO cargo) {
        this.cargo = cargo;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
