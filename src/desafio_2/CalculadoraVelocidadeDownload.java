package desafio_2;

import java.util.Scanner;

/**
 * Velocidade de Download na AWS 
 * Autor: Thalys Henrique 
 * Data: 20/08/2023 14:06
 * LinkedIn: https://www.linkedin.com/in/thalyshenrique7/
 */

public class CalculadoraVelocidadeDownload {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		// Solicitar a entrada do usuário para a distância física e a velocidade do plano de internet
		double distanciaServidores = scanner.nextDouble();

		double velocidadePlano = scanner.nextDouble();

		// Calcula a velocidade de download estimada
		double velocidadeDownloadEstimada = calcularVelocidadeDownload(distanciaServidores, velocidadePlano);

		// Apresentar o resultado
		System.out.println(
				"\nVelocidade de Download Estimada: " + String.format("%.2f", velocidadeDownloadEstimada) + " Mbps");

		scanner.close();
	}

	public static double calcularVelocidadeDownload(double distanciaServidores, double velocidadePlano) {
		// Cálculo para a velocidade de download estimada
		
		double velocidadeDownload = velocidadePlano / (1 + (distanciaServidores / 100));
		
		return velocidadeDownload;

	}
}
