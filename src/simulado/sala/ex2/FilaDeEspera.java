package simulado.sala.ex2;

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

    public synchronized boolean remover() {
        if(!fila.isEmpty()) {
            System.out.println(fila.poll());
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return fila.toString();
    }
}
