package service;

import controller.SistemaController;
import java.util.Scanner;

public class SistemaService {

    private Scanner sc = new Scanner(System.in);

    private ProfessorService professorService = new ProfessorService();
    private AlunoService alunoService = new AlunoService();
    private CursoService cursoService = new CursoService();

    private SistemaController controller =
            new SistemaController(professorService, alunoService, cursoService);

    public void menu() {
        int op;

        do {
            System.out.println("\n=== EDUCONNECT ===");
            System.out.println("1 - Cadastrar Professor");
            System.out.println("2 - Cadastrar Aluno");
            System.out.println("3 - Cadastrar Curso");
            System.out.println("4 - Registrar Presença");
            System.out.println("5 - Inserir Notas");
            System.out.println("6 - Emitir Certificado");
            System.out.println("7 - Listar Tudo");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            op = sc.nextInt();
            sc.nextLine();

            switch (op) {

                // ------------------ PROFESSOR ------------------
                case 1:
                    System.out.print("Nome: ");
                    String nomeP = sc.nextLine();

                    System.out.print("Idade: ");
                    int idadeP = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Matrícula: ");
                    int matriculaP = sc.nextInt();

                    controller.getProfessorController()
                            .cadastrarProfessor(nomeP, idadeP, matriculaP);
                    break;

                // ------------------ ALUNO ------------------
                case 2:
                    System.out.print("Nome: ");
                    String nomeA = sc.nextLine();

                    System.out.print("Idade: ");
                    int idadeA = sc.nextInt();

                    System.out.print("Matrícula: ");
                    int mat = sc.nextInt();
                    sc.nextLine();

                    controller.getAlunoController()
                            .cadastrarAluno(nomeA, idadeA, mat);
                    break;

                // ------------------ CURSO ------------------
                case 3:
                    System.out.print("Nome do curso: ");
                    String nomeCurso = sc.nextLine();

                    System.out.print("Professor responsável: ");
                    String nomeProf = sc.nextLine();

                    System.out.print("Total de aulas: ");
                    int totalAulas = sc.nextInt();
                    sc.nextLine();

                    controller.getCursoController()
                            .cadastrarCurso(nomeCurso, nomeProf, totalAulas);
                    break;

                // ------------------ PRESENÇA ------------------
                case 4:
                    System.out.print("Aluno: ");
                    String nomeAlunoPres = sc.nextLine();

                    System.out.print("Total de aulas do curso: ");
                    int total = sc.nextInt();
                    sc.nextLine();

                    controller.getAlunoController()
                            .registrarPresenca(nomeAlunoPres, total);
                    break;

                // ------------------ NOTAS ------------------
                case 5:
                    System.out.print("Aluno: ");
                    String nomeAlunoNotas = sc.nextLine();

                    System.out.print("Nota 1: ");
                    double n1 = sc.nextDouble();

                    System.out.print("Nota 2: ");
                    double n2 = sc.nextDouble();

                    System.out.print("Nota 3: ");
                    double n3 = sc.nextDouble();
                    sc.nextLine();

                    controller.getAlunoController()
                            .inserirNotas(nomeAlunoNotas, n1, n2, n3);
                    break;

                // ------------------ CERTIFICADO ------------------
                case 6:
                    System.out.print("Aluno: ");
                    String alunoCert = sc.nextLine();

                    controller.getAlunoController()
                            .emitirCertificado(alunoCert);
                    break;

                // ------------------ LISTAGEM ------------------
                case 7:
                    System.out.println("\n--- PROFESSORES ---");
                    controller.getProfessorController().listarProfessores();

                    System.out.println("\n--- ALUNOS ---");
                    controller.getAlunoController().listarAlunos();

                    System.out.println("\n--- CURSOS ---");
                    controller.getCursoController().listarCursos();
                    break;

            }

        } while (op != 0);
    }
}
