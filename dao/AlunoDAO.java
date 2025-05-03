package dao;

import model.Aluno;

import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {

    private static List<Aluno> alunoList = new ArrayList<>();

    public static void insert(Aluno aluno) {
        alunoList.add(aluno);
    }
    public static List<Aluno> getAll() {
        return alunoList;
    }

    public static Aluno get(int matricula) {
        //return alunoList.stream().findFirst().filter(a -> a.getMatricula() == matricula).get();
        //return alunoList.get(matricula);
        return alunoList.stream()
        .filter(a -> a.getMatricula() == matricula)
        .findFirst()
        .orElse(null);
    }

    public static boolean Apagar(int matricula) {
        Aluno aluno = get(matricula);
        if (aluno != null) {
            alunoList.remove(aluno);
            return true;
        }
        return false;
    }

    
}
