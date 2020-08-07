package entitties;

import entities_Enum.Cores;
import entitties.exception.MovimentoInvalidoException;

public class Robo {

	/*
	 * Crie uma classe Robo que represente esse personagem contendo dois atributos
	 * representando sua posi��o no eixo cartesiano e uma cor que o identifica. Crie
	 * um construtor que recebe a cor do rob� e o inicialize na posi��o (0,0). Crie
	 * tamb�m m�todos de get e set para as posi��es
	 * 
	 */

	private Cores cor;
	private Integer eixoX = 0;
	private Integer eixoY = 0;

	public Robo(Cores cores) throws MovimentoInvalidoException {
		this.setCor(cores);
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
		return "Eixo X:" + eixoX + ", Eixo Y:" + eixoY;
	}

	/*
	 * Crie um m�todo mover, que recebe como par�metro uma String e altera a posi��o
	 * do rob� da seguinte forma: -�up� move o rob� no eixo y em uma posi��o acima.
	 * - �down� move o rob� no eixo y em uma posi��o abaixo. - �right� move o rob�
	 * no eixo x em uma posi��o para a direita. - �left� move o rob� no eixo x em
	 * uma posi��o para a esquerda. Caso o movimento fa�a com que o rob� entre numa
	 * zona negativa (x ou y menor que 0), lance a exce��o da quest�o anterior e n�o
	 * permita o movimento. Ap�s cada movimento, mostre a posi��o do rob�.
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
	public void mover(Integer num) throws MovimentoInvalidoException {

		if (num == 1) {
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
    
	public boolean alimento(Integer x, Integer y) { //posi��o do alimento

		if (x.equals(eixoX) && y.equals(eixoY)) {
			System.out.println("Achou");
			return true;
		} else {
			return false;
		}
	}

	public Cores getCor() {
		return cor;
	}

	public void setCor(Cores cor) {
		this.cor = cor;
	}

}
