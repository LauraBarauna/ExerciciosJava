package com.exerciciosjava.poo.cadastroalunos;

import java.util.HashMap;

public class Aluno {
    //atributos
    private String nome;
    private String matricula;
    private HashMap<String, Disciplina> disciplinas;

    //construtor
    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.disciplinas = new HashMap<>();
    }

    //metodos
    public void adicionarDisciplina(String nomeDisciplina, double nota){
        Disciplina materias = new Disciplina(nomeDisciplina, nota);
        disciplinas.put(nomeDisciplina, materias);
    }

    public double calcularMedia(){
        double soma = 0;
        for (Disciplina disciplina : disciplinas.values()){
            soma += disciplina.getNota();
        }
        return  disciplinas.size() > 0 ? soma / disciplinas.size() : 0;
    }

    public void listarDisciplinas(){
        for (Disciplina disciplina: disciplinas.values()){
            System.out.println(disciplina);
        }
    }

    //to string
    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matricula='" + matricula + '\'' +
                '}';

    }
}
