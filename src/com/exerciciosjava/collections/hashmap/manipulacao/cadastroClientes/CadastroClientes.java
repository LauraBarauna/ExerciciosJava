package com.exerciciosjava.collections.hashmap.manipulacao.cadastroClientes;

import java.util.HashMap;
import java.util.Map;

public class CadastroClientes {
    //atributp
    private Map<String, Clientes> clientesMap;


    //construtor
    public CadastroClientes() {
        this.clientesMap = new HashMap<>();
    }

    //metodos
    public void adicionarClientes(String nome, int idade, String dataNascimento, String cpf, String telefone){
        if (cpf.length() != 11){
            throw new RuntimeException("Cpf precisa ter 11 digitos e ser nesse formato: 11111111111");
        } else if (telefone.length() != 11) {
            throw new RuntimeException("Telefone precisa ter 11 digitos e ser nesse formato: 11111111111");
        }

        Clientes clientes = new Clientes(nome, idade, dataNascimento, cpf, telefone);
        clientesMap.put(cpf, clientes);
    }



    public void buscarClientesPeloCpf(String cpf){
        if (!clientesMap.isEmpty()){
            if (clientesMap.containsKey(cpf)){
                System.out.println("O cliente com o cpf "+cpf+" é: "+clientesMap.get(cpf));
            }else {
                throw new RuntimeException("Esse cpf não existe em nosso cadastro");
            }
        }else {
            throw new RuntimeException("Map vazio!");
        }
    }

    public void listarClientes (){
        if (!clientesMap.isEmpty()){
            System.out.println(clientesMap);
        }else {
            throw new RuntimeException("Map vazio!");
        }
    }

    public void removerClientePorCpf(String cpf){
        if (!clientesMap.isEmpty()){
            if (clientesMap.containsKey(cpf)){
                System.out.println("Cliente "+clientesMap.get(cpf).getNome()+" removido (a)");
                clientesMap.remove(cpf);
            }else {
                throw new RuntimeException("Esse cpf não existe em nosso cadastro");
            }
        }else{
            throw new RuntimeException("Map vazio!");
        }
    }

}
