package view;

import model.Curso;
import model.Aluno;

import java.util.List;

public class AlunoView {

    public static void Nome() {
        System.out.println("Informe o seu nome: ");
    }

    public static void Idade() {
        System.out.println("Informe a sua idade: ");
    }

    public static void Curso() {
        System.out.println("Informe o codigo do curso: ");
    }

    public static void SolicitaMatricula() {
        System.out.println("Informe a sua matricula: ");
    }

    public static void AlunoCadastrado() {
        System.out.println("Aluno cadastrado");
    }

    public static void AlunoNaoEncontrado() {
        System.out.println("Aluno não encontrado");
    }


}
