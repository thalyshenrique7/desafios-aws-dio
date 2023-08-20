package desafio_5;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 * Regras Para Dimensionamento de Infraestrutura com EKS 
 * Autor: Thalys Henrique
 * Data: 20/08/2023 15:35
 * LinkedIn: https://www.linkedin.com/in/thalyshenrique7/
 */

public class MonitoramentoLogsAWS {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int quantidadeLogs = scanner.nextInt();
		scanner.nextLine(); // Limpar o buffer do scanner
		
		Map<String, Long> eventosPorServico = new HashMap<>();
		for (int i = 0; i < quantidadeLogs; i++) {
			String[] parts = scanner.nextLine().split(",");
			String servico = parts[1];
			
			if (parts.length >= 3) {
				servico = parts[1].trim();
			}

			// Utiliza o mapa para registrar/incrementar o serviço em questão

			eventosPorServico.put(servico, eventosPorServico.getOrDefault(servico, 0L) + 1);
		}

		// Identifica no mapa os serviços com maior e menor quantidade de logs

		Entry<String, Long> valorMax = eventosPorServico.entrySet().stream().max(Comparator.comparing(Entry::getValue))
				.get();

		Entry<String, Long> valorMin = eventosPorServico.entrySet().stream().min(Comparator.comparing(Entry::getValue))
				.get();

		// Imprime a saída no padrão definido

		System.out.println("Eventos por servico:");
		for (Entry<String, Long> entry : eventosPorServico.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}

		System.out.println("Maior:" + valorMax.getKey());
		System.out.println("Menor:" + valorMin.getKey());

		scanner.close();
	}
}
