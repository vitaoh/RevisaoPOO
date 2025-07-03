package simulado.sala.s2.ex2;

import java.util.LinkedList;
import java.util.Queue;

public class FilaDeEspera {
    
    private Queue<Pessoa> fila;

    public FilaDeEspera() {
        fila = new LinkedList<>();
    }
    
    public boolean adicionar(Pessoa pessoa) {
        if( fila.contains(pessoa) ) {
            return false;
        } else {
            fila.offer(pessoa);
            return true;
        }
    }
    
    public synchronized boolean remover() {
        if( fila.isEmpty() == false ) {
            System.out.println( fila.poll() );
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return fila.toString();
    }
    
}
