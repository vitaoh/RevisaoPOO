package simulado.sala.s1.ex1;

import java.util.Map;

public class DivulgaLivros {

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

        System.out.println("Livros em ordem alfabetica");

        biblioteca.getLivros()
                .keySet()
                .stream()
                .sorted()
                .forEach((l) -> System.out.println(l));

        System.out.println("");

        System.out.println("Livros lançados nos ultimos 5 anos");

        biblioteca.getLivros()
                .keySet()
                .stream()
                .sorted()
                .filter((l) -> l.getAno() >= 2021)
                .forEach(System.out::println);

        System.out.println("");

        System.out.println("Livros que tenham a palavra Java");

        biblioteca.getLivros()
                .keySet()
                .stream()
                .sorted()
                .filter((l) -> l.getNome().contains("Java")) // matches(".*Java.*")
                .forEach(System.out::println);
    }
}
