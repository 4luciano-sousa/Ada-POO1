package poo.exercicios.lista1;

public class Teste1 {
	
	    public static void main(String[] args) {
	    	
	        Atleta atleta = new Atleta();

	        atleta.nome = "Seu Madruga";
	        atleta.dataNascimento = "10/05/1945";
	        // atleta.cpf = "123.456.789-00"; privado
	        atleta.melhorTempo = "10s";
	        atleta.quantidadeParticipacoes = 5;

	        System.out.println("Nome: " + atleta.nome);
	        System.out.println("Data de Nascimento: " + atleta.getDataNascimento()); // Utiliza o getter
	        //System.out.println("CPF: " + atleta.getCpf()); privado
	        System.out.println("Melhor Tempo: " + atleta.getMelhorTempo()); // Utiliza o getter
	        System.out.println("Quantidade de Participações: " + atleta.quantidadeParticipacoes);
	    }
	}
