public class Curso {
    private int codigocurso;
    private String nomecurso;
    private String turno;

    public int getCodigocurso() {
        return codigocurso;
    }

    public void setCodigocurso(int codigocurso) {
        this.codigocurso = codigocurso;
    }

    public String getNomecurso() {
        return nomecurso;
    }

    public void setNomecurso(String nomecurso) {
        this.nomecurso = nomecurso;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public Curso(int codigocurso, String nomecurso, String turno) {
        this.codigocurso = codigocurso;
        this.nomecurso = nomecurso;
        this.turno = turno;
    }
}
