package poo.exercicios.lista3.exercicio4;

class NotaFiscalBase implements NotaFiscal {
	protected int numeroNF;
	protected String descricao;
	protected int quantidade;
	protected double precoUnitario;

	public NotaFiscalBase(int numeroNF, String descricao, int quantidade, double precoUnitario) {
		this.numeroNF = numeroNF;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.precoUnitario = precoUnitario;
	}

	public String nf_to_string() {
		return numeroNF + "|" + descricao + "|" + quantidade + "|" + precoUnitario;
	}
}