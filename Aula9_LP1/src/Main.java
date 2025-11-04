import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //instanciar objetos; OBSERVAÇÃO SLIDE

        Scanner sc = new Scanner(System.in);
        Aluno a = new Aluno();
        Professor p = new Professor();
        int opcao = -1;
        String entrada = sc.nextLine();

        do {
            System.out.println("Sistema de Cadastro");
            System.out.println("1. Cadastrar Professor");
            System.out.println("2. Cadastrar Aluno");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                System.out.println("Opção inválida. Por favor, digite um número.");
                opcao = -1;
                continue;
            }


            switch (opcao) {
                case 1:
                    System.out.print("Nome completo: ");
                    p.setNome(sc.nextLine());

                    System.out.print("Idade: ");
                    p.setIdade(sc.nextInt());
                    break;

                case 2:
                    System.out.print("Nome completo: ");
                    a.setNome(sc.nextLine());

                    System.out.print("Idade: ");
                    a.setIdade(sc.nextInt());

                    System.out.println("Matrícula: ");
                    a.setMatricula(sc.nextInt());

                    System.out.println("Nota 1: ");
                    a.setNota1(sc.nextDouble());

                    System.out.println("Nota 2: ");
                    a.setNota2(sc.nextDouble());

                    System.out.println("Nota 3: ");
                    a.setNota3(sc.nextDouble());
                    break;

                case 0:
                    System.out.println("Encerrando o sistema.");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");

            }
        }while (opcao != 0);










        /*
        System.out.println("Nome completo: " + p.getNome());
        System.out.println("Idade: " + p.getIdade());
        System.out.println("Matrícula: " + a.getMatricula());
        System.out.println("Notas 1, 2 e 3 respectivamente: " + a.getNota1() + "; " + a.getNota2() + "; " + a.getNota3());
        // linha para fazer o cálculo da média e depois exibí-la.
        a.calcularMedia();
        System.out.println("Média: " + a.getMedia());



        //Aula 7
        /* AUla 8
        System.out.println("Informações do aluno: ");
        System.out.println(a);

        prof.setCargo(CARGO.professor);
        System.out.println(prof.getCargo());
        prof.payment();
        */

        /*
        p.exibirDados();
        p.payment();
        a.calcularMedia();
        */

    }
}