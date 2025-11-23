public class Funcionario {
    private String nome;
    private int mat;
    private double sal;
    double desconto;
    double salLiq;

    public Funcionario() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public void exibirInfos() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + mat);
        System.out.printf("Salário: R$ %.2f%n", sal);
    }

    public void calcularINSS() {
        desconto = sal * 0.15;
        System.out.printf("Seu salário terá um desconto de R$ %.2f%n", desconto);
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public void calcularSalarioLiquido() {
        salLiq = sal * 0.85;
        System.out.printf("Seu salário líquido é igual a R$ %.2f%n", salLiq);
    }

    public double getSalLiq() {
        return salLiq;
    }

    public void setSalLiq(double salLiq) {
        this.salLiq = salLiq;
    }

    public void exibirContracheque() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + mat);
        System.out.printf("Salário Bruto: R$ %.2f%n", sal);
        System.out.printf("Desconto INSS: R$ %.2f%n", desconto);
        System.out.printf("Salário Líquido: R$ %.2f%n", salLiq);

    }
}
