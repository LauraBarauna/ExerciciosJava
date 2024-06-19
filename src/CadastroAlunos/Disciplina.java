package CadastroAlunos;

import java.util.HashMap;
import java.util.Map;

public class Disciplina {
    //atributos
    String nome;
    double nota;

    //construtor
    public Disciplina(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    //get
    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }

    //to string
    @Override
    public String toString() {
        return "Disciplina{" +
                "nome='" + nome + '\'' +
                ", nota=" + nota +
                '}';
    }
}
