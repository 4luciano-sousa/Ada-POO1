package poo.exercicios.lista3.exercicio4;

class NotaFiscalEletronica extends NotaFiscalBase {
	private String qrCode;

	public NotaFiscalEletronica(int numeroNF, String descricao, int quantidade, double precoUnitario, String qrCode) {
		super(numeroNF, descricao, quantidade, precoUnitario);
		this.qrCode = qrCode;
	}

	@Override
	public String nf_to_string() {
		return super.nf_to_string() + "|" + qrCode;
	}
}