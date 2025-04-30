package dao;
import java.util.ArrayList;
import java.util.List;
import model.Curso;

public class CursoDAO {
    private static List<Curso> cursos = new ArrayList<>();

    public static void insert(Curso curso) {
        cursos.add(curso);
    }

    public static List<Curso> getAll() {
        return cursos;
    }

    public static Curso get(int codigo) {
        for (Curso curso : cursos) {
            if (curso.getCodigoCurso() == codigo) {
                return curso;
            }
        }
        return null;
    }

    public static boolean remover(int codigo) {
        Curso curso = get(codigo);
        if (curso != null) {
            cursos.remove(curso);
            return true;
        }
        return false;
    }
}
