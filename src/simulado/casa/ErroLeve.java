package simulado.casa;

public class ErroLeve extends RuntimeException {

    private final String mensagem;
    public ErroLeve(String mensagem) {
        super(mensagem);
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }

    @Override
    public String toString() {
        return getMensagem();
    }
}
