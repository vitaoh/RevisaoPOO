package simulado.casa.ex2;

public class SimuladorBanco {
    public static void main(String[] args) {
        
        FilaDeAtendimento fila = new FilaDeAtendimento();
        
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    fila.adicionar(new Pessoa("Carlos", "123.456.789-01"));
                    Thread.sleep(500);
                    fila.adicionar(new Pessoa("Joao", "123.456.789-02"));
                    Thread.sleep(500);
                    fila.adicionar(new Pessoa("Roberto", "123.456.789-03"));
                    Thread.sleep(500);
                    fila.adicionar(new Pessoa("Lucas", "123.456.789-04"));
                    Thread.sleep(500);
                    fila.adicionar(new Pessoa("Mario", "123.456.789-05"));
                    Thread.sleep(500);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {                    
                    try {
                        Thread.sleep(1500);
                        fila.remover();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });
        
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {                    
                    try {
                        Thread.sleep(1500);
                        fila.remover();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });
        
        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {                    
                    try {
                        Thread.sleep(1500);
                        fila.remover();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
