package simulado.sala.s2.ex1;

import simulado.sala.s2.erro.ErroPassivo;

public class Video implements Comparable<Video> {

    private String titulo;
    private int classificacao;
    private Genero genero;

    public Video(String titulo, int classificacao, Genero genero) {
        setTitulo(titulo);
        setClassificacao(classificacao);
        setGenero(genero);
    }

    public String getTitulo() {
        return titulo;
    }

    private void setTitulo(String titulo) {
        if (titulo.trim().isEmpty() || titulo == null) {
            throw new ErroPassivo("O titulo não pode ser vazio!");
        } else {
            this.titulo = titulo;
        }
    }

    public int getClassificacao() {
        return classificacao;
    }

    private void setClassificacao(int classificacao) {
        if (classificacao >= 0) {
            this.classificacao = classificacao;
        } else {
            throw new ErroPassivo("A classificação precisa ser positiva!");
        }
    }

    public Genero getGenero() {
        return genero;
    }

    private void setGenero(Genero genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Video: " + titulo + " / +" + classificacao + " / " + genero;
    }

    @Override
    public int compareTo(Video v) {
        if (getClassificacao() == v.getClassificacao()) {
            return 0;
        } else {
            if (getClassificacao() > v.getClassificacao()) {
                return 1;
            } else {
                return -1;
            }
        }
    }
}
