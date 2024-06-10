package entities;

import java.util.UUID;

public class Aluno {

	private UUID idAluno;
	private String nome;
	private String email;

	public Aluno() {
		// TODO Auto-generated constructor stub
	}

	public Aluno(UUID idAluno, String nome, String email) {
		super();
		this.idAluno = idAluno;
		this.nome = nome;
		this.email = email;
	}

	public UUID getIdAluno() {
		return idAluno;
	}

	public void setIdAluno(UUID idAluno) {
		this.idAluno = idAluno;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Aluno [idAluno=" + idAluno + ", nome=" + nome + ", email=" + email + "]";
	}

}
