package view;

import model.Curso;

import java.util.List;

public class AlunoView {

    public static void Nome() {
        System.out.println("Informe o seu nome: ");
    }

    public static void Idade() {
        System.out.println("Informe a sua idade: ");
    }

    public static void Curso(List<Curso> cursos) {
        System.out.println("Informe o seu curso: ");
        int cont = 1;
        for(Curso curso : cursos) {
            System.out.println(cont + ". " + curso);
            cont++;
        }
    }

    public static void SolicitaMatricula() {
        System.out.println("Informe a sua matricula: ");
    }


}
