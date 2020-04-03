package entidades;

public class Funcionario implements Comparable<Funcionario> {

	String nome;
	String email;
	Double salario;

	public Funcionario(String nome, String email, Double salario) {
		this.nome = nome;
		this.email = email;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public Double getSalario() {
		return salario;
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", email=" + email + ", salario=" + salario + "]";
	}

	@Override
	public int compareTo(Funcionario funcionario) {

		return this.email.compareTo(funcionario.getEmail());
	}
}
