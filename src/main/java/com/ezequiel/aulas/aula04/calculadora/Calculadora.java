/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ezequiel.aulas.aula04.calculadora;

/**
 *
 * @author ezequ
 */
public class Calculadora {
  
    //podemos ter quantos parametros quizermos em um método, basta separar por virgula
    public double somar(double valor1, double valor2){ // este método retorna um objeto do tipo double
        double resultado = valor1 + valor2;
        imprimeSoma(resultado);
        return resultado;
       
    }
    
    public double subtrair( double valor1, double valor2){
        return valor1 - valor2;
    }
    
    private void imprimeSoma(double resultado){
        System.out.println("soma: "+ resultado);
    }
    
    public void imprimeSubtracao(double resultado){
        System.out.println("soma: "+ resultado);
    }
    
    //o método a seguir nao compila, pois é esperado que ele retorne uma String,
    // mas estamos tentado retornar um valor inteiro
    /*
    public String metodoComRetornoIncorreto(){
        return 5;
    }
*/
    
}
