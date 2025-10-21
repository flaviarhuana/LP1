public abstract class Pessoa {
    protected int idade;
    protected String nome;

    public abstract void quemSouEu();
    public abstract void minhaAtividade();

    @Override
    public String toString() {
        return "Pessoa{" +
                "idade=" + idade +
                ", nome='" + nome + '\'' +
                '}';
    }

    //construtor aluno
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String exibirDados(){
        return "Nome: " + nome + ", Idade: " + idade;
    }


    public Pessoa(String nome) {

    }

    public Pessoa() {

    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
