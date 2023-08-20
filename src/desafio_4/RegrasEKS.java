package desafio_4;

import java.util.Scanner;

/**
 * Regras Para Dimensionamento de Infraestrutura com EKS 
 * Autor: Thalys Henrique
 * Data: 20/08/2023 14:39 
 * LinkedIn: https://www.linkedin.com/in/thalyshenrique7/
 */

public class RegrasEKS {
	public static void main(String[] args) {
		// Definindo as regras básicas
		int podsPorNode = 10;
		int podsPorServidor = 4;

		Scanner scanner = new Scanner(System.in);

		// Recebendo as informações do usuário
		int numeroTotalPods = scanner.nextInt();

		// Calcula o número mínimo de nodes necessários
		int numeroMinimoNodes = (int) ((int) Math.round((double) numeroTotalPods / podsPorNode));

		// Calcula o número mínimo de servidores necessários
		int numeroMinimoServidores = (int) ((int) Math.round((double) numeroTotalPods / podsPorServidor));

		// Exibe o resultado com as recomendações de quantidades de servidores e nodes

		if (numeroMinimoNodes <= 1) {
			System.out.println("1.Recomendamos usar um unico node");
		} else {
			System.out.println("1.Numero minimo de nodes:" + numeroMinimoNodes);
		}

		if (numeroMinimoServidores <= 1) {
			System.out.println("2.Recomendamos usar um unico servidor");
		} else {
			System.out.println("2.Numero minimo de servidores:" + numeroMinimoServidores);
		}

		scanner.close();
	}
}
