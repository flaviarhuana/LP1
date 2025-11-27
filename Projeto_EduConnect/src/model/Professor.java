package model;

import java.util.Scanner;

public class Professor extends Pessoa {

    public Professor() {

    }
    public Professor(String nome, int idade, int matricula) {
        super(nome, idade, matricula);
    }


    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", matricula=" + matricula +
                '}';
    }
}
