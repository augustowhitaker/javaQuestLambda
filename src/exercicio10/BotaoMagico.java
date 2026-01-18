package exercicio10;

public class BotaoMagico {

	 private CliqueListener listener;

   
    public void adicionarCliqueListener(CliqueListener listener) {
        this.listener = listener;
    }

    
    public void clicar() {
        EventoClique evento = new EventoClique("Botao Magico");
        if (listener != null) {
            listener.aoClicar(evento);
        }
    }
}
