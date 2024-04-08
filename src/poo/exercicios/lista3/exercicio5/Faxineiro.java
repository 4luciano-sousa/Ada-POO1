package poo.exercicios.lista3.exercicio5;

class Faxineiro extends Funcionario {
	private double adicionalInsalubridade;

	public Faxineiro(String nome, double salarioBruto) {
		super(nome, salarioBruto);

		this.adicionalInsalubridade = salarioBruto * 0.2;
	}

	@Override
	public double obterSalarioLiquido() {
		return super.obterSalarioLiquido() + adicionalInsalubridade;
	}
}
