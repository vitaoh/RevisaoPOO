package simulado.sala.s2.ex2;

public class AtendimentoBanco {

    public static void main(String[] args) {

        FilaDeEspera fila = new FilaDeEspera();

        Thread pp1 = new Thread(() -> {
            try {
                fila.adicionar(new Pessoa("Jorge", "123.456.789-00"));
                Thread.sleep(1500);

                fila.adicionar(new Pessoa("Mateus", "123.456.789-01"));
                Thread.sleep(1500);

                fila.adicionar(new Pessoa("Lucas", "123.456.789-02"));
                Thread.sleep(1500);

                fila.adicionar(new Pessoa("Tiago", "123.456.789-03"));
                Thread.sleep(1500);

                fila.adicionar(new Pessoa("Roberto", "123.456.789-04"));
                Thread.sleep(1500);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });

        Thread pp2 = new Thread(() -> {
            try {
                while (true) {
                    Thread.sleep(500);
                    fila.remover();
                    System.out.println(fila);
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });

        Thread pp3 = new Thread(() -> {
            try {
                while (true) {
                    Thread.sleep(500);
                    fila.remover();
                    System.out.println(fila);
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });

        Thread pp4 = new Thread(() -> {
            try {
                while (true) {
                    Thread.sleep(500);
                    fila.remover();
                    System.out.println(fila);
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });

        pp1.start();
        pp2.start();
        pp3.start();
        pp4.start();
    }
}
