package simulado.sala.s2.ex1;

import simulado.sala.s2.erro.ErroPassivo;

public enum Genero {
    ENTRETENIMENTO("ENTRETENIMENTO"),
    EDUCACAO("EDUCACAO"),
    NOTICIAS("NOTICIAS");

    private String genero;

    private Genero(String genero) {
        setGenero(genero);
    }

    public String getGenero() {
        return genero;
    }

    private void setGenero(String genero) {
        if (genero.matches("[A-Z]+")) {
            this.genero = genero;
        } else {
            throw new ErroPassivo("Gênero deve ser composto apenas por caracteres maiúsculos.");
        }
    }

    @Override
    public String toString() {
        return getGenero();
    }
}
