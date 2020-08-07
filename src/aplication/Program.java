package aplication;

import java.util.Scanner;

import entities_Enum.Cores;
import entitties.Robo;
import entitties.exception.MovimentoInvalidoException;

public class Program {

	/*
	 * Crie uma classe Main que instancie um robô, peça ao usuário para determinar a
	 * posição do alimento, e peça ao usuário para ficar movendo o robô até ele
	 * encontrar o alimento – não esqueça de tratar a exceção.
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

			System.out.println("Faça os movimentos");
			while (r.alimento(x, y) == false) {
				Integer movimento = sc.nextInt();
				r.mover(movimento);
				System.out.println(r);
			}

		} catch (MovimentoInvalidoException e) {
			e.getMessage();
		} catch (IllegalArgumentException e) {
			System.out.println("Cor não Consta no enumerados");
		}

		sc.close();
	}

}
