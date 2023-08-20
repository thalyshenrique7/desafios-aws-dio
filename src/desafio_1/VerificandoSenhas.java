package desafio_1;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Validando a força de senhas no IAM 
 * Autor: Thalys Henrique 
 * Data: 20/08/2023 12:21 
 * LinkedIn: https://www.linkedin.com/in/thalyshenrique7/
 */

/**
  	Requisitos de segurança para a senha:
		A senha deve ter no mínimo 8 caracteres.
		A senha deve conter pelo menos uma letra maiúscula (A-Z).
		A senha deve conter pelo menos uma letra minúscula (a-z).
		A senha deve conter pelo menos um número (0-9).
		A senha deve conter pelo menos um caractere especial, como !, @, #, $, %, etc.

	0101           ==   Sua senha e muito curta. Recomenda-se no minimo 8 caracteres.
	030609saturno* ==	Sua senha atende aos requisitos de seguranca. Parabens!
	010203Jupiter  ==	Sua senha nao atende aos requisitos de seguranca.
 */

public class VerificandoSenhas {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite a senha para verificar a força: ");
		String senha = scanner.nextLine();
		scanner.close();

		String resultado = verificarForcaSenha(senha);
		System.out.println(resultado);
	}

	public static String verificarForcaSenha(String senha) {
		int comprimentoMinimo = 8;

		// Critérios de validação usando expressões regulares
		boolean temLetraMaiuscula = Pattern.compile("[A-Z]").matcher(senha).find();
		boolean temLetraMinuscula = Pattern.compile("[a-z]").matcher(senha).find();
		boolean temNumero = Pattern.compile("\\d").matcher(senha).find();
		boolean temCaractereEspecial = Pattern.compile("\\W").matcher(senha).find();
		boolean temSequenciaComum = senha.matches(".*(?i)123456.*|.*(?i)abcdef.*");
		boolean temPalavraComum = senha.equalsIgnoreCase("password") || senha.equalsIgnoreCase("123456")
				|| senha.equalsIgnoreCase("qwerty");

		// Verifica o comprimento mínimo e critérios de validação

		if (senha.length() < comprimentoMinimo) {
			return "Sua senha e muito curta. Recomenda-se no minimo 8 caracteres.";
		} else if (!temLetraMaiuscula || !temLetraMinuscula || !temNumero || !temCaractereEspecial) {
			return "Sua senha nao atende aos requisitos de seguranca.";
		} else if (temPalavraComum || temSequenciaComum) {
			return "Sua senha possui palavras em comum ou sequências em comum.";
		}

		return "Sua senha atende aos requisitos de seguranca. Parabens!";

	}
}
