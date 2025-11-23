import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //instanciar objetos; OBSERVAÇÃO SLIDE

        Scanner sc = new Scanner(System.in);
        Aluno a = new Aluno();
        Professor prof = new Professor();

        /*System.out.print("Nome completo: ");
        prof.setNome(sc.nextLine());

        System.out.print("Idade: ");
        prof.setIdade(sc.nextInt());

        System.out.println("Matrícula: ");
        a.setMatricula(sc.nextInt());

        System.out.println("Nota 1: ");
        a.setNota1(sc.nextDouble());

        System.out.println("Nota 2: ");
        a.setNota2(sc.nextDouble());

        System.out.println("Nota 3: ");
        a.setNota3(sc.nextDouble());



        System.out.println("Nome completo: " + prof.getNome());
        System.out.println("Idade: " + prof.getIdade());
        System.out.println("Matrícula: " + a.getMatricula());
        System.out.println("Notas 1, 2 e 3 respectivamente: " + a.getNota1() + "; " + a.getNota2() + "; " + a.getNota3());
        // linha para fazer o cálculo da média e depois exibí-la.
        a.calcularMedia();
        System.out.println("Média: " + a.getMedia());

         */


        //Aula 7

        System.out.println("Informações do aluno: ");
        System.out.println(a);

        prof.setCargo(CARGO.professor);
        System.out.println(prof.getCargo());
        prof.payment();
    }
}