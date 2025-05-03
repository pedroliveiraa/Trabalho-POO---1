package controller;
import dao.CursoDAO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.Curso;

public class CursoController {

    // Método 1 - Cadastrar Curso
    public static void cadastrarCurso() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o código do curso: ");
        int codigo = scanner.nextInt();

        // Verificar se o código já existe
        if (CursoDAO.get(codigo) != null) {
            System.out.println("Código já cadastrado!");
            return;
        }

        System.out.print("Informe o nome do curso: ");
        String nome = scanner.next();
        System.out.print("Informe o turno do curso (M/T/N): ");
        char turno = scanner.next().charAt(0);
        Curso curso = new Curso(codigo, nome, turno); // Criando o curso com turno 'M' como padrão
        CursoDAO.insert(curso); // Usando o DAO para salvar o curso
        System.out.println("Curso cadastrado com sucesso!");
    }

    // Método 2 - Consultar Curso
    public static void consultarCurso() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o código do curso a ser consultado: ");
        int codigo = scanner.nextInt();

        Curso curso = CursoDAO.get(codigo);
        if (curso != null) {
            System.out.println(curso);
        } else {
            System.out.println("Curso não encontrado!");
        }
    }

    // Método 3 - Remover Curso
    public static void removerCurso() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o código do curso a ser removido: ");
        int codigo = scanner.nextInt();

        if (CursoDAO.remover(codigo)) {
            System.out.println("Curso removido com sucesso!");
        } else {
            System.out.println("Curso não encontrado!");
        }
    }

    // Método 4 - Atualizar Curso
    public static void atualizarCurso() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o código do curso a ser atualizado: ");
        int codigo = scanner.nextInt();

        Curso curso = CursoDAO.get(codigo);
        if (curso == null) {
            System.out.println("Curso não encontrado!");
            return;
        }

        System.out.print("Informe o novo nome do curso: ");
        curso.setNomeCurso(scanner.next());

        System.out.println("Curso atualizado com sucesso!");
    }

    // Método para listar todos os cursos
    public static List<Curso> listarCursos() {
        List<Curso> cursos = CursoDAO.getAll();

        if (cursos.isEmpty()) {
            System.out.println("Nenhum curso cadastrado!");
            return new ArrayList<>(); // retorna uma lista vazia, não null
        }

        System.out.println("Lista de cursos cadastrados:");
        for (Curso curso : cursos) {
            System.out.println(curso);
        }

        return cursos; // <- AGORA SIM
    }
}
