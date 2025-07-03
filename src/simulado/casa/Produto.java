package simulado.casa;

public class Produto implements Comparable<Produto>{

    private String nome;
    private double preco;
    private String categoria;
    private int anoFabricacao;

    public Produto(String nome, double preco, CategoriaProduto categoria, int anoFabricacao) {
        setNome(nome);
        setPreco(preco);
        setCategoria(categoria);
        setAnoFabricacao(anoFabricacao);
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        if (nome != null) {
            this.nome = nome;
        } else {
            throw new ErroLeve("O nome do produto nao pode ser nulo!");
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            throw new ErroLeve("O preco nao pode ser vazio!");
        }

    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria(CategoriaProduto categoria) {
        String cat = categoria.toString();
        if (cat.matches("[A-Z]+")) {
            this.categoria = cat;
        } else {
            throw new ErroLeve("A categoria deve pertencer a um dos grupos postos!");
        }
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    private void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
    
    

    @Override
    public String toString() {
        return getNome() + " | R$"+ getPreco() + " | " + getCategoria() + " | " + getAnoFabricacao();
    }

    @Override
    public int compareTo(Produto o) {
        return getNome().compareTo(o.getNome());
    }
    
}
