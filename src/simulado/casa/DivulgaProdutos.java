package simulado.casa;

import java.util.Map;

public class DivulgaProdutos {

    public static void main(String[] args) {

        Produto p1 = new Produto("COCA", 5, CategoriaProduto.BEBIDA, 2024);
        Produto p2 = new Produto("COCA-ZERO", 4.5, CategoriaProduto.BEBIDA, 2023);
        Produto p3 = new Produto("ARROZ", 5, CategoriaProduto.ALIMENTO, 2024);
        Produto p4 = new Produto("OMO", 5, CategoriaProduto.LIMPEZA, 2022);
        Produto p5 = new Produto("TOALHA", 5, CategoriaProduto.HIGIENE, 2021);

        Estoque e = new Estoque();

        e.adicionarQuantidade(p1, 5);
        e.adicionarQuantidade(p1, 5);
        e.adicionarQuantidade(p1, 3);
        e.adicionarQuantidade(p2, 13);
        e.adicionarQuantidade(p3, 12);
        e.adicionarQuantidade(p4, 3);
        e.adicionarQuantidade(p5, 3);

        e.armazem.entrySet().stream()
                .forEach(entry
                        -> System.out.println(entry.getKey() + " --- " + entry.getValue())
                );

        System.out.println();
        
        // 1 
e.armazem
    .entrySet()
    .stream()
    .sorted(Map.Entry.comparingByKey()) // ordena pelas chaves (Produto)
    .forEach(entry -> System.out.println(entry.getKey() + " --- " + entry.getValue()));
    }
}
