package entidades;

public class Funcionarios {
	
	//comentario apenas para ver se atualiza o Github 

	String nome;
	String email;
	Double salario;

	public Funcionarios(String nome, String email, Double salario) {
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

}
