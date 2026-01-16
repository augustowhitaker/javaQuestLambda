package exercicio04;

public class App {
    public static void main(String[] args) {
        
        EmitirSom somDeGato = () -> System.out.println("Miau ");

        Botao botao = new Botao();

        botao.apertar(somDeGato);

    }
}
