package simulado.sala.s1.ex1;

import simulado.sala.s1.erro.ErroSimples;

public class Livro implements Comparable<Livro> {

    public enum LivroGenero {
        RELIGIOSO, CONTO, ROMANCE, DIDATICO, INFANTIL, POESIA, BIOGRAFIA, AUTOAJUDA
    };
    private String nome;
    private int ano;
    private double valor;
    private LivroGenero genero;

    public Livro(String nome, int ano, double valor, LivroGenero genero) {
        setNome(nome);
        setAno(ano);
        setValor(valor);
        setGenero(genero);
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        if (nome != null) {
            this.nome = nome;
        } else {
            throw new ErroSimples("nome não pode ser nulo");
        }
    }

    public int getAno() {
        return ano;
    }

    private void setAno(int ano) {
        if (ano >= ano) {
            this.ano = ano;
        } else {
            throw new ErroSimples("ano não pode ser negativo");
        }
    }

    public double getValor() {
        return valor;
    }

    private void setValor(double valor) {
        if (valor >= 0) {
            this.valor = valor;
        } else {
            throw new ErroSimples("valor não pode ser negativo");
        }
    }

    public LivroGenero getGenero() {
        return genero;
    }

    private void setGenero(LivroGenero genero) {
        this.genero = genero;
    }

    @Override
    public int compareTo(Livro t) {
        return getNome().compareTo(t.getNome());
    }

    @Override
    public String toString() {
        return "Livro " + nome + " feito em " + ano + " custa R$" + valor;
    }
}
