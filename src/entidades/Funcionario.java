package entidades;

public class Funcionario {

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

//
//	public int compareTo(Funcionario a, Funcionario b) {
//		
//		return a.getEmail().compareTo(b.getEmail());
//	}

//	@Override
//	public int compareTo(Object o) {
//		// TODO Auto-generated method stub
//		return ;
//	}

}
