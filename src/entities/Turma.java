package entities;

import java.util.List;
import java.util.UUID;

public class Turma {

    private UUID idTurma;
    private String nome;
    private String dataInicio;
    private Professor professor;
    private Curso curso;
    private List<Aluno> alunos;

    public Turma() {
        // Construtor padrão
    }

    public Turma(UUID idTurma, String nome, String dataInicio, Professor professor, Curso curso, List<Aluno> alunos) {
        this.idTurma = idTurma;
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.professor = professor;
        this.curso = curso;
        this.alunos = alunos;
    }

    public UUID getIdTurma() {
        return idTurma;
    }

    public void setIdTurma(UUID idTurma) {
        this.idTurma = idTurma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String string) {
        this.dataInicio = string;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    @Override
    public String toString() {
        return "Turma [idTurma=" + idTurma + ", nome=" + nome + ", dataInicio=" + dataInicio + ", professor=" + professor
                + ", curso=" + curso + ", alunos=" + alunos + "]";
    }
}
