package projeto.poo1;

import java.util.ArrayList;

class Banco {
	private ArrayList<Conta> contas;

	public Banco() {
		contas = new ArrayList<>();
	}

	public void adicionarConta(Conta conta) {
		contas.add(conta);
	}

	public Conta buscarConta(Cliente cliente) {
		for (Conta conta : contas) {
			if (conta.cliente.getCpf().equals(cliente.getCpf())) {
				return conta;
			}
		}
		return null;
	}
}
