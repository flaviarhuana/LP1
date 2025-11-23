class Filme {
    String nome;
    String genero;
    int ano;
    int duracao;
    double somaNotas;
    int qtdAvaliacoes;

    public Filme(String nome, String genero, int ano, int duracao) {
        this.nome = nome;
        this.genero = genero;
        this.ano = ano;
        this.duracao = duracao;
        this.somaNotas = 0.0;
        this.qtdAvaliacoes = 0;
    }

    public void exibirDetalhes() {
        System.out.println("--- Detalhes do Título ---");
        System.out.println("Nome: " + nome);
        System.out.println("Gênero: " + genero);
        System.out.println("Ano de Lançamento: " + ano);
        System.out.println("Duração (minutos): " + duracao);

        if (qtdAvaliacoes > 0) {
            System.out.printf("Média das Avaliações: %.2f (baseada em %d avaliações)\n", calcularMediaAvaliacoes(), qtdAvaliacoes);
        } else {
            System.out.println("Ainda não há avaliações para este título.");
        }
        System.out.println("--------------------------");
    }

    public void avaliar(int nota) {
        if (nota >= 0 && nota <= 10) {
            somaNotas += nota;
            qtdAvaliacoes++;
            System.out.println("Avaliação de " + nota + " registrada com sucesso!");
        } else {
            System.out.println("Erro: A nota deve ser entre 0 e 10.");
        }
    }

    public double calcularMediaAvaliacoes() {
        if (qtdAvaliacoes == 0) {
            return 0.0;
        }
        return somaNotas / qtdAvaliacoes;
    }

    public String getNome() {
        return nome;
    }

    public int getQtdAvaliacoes() {
        return qtdAvaliacoes;
    }
}