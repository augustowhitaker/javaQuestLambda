package exercicio09;

import exercicio09.Acao.AcaoCancelar;
import exercicio09.Acao.AcaoExecutar;

public class App {
	public static void main(String[] args) {
		
		 AcaoExecutar acaoExecutar = () -> System.out.println("Ação Executada!");

		 AcaoCancelar acaoCancelar = () -> System.out.println("Ação Cancelada!");

		 acaoExecutar.executar();
		 acaoCancelar.cancelar();

	}
}
