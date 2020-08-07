package entitties.exception;

public class MovimentoInvalidoException extends Exception {

	private static final long serialVersionUID = 1L;
	
	/*
	 * Crie uma exceção chamada MovimentoInvalidoException que  
	 * informe na mensagem qual movimento foi inválido 
	 * 
	 */

	public MovimentoInvalidoException(String msg) {
		super(msg);
	}

	public void Invalido() {
		System.out.println("Erro: Zona Negativa");
	}

}
