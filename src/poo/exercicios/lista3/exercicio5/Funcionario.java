package poo.exercicios.lista3.exercicio5;

class Funcionario {

	protected String nome;
	protected double salarioBruto;

	public Funcionario(String nome, double salarioBruto) {
		this.nome = nome;
		this.salarioBruto = salarioBruto;
	}

	public double obterSalarioLiquido() {
		return salarioBruto * 0.95; // 5% de desconto
	}
}
