package entitties;

import entities_Enum.Cores;
import entitties.exception.MovimentoInvalidoException;

public class Robo {

	/*
	 * Crie uma classe Robo que represente esse personagem contendo dois atributos
	 * representando sua posição no eixo cartesiano e uma cor que o identifica. Crie
	 * um construtor que recebe a cor do robô e o inicialize na posição (0,0). Crie
	 * também métodos de get e set para as posições
	 * 
	 */

	private Cores cor;
	private Integer eixoX = 0;
	private Integer eixoY = 0;
	private int movimentos;

	public Robo(Cores cores) throws MovimentoInvalidoException {
		if(cor !=null) {
			throw new MovimentoInvalidoException("Não existe cor ao personagem");
		}
		this.cor = cores;
	}

	public Integer getEixoX() {
		return eixoX;
	}

	public void setEixoX(Integer eixoX) {
		this.eixoX = eixoX;
	}

	public Integer getEixoY() {
		return eixoY;
	}

	public void setEixoY(Integer eixoY) {
		this.eixoY = eixoY;
	}

	@Override
	public String toString() { 
		return "Cor: "+ this.cor+", Total: "+this.movimentos;
	}

	/*
	 * Crie um método mover, que recebe como parâmetro uma String e altera a posição
	 * do robô da seguinte forma: -“up” move o robô no eixo y em uma posição acima.
	 * - “down” move o robô no eixo y em uma posição abaixo. - “right” move o robô
	 * no eixo x em uma posição para a direita. - “left” move o robô no eixo x em
	 * uma posição para a esquerda. Caso o movimento faça com que o robô entre numa
	 * zona negativa (x ou y menor que 0), lance a exceção da questão anterior e não
	 * permita o movimento. Após cada movimento, mostre a posição do robô.
	 * 
	 */

	public void mover(String arg) throws MovimentoInvalidoException {

		if (arg.equalsIgnoreCase("up")) {
			eixoY += 1;
		} else if (arg.equalsIgnoreCase("down")) {
			eixoY -= 1;
		} else if (arg.equalsIgnoreCase("rigth")) {
			eixoX += 1;
		} else if (arg.equalsIgnoreCase("down")) {
			eixoX -= 1;
		} else if (eixoX < 0 || eixoY < 0) {
			throw new MovimentoInvalidoException("Erro: Personagem na zona negativa");
		}

	}
	
	//Sobre carga do metodo mover
	public void mover(Integer num ) throws MovimentoInvalidoException {
		
		if (num  == 1) {
			eixoY += 1;
		} else if (num == 2) {
			eixoY -= 1;
		} else if (num == 3) {
			eixoX += 1;
		} else if (num == 4) {
			eixoX -= 1;
		} else if (eixoX < 0 || eixoY < 0) {
			 throw new MovimentoInvalidoException("Erro: Personagem na zona negativa");
		}

	}
    
	public boolean alimento(Integer x, Integer y) { //posição do alimento

		if (x.equals(eixoX) && y.equals(eixoY)) {
			System.out.println( toString());
			return true;
		} else {
			return false;
		}
	}
	
	public void soma(int n) {
		this.movimentos += n;
	}
	
	public Integer getMovimento() {
		return movimentos;
	}

}
