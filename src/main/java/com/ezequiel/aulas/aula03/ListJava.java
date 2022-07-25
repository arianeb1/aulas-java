/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ezequiel.aulas.aula03;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ezequ
 */
public class ListJava {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        
        System.out.println("Lista" + nomes + " \n tamanho:" + nomes.size());
        //adicionar itens na lista
        nomes.add("Ezequiel");
        nomes.add("Ariane");
        nomes.add("Eliana");
        
        System.out.println("Pegar um item da lista pela posicao: "+ nomes.get(1));
        
        System.out.println("Lista" + nomes + " \n tamanho:" + nomes.size());
        
        nomes.remove(0);
        
        System.out.println("Lista" + nomes + " \n tamanho:" + nomes.size());
        
        nomes.set(1, "Eliana Lima");
        
        System.out.println("Lista" + nomes + " \n tamanho:" + nomes.size());
        
        for(String nome: nomes){
            System.out.println("Nome:"+ nome);
        }
        
        List<Integer> itens = new ArrayList<>();
        //lista so recebe seu tipo definido anteriormente, linha abaixo nao compila
        //itens.add("String value");
        
        List<Double> doubleItens = new ArrayList<>();
        
        
    }
}
