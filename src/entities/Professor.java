package entities;

import java.util.UUID;

public class Professor {
	
	private UUID idProfessor;
	private String nome;
	private String telefone;
	private String email;
	
	public Professor() {
		// TODO Auto-generated constructor stub
	}

	
	
	public Professor(UUID idProfessor, String nome, String telefone, String email) {
		super();
		this.idProfessor = idProfessor;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}




	public UUID getIdProfessor() {
		return idProfessor;
	}



	public void setIdProfessor(UUID idProfessor) {
		this.idProfessor = idProfessor;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getTelefone() {
		return telefone;
	}



	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	@Override
	public String toString() {
		return "Professor [idProfessor=" + idProfessor + ", nome=" + nome + ", telefone=" + telefone + ", email="
				+ email + "]";
	}
	
	
		

}
