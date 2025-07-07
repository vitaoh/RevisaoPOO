package prova.aq3028968;

import java.util.ArrayList;
import java.util.List;

public class NumeroInteiroPositivo implements Comparable<NumeroInteiroPositivo> {

    private int valor;
    private List<Integer> divisores;
    private boolean abundante;
    private Tipo tipo;

    public NumeroInteiroPositivo(int valor) {
        setValor(valor);
    }

    public int getValor() {
        return valor;
    }

    public synchronized void setValor(int valor) {
        if (valor > 0) {
            this.valor = valor;
            setTipo(valor);
            setDivisores(valor);
            setAbundante(valor);
        } else {
            throw new RuntimeException("O valor não pode ser inferior a 0!");
        }

    }

    public List getDivisores() {
        return divisores;
    }

    private void setDivisores(int valor) {
        divisores = new ArrayList<>();
        for (int i = 1; i < valor; i++) {
            if (valor % i == 0) {
                divisores.add(i);
            }
        }
    }

    public boolean isAbundante() {
        return abundante;
    }

    private void setAbundante(int valor) {
        int soma = 0;
        for (int i = 0; i < divisores.size(); i++) {
            soma += divisores.get(i);
        }
        this.abundante = (soma > valor);
    }

    public Tipo getTipo() {
        return tipo;
    }

    private void setTipo(int valor) {
        this.tipo = (valor % 2 == 0) ? Tipo.PAR : Tipo.IMPAR;
    }

    @Override
    public int compareTo(NumeroInteiroPositivo o) {
        if (getValor() == o.getValor()) {
            return 0;
        } else {
            if (getValor() > o.getValor()) {
                return 1;
            } else {
                return -1;
            }
        }
    }

    @Override
    public String toString() {
        return "(" + getValor() + ")";
    }

}
