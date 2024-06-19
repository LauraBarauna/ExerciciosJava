package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ManipulacaoHashSet {
    public Set<Integer> integerSet;


    //construtor
    public ManipulacaoHashSet() {
        this.integerSet = new HashSet<>();
        integerSet.add(1);
        integerSet.add(2);
        integerSet.add(3);
        integerSet.add(4);
        integerSet.add(5);
        integerSet.add(1);
        integerSet.add(2);
    }

    //metodos
    public void exibirSet(){
        System.out.println(integerSet);
    }

    public Set<Integer> removerNumero(Integer numero){
        Set<Integer> numerosParaRemover = new HashSet<>();
        if (!integerSet.isEmpty()){
            for (Integer i: integerSet){
                if (i.equals(numero)){
                    numerosParaRemover.add(numero);
                }
            }
        }else {
            System.out.println("Lista vzia!");
        }
        integerSet.removeAll(numerosParaRemover);
        return integerSet;
    }

    public void verificarNumero(Integer numero){
        boolean presente = false;
        for (Integer i: integerSet){
            if (i.equals(numero)){
                presente = true;
            }
        }
        if (presente){
            System.out.println("Numero: "+numero+" está presente");
        } else {
            System.out.println("Número: "+numero+" não está presente");
        }
    }

    public List<Integer> converterParaLista(){
        return new ArrayList<>(integerSet);
    }


    public static void main(String[] args) {
        ManipulacaoHashSet numero = new ManipulacaoHashSet();

        numero.exibirSet();
        numero.removerNumero(2);
        numero.exibirSet();
        numero.verificarNumero(2);
        numero.verificarNumero(1);

        List<Integer> lista = numero.converterParaLista();
        System.out.println("Lista convertida: " + lista);
    }

}
