public interface Celular {

    void fazerChamada(String numero);
    void enviarMensagem(String numero, String mensagem);
    void ligar();
    void desligar();
    void abrirAplicativo(String nomeAplicativo);

}
