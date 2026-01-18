package exercicio05;

public class App {
	public static void main(String[] args) {
		
		Varinha varinha = new Varinha();

		LancarMagia lancandoMagia = () -> System.out.println("Magia lançada!");
		varinha.usar(lancandoMagia);

		varinha.usar(() -> System.out.println("Magia lançada!"));
		
		varinha.usar(() -> {
			System.out.println("Magia lançada!");
		});
		
	}
}
