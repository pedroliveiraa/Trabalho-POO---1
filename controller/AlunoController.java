package controller;

import dao.AlunoDAO;

import java.util.List;
import java.util.Scanner;
import model.Aluno;
import model.Curso;
import view.AlunoView;

public class AlunoController {

    

    public static void Cadastrar() {

        Scanner scan = new Scanner(System.in);

        AlunoView.SolicitaMatricula();
        int matricula = scan.nextInt();

        AlunoView.Nome();
        String nome = scan.next();

        AlunoView.Idade();
        int idade  = scan.nextInt();

        List<Curso> cursos = CursoController.listarCursos();

        AlunoView.Curso();
        int opcao = scan.nextInt() - 1;

        Curso curso = null;
        if (opcao >= 0 && opcao < cursos.size()) {
            curso = cursos.get(opcao);
        } else {
            System.out.println("Opção de curso invalida");
            return;
        }

        Aluno aluno = new Aluno(matricula, nome, idade, curso);
        AlunoDAO.insert(aluno);

        AlunoView.AlunoCadastrado();

    }

    public static void Consultar() {

        Scanner scan = new Scanner(System.in);

        AlunoView.SolicitaMatricula();
        int matricula = scan.nextInt();

        Aluno aluno = AlunoDAO.get(matricula);

        if (aluno != null) {
            System.out.println("Aluno encontrado:");
            aluno.mostrarAluno();
        } else {
            AlunoView.AlunoNaoEncontrado();
        }
    }

    public static void Remover() {
        Scanner scan = new Scanner(System.in);

        AlunoView.SolicitaMatricula();
        int matricula = scan.nextInt();

        boolean sucesso = AlunoDAO.Apagar(matricula);

        if (sucesso) {
            System.out.println("Aluno removido com sucesso");
        } else {
            AlunoView.AlunoNaoEncontrado();
        }
    }

    public static void Atualizar() {
        Scanner scan = new Scanner(System.in);

        AlunoView.SolicitaMatricula();
        int matricula = scan.nextInt();

        Aluno aluno = AlunoDAO.get(matricula);

        if (aluno != null) {
            AlunoView.Nome();
            String nome = scan.next();
            aluno.setNome(nome);

            AlunoView.Idade();
            int idade = scan.nextInt();
            aluno.setIdade(idade);

            List<Curso> cursos = CursoController.listarCursos();


            AlunoView.Curso();
            int opcao = scan.nextInt() - 1;

            Curso curso = null;
            if (opcao >= 0 && opcao < cursos.size()) {
                curso = cursos.get(opcao);
                aluno.setCurso(curso);
            } else {
                System.out.println("Opção de curso invalida");
                return;
            }
            
            System.out.println("Informações do aluno atualizadas com sucesso");
        } else {
            AlunoView.AlunoNaoEncontrado();
        }
    }

}
