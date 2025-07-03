package simulado.casa.ex2;

import simulado.casa.erro.ErroLeve;

public class Pessoa {

    private String nome;
    private String cpf;

    public Pessoa(String nome, String cpf) {
        setNome(nome);
        setCpf(cpf);
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        if (nome != null) {
            this.nome = nome;
        }
    }

    public String getCpf() {
        return cpf;
    }

    private void setCpf(String cpf) {
        if (cpf != null && cpf.matches("\\d{3}.\\d{3}.\\d{3}-\\d{2}")) {
            this.cpf = cpf;
        } else {
            throw new ErroLeve("O cpf esta incorreto");
        }
    }

    @Override
    public String toString() {
        return getNome() + " (" + getCpf() + ")";
    }
}
