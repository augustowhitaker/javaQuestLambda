package exercicio08;

public class Mensageiro {

	public void enviar(GerarMensagem gerador){
		String mensagemGerada = gerador.gerar("Augusto");

		System.out.println("Mensagem gerada: " + mensagemGerada);

	}
}
