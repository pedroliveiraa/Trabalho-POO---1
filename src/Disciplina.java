public class Disciplina {
    private int codigodisciplina;
    private String nomedisciplina;
    private double cargahoraria;

    public int getCodigodisciplina() {
        return codigodisciplina;
    }

    public void setCodigodisciplina(int codigodisciplina) {
        this.codigodisciplina = codigodisciplina;
    }

    public String getNomedisciplina() {
        return nomedisciplina;
    }

    public void setNomedisciplina(String nomedisciplina) {
        this.nomedisciplina = nomedisciplina;
    }

    public double getCargahoraria() {
        return cargahoraria;
    }

    public void setCargahoraria(double cargahoraria) {
        this.cargahoraria = cargahoraria;
    }

    public Disciplina(int codigodisciplina, String nomedisciplina, double cargahoraria) {
        this.codigodisciplina = codigodisciplina;
        this.nomedisciplina = nomedisciplina;
        this.cargahoraria = cargahoraria;
    }

}
