package service;

import model.Aluno;
import model.Curso;
import model.Professor;
import java.util.Scanner;

public class SistemaService {

    Scanner sc= new Scanner(System.in);
    ProfessorService professorService = new ProfessorService();
    AlunoService alunoService = new AlunoService();
    CursoService cursoService = new CursoService();

    private void cadastrarAluno() {
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Idade: ");
        int idade = sc.nextInt();
        System.out.print("Matrícula: ");
        int mat = sc.nextInt(); sc.nextLine();
        Aluno a = new Aluno(nome, idade, mat);
        alunoService.cadastrar(a);
    }

    private void cadastrarProfessor() {
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Idade: ");
        int idade = sc.nextInt();
        System.out.print("Matrícula: ");
        int mat = sc.nextInt(); sc.nextLine();
        Professor p = new Professor();
        professorService.cadastrar(p);
    }

    private void cadastrarCurso() {
        System.out.print("Nome do curso: ");
        String nome = sc.nextLine();
        System.out.print("Professor responsável: ");
        String nomeProf = sc.nextLine();
        Professor prof = professorService.buscarPorNome(nomeProf);
        if (prof == null) {
            System.out.println("Professor não encontrado!");
            return;
        }
        System.out.print("Total de aulas: ");
        int total = sc.nextInt(); sc.nextLine();
        Curso c = new Curso(nome, prof, total);
        cursoService.cadastrar(c);
    }

    private void registrarPresenca() {
        System.out.print("Nome do aluno: ");
        String nomeAluno = sc.nextLine();
        Aluno a = alunoService.buscarPorNome(nomeAluno);
        if (a == null) { System.out.println("Aluno não encontrado!");
            return;
        }
        System.out.print("Total de aulas do curso: ");
        int total = sc.nextInt(); sc.nextLine();
        a.setTotalAulas(total);
        a.registrarPresenca();
        System.out.println("Presença registrada!");
    }

    private void inserirNotas() {
        System.out.print("Nome do aluno: ");
        String nomeAluno = sc.nextLine();
        Aluno a = alunoService.buscarPorNome(nomeAluno);
        if (a == null) { System.out.println("Aluno não encontrado!"); return; }

        System.out.print("Nota 1: ");
        double n1 = sc.nextDouble();
        System.out.print("Nota 2: ");
        double n2 = sc.nextDouble();
        System.out.print("Nota 3: ");
        double n3 = sc.nextDouble();
        sc.nextLine();

        a.setNotas(n1, n2, n3);
        System.out.println("Notas registradas!");
    }

    private void emitirCertificado() {
        System.out.print("Nome do aluno: ");
        String nome = sc.nextLine();
        Aluno a = alunoService.buscarPorNome(nome);
        if (a != null) a.emitirCertificado();
        else System.out.println("Aluno não encontrado!");
    }

    private void listarTudo() {
        System.out.println("\n--- PROFESSORES ---");
        professorService.listar();
        System.out.println("\n--- ALUNOS ---");
        alunoService.listar();
        System.out.println("\n--- CURSOS ---");
        cursoService.listar();
    }

    public void menu() {
        int op;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Cadastrar Professor");
            System.out.println("2 - Cadastrar Aluno");
            System.out.println("3 - Cadastrar Curso");
            System.out.println("4 - Registrar Presença");
            System.out.println("5 - Inserir Notas");
            System.out.println("6 - Emitir Certificado");
            System.out.println("7 - Listar Tudo");
            System.out.println("0 - Sair");


            if (sc.hasNextInt()) {
                op = sc.nextInt();
                sc.nextLine();
            } else {
                System.out.println("Opção inválida. Digite um número.");
                sc.nextLine();
                op = -1;
            }

            switch (op) {
                case 1: cadastrarProfessor();
                break;
                case 2: cadastrarAluno();
                break;
                case 3: cadastrarCurso();
                break;
                case 4: registrarPresenca();
                break;
                case 5: inserirNotas();
                break;
                case 6: emitirCertificado();
                break;
                case 7: listarTudo();
                break;
                case 0: System.out.println("Saindo do sistema...");
                break;

                default:
                    if (op != -1) {
                        System.out.println("Opção inválida. Tente novamente.");
                    }break;
            }

        } while (op != 0);
    }
}

