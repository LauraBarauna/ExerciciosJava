package com.exerciciosjava.poo.cadastroAlunos;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("João Silva", "20210001");

        aluno.adicionarDisciplina("Matemática", 85.5);
        aluno.adicionarDisciplina("História", 78.0);
        aluno.adicionarDisciplina("Química", 92.0);

        System.out.println("Dados do aluno:");
        System.out.println(aluno);

        System.out.println("\nDisciplinas:");
        aluno.listarDisciplinas();

        System.out.println("\nMédia das notas: " + aluno.calcularMedia());
    }
}
