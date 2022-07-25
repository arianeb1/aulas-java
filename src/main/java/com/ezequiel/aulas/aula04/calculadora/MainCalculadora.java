/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ezequiel.aulas.aula04.calculadora;

/**
 *
 * @author ezequ
 */
public class MainCalculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.somar(10, 23.48);
        //calculadora.imprimeResultado(result); o métido imprimeResultado é privado, não pode ser visivel de outra classe
        
        result = calculadora.subtrair(500, 300);
        calculadora.imprimeSubtracao(result);
    }
}
