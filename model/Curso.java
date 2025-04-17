package model;

import java.util.List;

public class Curso {

    private int codigo;
    private String nome;
    private char turno;
    private List<Disciplina> disciplinas;

    public Curso(int codigo, String nome, char turno, List<Disciplina> disciplinas) {
        this.codigo = codigo;
        this.nome = nome;
        this.turno = turno;
        this.disciplinas = disciplinas;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getTurno() {
        return turno;
    }

    public void setTurno(char turno) {
        this.turno = turno;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
}
