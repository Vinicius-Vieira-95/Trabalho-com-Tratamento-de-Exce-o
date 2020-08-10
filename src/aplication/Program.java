package aplication;

import java.util.Random;
import java.util.Scanner;

import entities_Enum.Cores;
import entitties.Robo;
import entitties.exception.MovimentoInvalidoException;

public class Program {

	/*
	 * Crie outra classe Main que instancie dois robôs, peça ao usuário para entrar
	 * com a posição do alimento, e faça os dois robôs se moverem randomicamente, um
	 * de cada vez, até que um deles encontre o alimento. Ao final, mostre quem
	 * achou o alimento e o número de movimentos que cada robô fez.
	 */

	public static void main(String[] args) {

		Random num = new Random();
		Scanner sc = new Scanner(System.in);

		Integer [][] matriz = new Integer [5][5];

		try {

			System.out.println("Ecolha a cor do 1º Personagem");
			Cores cor = Cores.valueOf(sc.nextLine());
			Robo r1 = new Robo(cor);
				
			System.out.println("Ecolha a cor do 2º Personagem");
			cor = Cores.valueOf(sc.nextLine());
			Robo r2 = new Robo(cor);	
			
			System.out.println("Posicione o alimento");
			Integer x = sc.nextInt();
			Integer y = sc.nextInt();

			Integer n1 = 0;
			boolean flag = false;
			
			while (flag == false) {
				
				n1 = num.nextInt(4)+1;
				r1.mover(n1);
				
				n1 = num.nextInt(4)+1;
				r2.mover(n1);
				
				for(int i =0 ;i < matriz.length ; i++) {
					for(int j = 0; j < matriz[i].length ; j++) {
						
						if(r2.alimento(x, y) == true) {
							System.out.println("ACHOU!!!");
							System.out.println("Posição: "+i+","+j);
							flag = true;
						}
						else if(r1.alimento(x, y) == true) {
							System.out.println("ACHOU!!!");
							System.out.println("Posição: "+i+","+j);
							flag = true;
						}
					}
				}
				
			}

			System.out.println(r1);
			System.out.println(r2);
			
		} catch (MovimentoInvalidoException e) {
			System.out.println("Deu erro!!");
			e.getMessage();
		} catch (IllegalArgumentException e) {
			System.out.println("Cor não Consta no enumerados");
		}

		sc.close();
	}

}
