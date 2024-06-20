package com.exerciciosjava.collections.hashmap.manipulacao.cadastroClientes;

public class Clientes {
    //atributos
    private String nome;
    private int idade;
    private String dataNascimento;
    private String telefone;
    private String cpf;

    //construtor
    public Clientes(String nome, int idade, String dataNascimento, String cpf, String telefone) {
        this.nome = nome;
        this.idade = idade;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    //get
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getCpf() {
        return formatarCpf(cpf);
    }

    public String getTelefone(){
        return formatarTelefone(telefone);
    }

    //metodos auxiliares
    private String formatarCpf(String cpf) {
        return cpf.replaceAll("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4");
    }

    private String formatarTelefone(String telefone) {
        return telefone.replaceAll("(\\d{2})(\\d)(\\d{4})(\\d{4})", "($1) $2 $3-$4");
    }


    //to string
    @Override
    public String toString() {
        return "Clientes{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", telefone='" + getTelefone() + '\'' +
                ", cpf='" + getCpf() + '\'' +
                '}';
    }
}
