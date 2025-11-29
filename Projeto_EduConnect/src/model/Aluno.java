package model;
import enums.STATUSALUNO;
import model.interfaces.Certificavel;

public class Aluno extends Pessoa implements Certificavel {
    private double nota1, nota2, nota3;
    private int presencas, totalAulas;

    public Aluno() {

    }
    public Aluno(String nome, int idade, int matricula) {

        super(nome, idade, matricula);
    }

    public void registrarPresenca() {

        presencas++;
    }

    public void setTotalAulas(int totalAulas) {

        this.totalAulas = totalAulas;
    }

    public void setNotas(double n1, double n2, double n3) {
        this.nota1 = n1;
        this.nota2 = n2;
        this.nota3 = n3;
    }
    @Override
    public double calcularMedia() {

        return (nota1 + nota2 + nota3) / 3.0;
    }
    @Override
    public double calcularFrequencia() {
        if (totalAulas == 0) return 0;
        return (presencas * 100.0) / totalAulas;
    }
    public STATUSALUNO getStatus() {
        double media = calcularMedia();
        double freq = calcularFrequencia();

        if (media >= 7 && freq >= 75)
            return STATUSALUNO.APROVADO;

        if (media < 7)
            return STATUSALUNO.REPROVADO_NOTA;

        if (freq < 75)
            return STATUSALUNO.REPROVADO_FREQUENCIA;

        return STATUSALUNO.CURSANDO;
    }
    @Override
    public void emitirCertificado() {
        STATUSALUNO status = getStatus();
        System.out.println("Status: " + status);

        if (status == STATUSALUNO.APROVADO) {
            System.out.println("Certificado emitido para " + nome);
        } else {
            System.out.println("Aluno não atingiu os requisitos.");
        }
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

    public int getPresencas() {
        return presencas;
    }

    public void setPresencas(int presencas) {
        this.presencas = presencas;
    }

    public int getTotalAulas() {
        return totalAulas;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", matricula=" + matricula +
                '}';
    }
}

