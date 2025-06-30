package simulado.sala.s1.ex1;

public class VendasBackend {

    public static void main(String[] args) {
        Estoque biblioteca = new Estoque();

        Livro l1 = new Livro("Capitão Gancho", 1500, 0, Livro.LivroGenero.INFANTIL);
        Livro l2 = new Livro("JavaScript o terro do Mario", 2022, 20.5, Livro.LivroGenero.CONTO);
        Livro l3 = new Livro("Java do zero ao avançado", 2010, 15.5, Livro.LivroGenero.DIDATICO);
        Livro l4 = new Livro("Pequeno Principe", 1980, 12.75, Livro.LivroGenero.CONTO);

        biblioteca.adicionar(l4, 10);
        biblioteca.adicionar(l3, 8);
        biblioteca.adicionar(l2, 14);
        biblioteca.adicionar(l1, 2);

        System.out.println(biblioteca);

        Thread ponto1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("teste1 " + biblioteca.remover(l2, 10));
                System.out.println("teste1 " + biblioteca.remover(l1, 1));
                System.out.println("teste1 " + biblioteca.remover(l3, 1));
            }

        });

        Thread ponto2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("teste2 " + biblioteca.remover(l2, 1));
                System.out.println("teste2 " + biblioteca.remover(l1, 2));
                System.out.println("teste2 " + biblioteca.remover(l3, 1));
            }

        });

        Thread ponto3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("teste3 " + biblioteca.remover(l2, 1));
                System.out.println("teste3 " + biblioteca.remover(l1, 1));
                System.out.println("teste3 " + biblioteca.remover(l3, 1));
            }

        });

        ponto1.start();
        ponto2.start();
        ponto3.start();
    }
}
