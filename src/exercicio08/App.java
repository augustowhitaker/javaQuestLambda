package exercicio08;

public class App {
	public static void main(String[] args) {
		
		GerarMensagem nome = (tst ->  "ola" + tst);

		System.out.println(nome.gerar(" Augusto"));

		Mensageiro mensagem = new Mensageiro();

		mensagem.enviar(nome);

		mensagem.enviar(nomeDev -> "Ola " + nomeDev);
		mensagem.enviar(nomeDev -> {
			return "Olá " + nomeDev;
		});
	}
}