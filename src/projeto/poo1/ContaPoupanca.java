package projeto.poo1;

	class ContaPoupanca extends Conta {
	    private double taxaRendimento;

	    public ContaPoupanca(Cliente cliente, double taxaRendimento) {
	        super(cliente);
	        this.taxaRendimento = taxaRendimento;
	    }

	    @Override
	    public void depositar(double valor) {
	        super.depositar(valor * (1 + taxaRendimento));
	    }
	}
