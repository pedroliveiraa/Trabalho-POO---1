package dao;
import model.Curso;
import model.Disciplina;
import java.util.ArrayList;
import java.util.List;

    public class DisciplinaDAO {
        private static List <Disciplina> disciplinaList = new ArrayList<>();

        public static void Insert (Disciplina disciplina)
        {
            disciplinaList.add(disciplina); // adicionando a disciplina
        }
        
        public static List<Disciplina> getAll()
        {
            return disciplinaList;
        }

        public static Disciplina get(int codigodisciplina)
        {
            return disciplinaList.stream().findFirst().filter(a -> a.getCodigodisciplina() == codigodisciplina).get();
        }

        public static boolean Remover (int codigodisciplina)
        {
            Disciplina disciplina = get(codigodisciplina);
            if (disciplina != null)
            {
                disciplinaList.remove(disciplina);
                return true;
            }
            return false;
        }
}
