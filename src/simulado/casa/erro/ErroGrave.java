package simulado.casa.erro;

public class ErroGrave extends Exception {
    
    private final String mensagem;
    public ErroGrave(String mensagem) {
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
