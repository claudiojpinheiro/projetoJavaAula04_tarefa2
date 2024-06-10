package entities;

import java.util.UUID;

public class Curso {

	private UUID idCurso;
	private String titulo;
	private String cargaHoraria;

	public Curso() {
		// TODO Auto-generated constructor stub
	}

	public Curso(UUID idCurso, String titulo, String cargaHoraria) {
		super();
		this.idCurso = idCurso;
		this.titulo = titulo;
		this.cargaHoraria = cargaHoraria;
	}

	public UUID getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(UUID idCurso) {
		this.idCurso = idCurso;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(String cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	@Override
	public String toString() {
		return "Curso [idCurso=" + idCurso + ", titulo=" + titulo + ", cargaHoraria=" + cargaHoraria + "]";
	}

}
