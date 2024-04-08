package poo.exercicios.lista3.exercicio3;

import java.util.Scanner;

public class TestaEstacionamento {

	public static void main(String[] args) {
		Estacionamento estacionamento = new Estacionamento();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Bem-vindo ao estacionamento!");
		while (true) {
			System.out.println("\nEscolha uma opção:");
			System.out.println("1. Estacionar veículo");
			System.out.println("2. Retirar veículo do estacionamento");
			System.out.println("3. Consultar veículo");
			System.out.println("4. Verificar ocupação do estacionamento");
			System.out.println("5. Sair");
			int escolha = scanner.nextInt();

			switch (escolha) {
			case 1:
				System.out.println("Digite a placa do veículo:");
				String placaEstacionar = scanner.next();
				System.out.println("Digite o tipo do veículo (carro ou moto):");
				String tipoVeiculo = scanner.next();
				if (tipoVeiculo.equals("carro")) {
					estacionamento.estacionar(new Carro(placaEstacionar));
				} else if (tipoVeiculo.equals("moto")) {
					estacionamento.estacionar(new Moto(placaEstacionar));
				} else {
					System.out.println("Tipo de veículo inválido!");
				}
				break;
			case 2:
				System.out.println("Digite a placa do veículo a ser retirado:");
				String placaRetirar = scanner.next();
				Veiculo veiculoRemovido = estacionamento.sairDoEstacionamento(placaRetirar);
				if (veiculoRemovido != null) {
					System.out
							.println("Veículo com placa " + veiculoRemovido.placa + " foi retirado do estacionamento.");
				} else {
					System.out.println("Veículo não encontrado no estacionamento.");
				}
				break;
			case 3:
				System.out.println("Digite a placa do veículo a ser consultado:");
				String placaConsultar = scanner.next();
				if (estacionamento.consultarVeiculo(placaConsultar)) {
					System.out.println("Veículo com placa " + placaConsultar + " está estacionado.");
				} else {
					System.out.println("Veículo com placa " + placaConsultar + " não está estacionado.");
				}
				break;
			case 4:
				System.out.println("Ocupação do estacionamento: " + estacionamento.ocupacao() + " veículos.");
				break;
			case 5:
				System.out.println("Saindo do programa...");
				scanner.close();
				System.exit(0);
				break;
			default:
				System.out.println("Opção inválida!");
				break;
			}
		}
	}
}