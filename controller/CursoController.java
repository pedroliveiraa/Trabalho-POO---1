package controller;
import dao.CursoDAO;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.Curso;
import model.Disciplina;
import view.CursoView;

public class CursoController {

    // Método 1 - Cadastrar Curso
    public static void cadastrarCurso() {
        Scanner scanner = new Scanner(System.in);
    
        // Solicitar o código do curso
        CursoView.SolicitaCodigo();
        int codigo = scanner.nextInt();
        scanner.nextLine(); // Limpar buffer
    
        // Verificar se o código já existe
        if (CursoDAO.get(codigo) != null) {
            CursoView.CursoJaCadastrado();
            return;
        }
    
        // Solicitar o nome do curso
        CursoView.NomeCurso();
        String nome = scanner.nextLine(); // Alterado para nextLine()
    
        // Solicitar o turno do curso
        CursoView.Turno();
        char turno = scanner.nextLine().charAt(0); // Alterado para nextLine()
    
        // Listar disciplinas disponíveis
        List<Disciplina> disciplinas = DisciplinaController.listarDisciplinas();
        if (disciplinas.isEmpty()) {
            CursoView.DisciplinasVazias(); // Nome consistente com a View
            return;
        }
    
        // Solicitar a escolha de uma disciplina
        CursoView.Disciplinas();
        int opcao = scanner.nextInt() - 1;
        scanner.nextLine(); // Limpar buffer
    
        if (opcao < 0 || opcao >= disciplinas.size()) {
            CursoView.DisciplinasNaoEncontradas(); // Nome consistente com a View
            return;
        }
    
        // Criar e salvar o curso
        Disciplina disciplinaSelecionada = disciplinas.get(opcao);
        Curso curso = new Curso(codigo, nome, turno);
        curso.adicionarDisciplina(disciplinaSelecionada);
        
        CursoDAO.insert(curso);
        CursoView.CursoCadastrado();
    }

    // Método 2 - Consultar Curso
    public static void consultarCurso() {
        Scanner scanner = new Scanner(System.in);

        CursoView.SolicitaCodigo();
        int codigo = scanner.nextInt();

        Curso curso = CursoDAO.get(codigo);
        if (curso != null) {
            System.out.println(curso);
        } else {
            CursoView.CursoNaoEncontrado();
        }
    }

    // Método 3 - Remover Curso
    public static void removerCurso() {
        Scanner scanner = new Scanner(System.in);

        CursoView.SolicitaCodigo();
        int codigo = scanner.nextInt();

        if (CursoDAO.remover(codigo)) {
            CursoView.CursoRemovido(); // Exibindo mensagem de sucesso
        } else {
            CursoView.CursoNaoEncontrado(); // Exibindo mensagem de erro
        }
    }

    // Método 4 - Atualizar Curso
    public static void atualizarCurso() {
        Scanner scanner = new Scanner(System.in);

        CursoView.SolicitaCodigo();
        int codigo = scanner.nextInt();

        Curso curso = CursoDAO.get(codigo);
        if (curso == null) {
            CursoView.CursoNaoEncontrado();
            return;
        }

        CursoView.NomeCurso();
        curso.setNomeCurso(scanner.next());

        CursoView.CursoAtualizado();
    }

    // Método para listar todos os cursos
    public static List<Curso> listarCursos() {
        List<Curso> cursos = CursoDAO.getAll();

        if (cursos.isEmpty()) {
            CursoView.CursoNaoEncontrado(); // Exibindo mensagem de erro
            return new ArrayList<>(); // retorna uma lista vazia, não null
        }

        CursoView.ListaCursos(); // Exibindo mensagem de sucesso
        for (Curso curso : cursos) {
            System.out.println(curso);
        }

        return cursos; // <- AGORA SIM
    }
}
