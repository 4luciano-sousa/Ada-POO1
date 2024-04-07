package projeto.poo1;

import java.util.Scanner;

public class AplicacaoBancaria {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Banco banco = new Banco();

		int escolha;
		double valor;
		String nome, cpf;

		do {
			System.out.println("\nEscolha uma opção:");
			System.out.println("1. Abrir conta corrente");
			System.out.println("2. Abrir conta poupança");
			System.out.println("3. Depositar");
			System.out.println("4. Sacar");
			System.out.println("5. Consultar saldo");
			System.out.println("6. Sair");
			escolha = scanner.nextInt();

			switch (escolha) {
			case 1:
				System.out.println("Digite o nome do cliente:");
				nome = scanner.next();
				System.out.println("Digite o CPF do cliente:");
				cpf = scanner.next();
				Cliente clienteCorrente = new Cliente(nome, cpf);
				ContaCorrente contaCorrente = new ContaCorrente(clienteCorrente);
				banco.adicionarConta(contaCorrente);
				System.out.println("Conta corrente aberta com sucesso para " + clienteCorrente.getNome());
				break;
			case 2:
				System.out.println("Digite o nome do cliente:");
				nome = scanner.next();
				System.out.println("Digite o CPF do cliente:");
				cpf = scanner.next();
				Cliente clientePoupanca = new Cliente(nome, cpf);
				ContaPoupanca contaPoupanca = new ContaPoupanca(clientePoupanca, 0.005); // Taxa de rendimento de 0.5%
				banco.adicionarConta(contaPoupanca);
				System.out.println("Conta poupança aberta com sucesso para " + clientePoupanca.getNome());
				break;
			case 3:
				System.out.println("Digite o CPF do cliente:");
				cpf = scanner.next();
				Conta contaDeposito = banco.buscarConta(new Cliente("", cpf));
				if (contaDeposito != null) {
					System.out.println("Digite o valor a depositar:");
					valor = scanner.nextDouble();
					contaDeposito.depositar(valor);
					System.out.println("Valor depositado com sucesso!");
				} else {
					System.out.println("Cliente não encontrado!");
				}
				break;
			case 4:
				System.out.println("Digite o CPF do cliente:");
				cpf = scanner.next();
				Conta contaSaque = banco.buscarConta(new Cliente("", cpf));
				if (contaSaque != null) {
					System.out.println("Digite o valor a sacar:");
					valor = scanner.nextDouble();
					if (contaSaque.sacar(valor)) {
						System.out.println("Valor sacado com sucesso!");
					} else {
						System.out.println("Saldo insuficiente!");
					}
				} else {
					System.out.println("Cliente não encontrado!");
				}
				break;
			case 5:
				System.out.println("Digite o CPF do cliente:");
				cpf = scanner.next();
				Conta contaConsulta = banco.buscarConta(new Cliente("", cpf));
				if (contaConsulta != null) {
					System.out.println("Saldo: " + contaConsulta.getSaldo());
				} else {
					System.out.println("Cliente não encontrado!");
				}
				break;
			case 6:
				System.out.println("Saindo...");
				break;
			default:
				System.out.println("Opção inválida!");
			}
		} while (escolha != 6);

		scanner.close();
	}
}