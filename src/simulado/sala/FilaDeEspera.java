package simulado.sala;

import java.util.LinkedList;
import java.util.Queue;

public class FilaDeEspera {

    Queue<Pessoa> fila;

    public FilaDeEspera() {
        fila = new LinkedList<>();
    }

    public boolean adicionar(Pessoa p) {
        if (fila.contains(p)) {
            return false;
        }
        return fila.offer(p);
    }

    public boolean remover(Pessoa p) {
        if(fila.isEmpty() == false) {
            System.out.println(fila.poll());
            return true;
        }
        return false; // 111111111111111111111
    }

}
