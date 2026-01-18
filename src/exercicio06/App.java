package exercicio06;

public class App {
	public static void main(String[] args) {
		
		Microfone microfone = new Microfone();

		microfone.ouvir((texto) -> System.out.println("Microfone recebeu " + texto));
	}
}
