package exercicio09;


public interface Acao {

@FunctionalInterface
public interface AcaoExecutar {
    void executar();
}

@FunctionalInterface
public interface AcaoCancelar {
    void cancelar();
	
	}


}
