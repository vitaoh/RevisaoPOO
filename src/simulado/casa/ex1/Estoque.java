package simulado.casa.ex1;

import java.util.HashMap;
import java.util.Map;

public class Estoque {

    Map<Produto, Integer> armazem;

    public Estoque() {
        armazem = new HashMap<>();
    }

    public boolean adicionarQuantidade(Produto p, int i) {
        if (armazem.containsKey(p)) {
            int q = armazem.get(p);
            armazem.put(p, q + i);
            return true;
        } else {
            armazem.put(p, i);
            return true;
        }
    }

    public boolean removerQuantidade(Produto p, int i) {
        if (armazem.containsKey(p)) {
            int q = armazem.get(p);
            if (i >= q) {
                armazem.remove(p);
            } else {
                armazem.put(p, q - i);
            }
            return true;
        } else {
            return false;
        }
    }

    public Map<Produto, Integer> getArmazem() {
        return armazem;
    }
    
}
