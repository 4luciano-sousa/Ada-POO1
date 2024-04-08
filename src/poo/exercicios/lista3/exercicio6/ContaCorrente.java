package poo.exercicios.lista3.exercicio6;

class ContaCorrente extends ContaBancaria {
	public boolean possuiChequeEspecial;
	public double limiteDoChequeEspecial;

	public ContaCorrente(String agencia, String conta, boolean possuiChequeEspecial) {
		this.agencia = agencia;
		this.conta = conta;
		this.possuiChequeEspecial = possuiChequeEspecial;
		if (possuiChequeEspecial) {
			this.limiteDoChequeEspecial = 500;
		}
	}
}