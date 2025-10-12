import java.util.Scanner;

public class Main {

    private static final int CAPACIDADE_MAXIMA = 50;
    private static Filme[] catalogo = new Filme[CAPACIDADE_MAXIMA];
    private static int totalFilmesCadastrados = 0;

    private static Scanner tcl = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;

        do {
            exibirMenu();

            opcao = tcl.nextInt();
            tcl.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarTitulo();
                    break;
                case 2:
                    exibirDetalhesTitulo();
                    break;
                case 3:
                    avaliarTitulo();
                    break;
                case 4:
                    calcularEExibirMedia();
                    break;
                case 5:
                    System.out.println("Encerrando o programa. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 5);

        tcl.close();
    }

    public static void exibirMenu() {
        System.out.println("\n--- Plataforma de Streaming - Menu ---");
        System.out.println("1. Cadastrar um título");
        System.out.println("2. Exibir os detalhes do título");
        System.out.println("3. Avaliar o título");
        System.out.println("4. Calcular e exibir média das avaliações (por título)");
        System.out.println("5. Encerrar o programa");
        System.out.print("Escolha uma opção: ");
    }

    public static void cadastrarTitulo() {
        if (totalFilmesCadastrados >= CAPACIDADE_MAXIMA) {
            System.out.println("ERRO: O catálogo atingiu a capacidade máxima de " + CAPACIDADE_MAXIMA + " títulos.");
            return;
        }

        System.out.println("\n--- Cadastro de Título ---");
        System.out.print("Nome do Filme: ");
        String nome = tcl.nextLine();
        System.out.print("Gênero: ");
        String genero = tcl.nextLine();

        System.out.print("Ano de Lançamento: ");
        int ano = tcl.nextInt();
        tcl.nextLine();

        System.out.print("Duração (minutos): ");
        int duracao = tcl.nextInt();
        tcl.nextLine();

        Filme novoFilme = new Filme(nome, genero, ano, duracao);

        catalogo[totalFilmesCadastrados] = novoFilme;
        totalFilmesCadastrados++;

        System.out.println("\nFilme '" + nome + "' cadastrado com sucesso!");
    }

    public static void exibirDetalhesTitulo() {
        if (totalFilmesCadastrados == 0) {
            System.out.println("O catálogo está vazio. Cadastre um título primeiro.");
            return;
        }
        System.out.print("Digite o nome do título para exibir os detalhes: ");
        String nomeBusca = tcl.nextLine();

        Filme filmeEncontrado = null;
        for (int i = 0; i < totalFilmesCadastrados; i++) {
            if (catalogo[i].getNome().equalsIgnoreCase(nomeBusca.trim())) {
                filmeEncontrado = catalogo[i];
                break;
            }
        }

        if (filmeEncontrado != null) {
            filmeEncontrado.exibirDetalhes();
        } else {
            System.out.println("Título '" + nomeBusca + "' não encontrado no catálogo.");
        }
    }

    public static void avaliarTitulo() {
        if (totalFilmesCadastrados == 0) {
            System.out.println("O catálogo está vazio. Cadastre um título primeiro.");
            return;
        }
        System.out.print("Digite o nome do título que deseja avaliar: ");
        String nomeBusca = tcl.nextLine();

        Filme filmeEncontrado = null;
        for (int i = 0; i < totalFilmesCadastrados; i++) {
            if (catalogo[i].getNome().equalsIgnoreCase(nomeBusca.trim())) {
                filmeEncontrado = catalogo[i];
                break;
            }
        }

        if (filmeEncontrado != null) {
            int nota;
            do {
                System.out.print("Digite sua nota (0 a 10) para '" + filmeEncontrado.getNome() + "': ");
                nota = tcl.nextInt();
                tcl.nextLine();

                if (nota < 0 || nota > 10) {
                    System.out.println("Nota fora do intervalo. Digite um valor entre 0 e 10.");
                }
            } while (nota < 0 || nota > 10);

            filmeEncontrado.avaliar(nota);

        } else {
            System.out.println("Título '" + nomeBusca + "' não encontrado no catálogo.");
        }
    }

    public static void calcularEExibirMedia() {
        if (totalFilmesCadastrados == 0) {
            System.out.println("O catálogo está vazio. Cadastre um título primeiro.");
            return;
        }

        System.out.print("Digite o nome do título para ver a média das avaliações: ");
        String nomeBusca = tcl.nextLine();

        Filme filmeEncontrado = null;
        for (int i = 0; i < totalFilmesCadastrados; i++) {
            if (catalogo[i].getNome().equalsIgnoreCase(nomeBusca.trim())) {
                filmeEncontrado = catalogo[i];
                break;
            }
        }

        if (filmeEncontrado != null) {
            double media = filmeEncontrado.calcularMediaAvaliacoes();
            if (filmeEncontrado.getQtdAvaliacoes() > 0) {
                System.out.printf("\nA Média das Avaliações para '%s' é: %.2f (baseada em %d avaliações)\n",
                        filmeEncontrado.getNome(), media, filmeEncontrado.getQtdAvaliacoes());
            } else {
                System.out.println("O título '" + filmeEncontrado.getNome() + "' ainda não possui avaliações.");
            }
        } else {
            System.out.println("Título '" + nomeBusca + "' não encontrado no catálogo.");
        }
    }
}