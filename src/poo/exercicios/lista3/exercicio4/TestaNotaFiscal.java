package poo.exercicios.lista3.exercicio4;

import java.util.Scanner;

public class TestaNotaFiscal {

	public static NotaFiscalEletronica processarEntrada(String entrada) {
		String[] partes = entrada.split("_");
		int numeroNF = 0;
		String descricao = "";
		int quantidade = 0;
		double precoUnitario = 0;
		String qrCode = "";

		for (String parte : partes) {
			String[] propriedadeValor = parte.split(":");
			String propriedade = propriedadeValor[0];
			String valor = propriedadeValor.length > 1 ? propriedadeValor[1] : "";

			switch (propriedade) {
			case "nf":
				numeroNF = Integer.parseInt(valor);
				break;
			case "desc":
				descricao = valor;
				break;
			case "qtde":
				quantidade = Integer.parseInt(valor);
				break;
			case "precoUnitario":
				precoUnitario = Double.parseDouble(valor.replace(',', '.'));
				break;
			case "qrCode":
				qrCode = valor;
				break;
			default:

				break;
			}
		}

		return new NotaFiscalEletronica(numeroNF, descricao, quantidade, precoUnitario, qrCode);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

// Digitar na Entrada: "nf:1_desc:Camiseta_qtde:1_precoUnitario:49,90_qrCode:abc"

		System.out.print("Entrada: ");
		String entrada = scanner.nextLine();

		NotaFiscalEletronica notaFiscal = processarEntrada(entrada);

		System.out.println("Saída: " + notaFiscal.nf_to_string());

		scanner.close();
	}
}
