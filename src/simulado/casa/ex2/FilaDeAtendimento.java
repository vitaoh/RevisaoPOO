package simulado.casa.ex2;

import java.util.LinkedList;
import java.util.Queue;

public class FilaDeAtendimento {

    Queue<Pessoa> fila;

    public FilaDeAtendimento() {
        fila = new LinkedList<>();
    }

    public boolean adicionar(Pessoa p) {
        System.out.println("Pessoa adicionada: " + fila.offer(p));
        return true;
    }

    public boolean remover() {
        if (!fila.isEmpty()) {
            System.out.println("Pessa removida: " + fila.poll());
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return fila.toString();
    }
}
