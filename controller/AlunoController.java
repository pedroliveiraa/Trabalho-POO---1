package controller;

import dao.AlunoDAO;
import java.util.Scanner;
import model.Aluno;
import view.AlunoView;

public class AlunoController {

    static int matricula = 0;

    public static void Cadastrar() {

        Scanner scan = new Scanner(System.in);

        AlunoView.Nome();
        String nome = scan.next();

        AlunoView.Idade();
        int idade  = scan.nextInt();

        AlunoView.Curso(null);
        int opcao = scan.nextInt();

        Aluno aluno = new Aluno(NewMatricula(), nome, idade, null);
        AlunoDAO.insert(aluno);

    }

    public static void Consultar() {

        Scanner scan = new Scanner(System.in);

        AlunoView.SolicitaMatricula();
        int matricula = scan.nextInt();

        AlunoDAO.get(matricula);
    }

    public static void Remover() {
        Scanner scan = new Scanner(System.in);

        AlunoView.SolicitaMatricula();
        int matricula = scan.nextInt();

        boolean sucesso = AlunoDAO.Apagar(matricula);

        if (sucesso) {
            System.out.println("Aluno removido com sucesso");
        } else {
            System.out.println("Aluno não encontrado");
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

            // vou precisar de um metodo para atualizar o curso, mas tenho que esperar o sorrizo fazer

            System.out.println("Informações do aluno atualizadas com sucesso!");
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }

    public static int NewMatricula() {
        return ++matricula;
    }

}
