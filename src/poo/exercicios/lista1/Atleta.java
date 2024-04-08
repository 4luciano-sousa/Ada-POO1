package poo.exercicios.lista1;

public class Atleta {

	public String nome;
	protected String dataNascimento;
	private String cpf;
	protected String melhorTempo;
	public int quantidadeParticipacoes;

	public Atleta() {
	}

	protected String getDataNascimento() {
		return dataNascimento;
	}

	protected void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	private String getCpf() {
		return cpf;
	}

	private void setCpf(String cpf) {
		this.cpf = cpf;
	}

	protected String getMelhorTempo() {
		return melhorTempo;
	}

	protected void setMelhorTempo(String melhorTempo) {
		this.melhorTempo = melhorTempo;
	}
}
