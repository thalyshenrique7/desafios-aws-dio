package desafio_3;

import java.util.Scanner;

/**
 * Calculando Custos na AWS 
 * Autor: Thalys Henrique 
 * Data: 20/08/2023 14:16
 * LinkedIn: https://www.linkedin.com/in/thalyshenrique7/
 */

public class CalculandoCustosAWS {
	public static void main(String[] args) {

		// Definindo as taxas
		double custoPorHoraServidor = 0.15;
		double custoPorHoraBancoDados = 0.05;

		Scanner scanner = new Scanner(System.in);

		// Recebe as informações do usuário
		int quantidadeServidores = scanner.nextInt();

		int quantidadeBancosDados = scanner.nextInt();

		// Calcula os custos
		
		double custoTotal = (quantidadeServidores * custoPorHoraServidor) + (quantidadeBancosDados * custoPorHoraBancoDados);

		System.out.printf("Custo total de uso da AWS por hora: R$ %.2f%n", custoTotal);

		scanner.close();
	}
}
