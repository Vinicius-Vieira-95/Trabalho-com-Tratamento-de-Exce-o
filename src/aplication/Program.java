package aplication;

import java.util.Scanner;

import entities_Enum.Cores;
import entitties.Robo;
import entitties.exception.MovimentoInvalidoException;

public class Program {

	/*
	 * Crie uma classe Main que instancie um rob�, pe�a ao usu�rio para determinar a
	 * posi��o do alimento, e pe�a ao usu�rio para ficar movendo o rob� at� ele
	 * encontrar o alimento � n�o esque�a de tratar a exce��o.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {

			System.out.println("Ecolha a cor do Personagem");
			Cores cor = Cores.valueOf(sc.nextLine());
			Robo r = new Robo(cor);

			System.out.println("Posicione o alimento");
			Integer x = sc.nextInt();
			Integer y = sc.nextInt();

			System.out.println("Fa�a os movimentos");
			while (r.alimento(x, y) == false) {
				Integer movimento = sc.nextInt();
				r.mover(movimento);
				System.out.println(r);
			}

		} catch (MovimentoInvalidoException e) {
			e.getMessage();
		} catch (IllegalArgumentException e) {
			System.out.println("Cor n�o Consta no enumerados");
		}

		sc.close();
	}

}
