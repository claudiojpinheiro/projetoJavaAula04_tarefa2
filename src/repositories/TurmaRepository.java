package repositories;

import java.io.PrintWriter;
import entities.Turma;
import entities.Aluno;

public class TurmaRepository {
    
    public void exportarDados(Turma turma) throws Exception {
        
        PrintWriter printWriter = new PrintWriter("Turma" +  turma.getIdTurma() + ".xml");

        printWriter.write("<?xml version='1.0' encoding='iso-8859-1'?>");
        printWriter.write("<turma>");
            printWriter.write("<idTurma>" + turma.getIdTurma() + "</idTurma>");
            printWriter.write("<nome>" + turma.getNome() + "</nome>");
            printWriter.write("<dataInicio>" + turma.getDataInicio() + "</dataInicio>");
            
            printWriter.write("<professor>");
                printWriter.write("<idProfessor>" + turma.getProfessor().getIdProfessor() + "</idProfessor>");
                printWriter.write("<nome>" + turma.getProfessor().getNome() + "</nome>");
                printWriter.write("<telefone>" + turma.getProfessor().getTelefone() + "</telefone>");
                printWriter.write("<email>" + turma.getProfessor().getEmail() + "</email>");
            printWriter.write("</professor>");
            
            printWriter.write("<curso>");
                printWriter.write("<idCurso>" + turma.getCurso().getIdCurso() + "</idCurso>");
                printWriter.write("<titulo>" + turma.getCurso().getTitulo() + "</titulo>");
                printWriter.write("<cargaHoraria>" + turma.getCurso().getCargaHoraria() + "</cargaHoraria>");
            printWriter.write("</curso>");
            
            printWriter.write("<alunos>");
            for (Aluno aluno : turma.getAlunos()) {
                printWriter.write("<aluno>");
                    printWriter.write("<idAluno>" + aluno.getIdAluno() + "</idAluno>");
                    printWriter.write("<nome>" + aluno.getNome() + "</nome>");
                    printWriter.write("<email>" + aluno.getEmail() + "</email>");
                printWriter.write("</aluno>");
            }
            printWriter.write("</alunos>");
            
        printWriter.write("</turma>");
        
        printWriter.close();
    }
}
