package simulado.sala.s1.ex1;

import java.util.HashMap;
import java.util.Map;

public class Estoque {

    Map<Livro, Integer> livros;

    public Estoque() {
        livros = new HashMap<>();
    }

    public synchronized boolean adicionar(Livro livro, Integer qtdd) {
        if (qtdd >= 0) {
            livros.put(livro, qtdd);
            return true;
        } else {
            return false;
        }
    }

    public synchronized boolean remover(Livro livro, int par) {
        if (livros.containsKey(livro)) {
            int aux = livros.get(livro);

            if (aux == 0) {
                return false;
            }

            livros.put(livro, aux - 1);
        } else {
            return false;
        }
        return true;
    }

    public Map<Livro, Integer> getLivros() {
        return livros;
    }

    @Override
    public String toString() {
        return livros.toString();
    }
}
