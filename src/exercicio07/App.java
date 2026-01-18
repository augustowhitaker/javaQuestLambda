package exercicio07;

public class App {
	 public static void main(String[] args) {
		

		CaixaDeSom heiSom = new CaixaDeSom();

		heiSom.reproduzir((teste, volume) -> {
			System.out.println("Som:"+teste + "|" + "Volume:" + volume);
			//System.out.println(volume);
		});
	 }
}
