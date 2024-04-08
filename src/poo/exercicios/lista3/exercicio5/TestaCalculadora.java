package poo.exercicios.lista3.exercicio5;

import java.util.Scanner;

public class TestaCalculadora {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o nome do funcionário:");
		String nome = scanner.nextLine();

		System.out.println("Digite o salário bruto do funcionário:");
		double salarioBruto = scanner.nextDouble();

		Faxineiro faxineiro = new Faxineiro(nome, salarioBruto);

		System.out.println(
				"O salário líquido do faxineiro " + faxineiro.nome + " é: R$" + faxineiro.obterSalarioLiquido());

		scanner.close();
	}
}
