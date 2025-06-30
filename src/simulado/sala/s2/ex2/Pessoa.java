package simulado.sala.s2.ex2;

import simulado.sala.s2.erro.ErroPassivo;

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

    public void setNome(String nome) {
        if(nome != null) {
            this.nome = nome;
        } else throw new ErroPassivo("O nome não pode ser vazio!");
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if(cpf != null) {
            if(cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}")) {
                this.cpf = cpf;
            } else throw new ErroPassivo("O cpf está incorreto!");
        } else throw new ErroPassivo("O cpf não pode ser vazio!");
    }

    @Override
    public String toString() {
        return getNome() + " (" + getCpf() + ")";
    }
}
