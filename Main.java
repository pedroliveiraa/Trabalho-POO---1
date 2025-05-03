import java.util.ArrayList;
import java.util.List;

import controller.*;
import dao.*;
import model.*;
import view.*;
import view.MenuView;

public class Main {
    public static void main(String[] args) {

        Disciplina d1 = new Disciplina(101, "Matemática", 60);
        Disciplina d2 = new Disciplina(102, "Português", 45);
        Disciplina d3 = new Disciplina(103, "Informática", 80);

        List<Disciplina> listaCurso1 = new ArrayList<>();
        listaCurso1.add(d1);
        listaCurso1.add(d2);

        List<Disciplina> listaCurso2 = new ArrayList<>();
        listaCurso2.add(d2);
        listaCurso2.add(d3);

        List<Disciplina> listaCurso3 = new ArrayList<>();
        listaCurso3.add(d1);
        listaCurso3.add(d3);

        Curso c1 = new Curso(1, "Engenharia", 'M', listaCurso1);
        Curso c2 = new Curso(2, "Letras", 'T', listaCurso2);
        Curso c3 = new Curso(3, "Ciência da Computação", 'N', listaCurso3);
        CursoDAO.insert(c1);
        CursoDAO.insert(c2);
        CursoDAO.insert(c3);


        MenuController.GerenciaMenu();
        
    }
}