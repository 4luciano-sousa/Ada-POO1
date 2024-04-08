package poo.exercicios.lista3.exercicio3;

import java.util.ArrayList;
import java.util.List;

class Estacionamento {
	private final List<Veiculo> veiculosEstacionados = new ArrayList<>();

	public void estacionar(Veiculo v) {
		veiculosEstacionados.add(v);
	}

	public Veiculo sairDoEstacionamento(String placa) {
		for (Veiculo v : veiculosEstacionados) {
			if (v.placa.equals(placa)) {
				veiculosEstacionados.remove(v);
				return v;
			}
		}
		return null;
	}

	public boolean consultarVeiculo(String placa) {
		for (Veiculo v : veiculosEstacionados) {
			if (v.placa.equals(placa)) {
				return true;
			}
		}
		return false;
	}

	public int ocupacao() {
		return veiculosEstacionados.size();
	}
}
