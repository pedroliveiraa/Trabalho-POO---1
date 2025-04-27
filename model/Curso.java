package model;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    private int codigo;
    private String nome;
    private char turno;
    private List<Disciplina> disciplinas;

    // Construtor completo
    public Curso(int codigo, String nome, char turno, List<Disciplina> disciplinas) {
        this.codigo = codigo;
        this.nome = nome;
        this.turno = turno;
        this.disciplinas = (disciplinas != null) ? disciplinas : new ArrayList<>();
    }

    // Construtor alternativo
    public Curso(int codigo, String nome, char turno) {
        this.codigo = codigo;
        this.nome = nome;
        this.turno = turno;
        this.disciplinas = new ArrayList<>();
    }

    public int getCodigoCurso() {
        return codigo;
    }

    public void setCodigoCurso(int codigo) {
        this.codigo = codigo;
    }

    public String getNomeCurso() {
        return nome;
    }

    public void setNomeCurso(String nome) {
        this.nome = nome;
    }

    public char getTurno() {
        return turno;
    }

    public void setTurno(char turno) {
        if (turno == 'M' || turno == 'T' || turno == 'N') {
            this.turno = turno;
        } else {
            throw new IllegalArgumentException("Turno inválido! Use 'M', 'T' ou 'N'.");
        }
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        this.disciplinas.add(disciplina);
    }

    public void removerDisciplina(Disciplina disciplina) {
        this.disciplinas.remove(disciplina);
    }

    @Override
    public String toString() {
        return "Curso [Código: " + codigo + ", Nome: " + nome + ", Turno: " + turno + ", Disciplinas: " + disciplinas.size() + "]";
    }
}
