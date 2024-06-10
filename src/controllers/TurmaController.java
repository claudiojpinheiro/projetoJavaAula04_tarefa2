package controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

import entities.Aluno;
import entities.Curso;
import entities.Professor;
import entities.Turma;
import repositories.TurmaRepository;

public class TurmaController {

	public void cadastrarTurma() {

		Scanner scanner = new Scanner(System.in);
		
		Turma turma = new Turma();
		
		Professor professor = new Professor();
		
		Curso curso = new Curso();
		
		List<Aluno> alunos = new ArrayList<>();
		

		turma.setIdTurma(UUID.randomUUID());

		System.out.println("NOME DA TURMA: ");
		turma.setNome(scanner.nextLine());

		System.out.println("DATA DE INICIO DA TURMA (dd/MM/yyyy): ");
		turma.setDataInicio(scanner.nextLine());
		
		

		professor.setIdProfessor(UUID.randomUUID());

		System.out.println("NOME DO PROFESSOR DA TURMA: ");
		professor.setNome(scanner.nextLine());

		System.out.println("TELEFONE DO PROFESSOR DA TURMA: ");
		professor.setTelefone(scanner.nextLine());

		System.out.println("EMAIL DO PROFESSOR DA TURMA: ");
		professor.setEmail(scanner.nextLine());
		
		turma.setProfessor(professor);
		
		
		

		curso.setIdCurso(UUID.randomUUID());

		System.out.println("TÍTULO DO CURSO: ");
		curso.setTitulo(scanner.nextLine());

		System.out.println("CARGA HORÁRIA DO CURSO: ");
		curso.setCargaHoraria(scanner.nextLine());
		scanner.nextLine(); 

		turma.setCurso(curso);
		
		
		

		System.out.println("Quantos alunos deseja adicionar?");
		int quantidadeAlunos = scanner.nextInt();
		
		scanner.nextLine(); 

		for (int i = 0; i < quantidadeAlunos; i++) {
			Aluno aluno = new Aluno();
			aluno.setIdAluno(UUID.randomUUID());

			System.out.println("NOME DO ALUNO: ");
			aluno.setNome(scanner.nextLine());

			System.out.println("EMAIL DO ALUNO: ");
			aluno.setEmail(scanner.nextLine());

			alunos.add(aluno);
		}

		turma.setAlunos(alunos);

		try {
			TurmaRepository turmaRepository = new TurmaRepository();
			turmaRepository.exportarDados(turma);
			System.out.println("Dados exportados com sucesso!");
		} catch (Exception e) {
			System.out.println("ERRO: " + e.getMessage());
		} finally {
			scanner.close();
		}
	}
}
