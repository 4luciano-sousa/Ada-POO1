package projeto.poo1;

class Conta {
	protected Cliente cliente;
	protected double saldo;

	public Conta(Cliente cliente) {
		this.cliente = cliente;
		saldo = 0.0;
	}

	public void depositar(double valor) {
		saldo += valor;
	}

	public boolean sacar(double valor) {
		if (valor <= saldo) {
			saldo -= valor;
			return true;
		}
		return false;
	}

	public double getSaldo() {
		return saldo;
	}
}
