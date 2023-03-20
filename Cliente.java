package TRABALHO;

public class Cliente {
	public String cpf;
	public int anoNascimento;
	public String nome;
	public String email;
	
	public String toString() {
		return "CPF: "+ cpf + "\nAno de nascimento: " + anoNascimento + "\nNome: " + nome + "\nEmail: " + email;
	}
}
