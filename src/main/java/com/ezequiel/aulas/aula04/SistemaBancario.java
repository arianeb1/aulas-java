/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ezequiel.aulas.aula04;

import java.util.Date;

/**
 *
 * @author ezequ
 */
//a declaracao é formada pelo modificador de acesso ( default,public, private, protected) + class + nome da classe 
//a classe principal deve ter o mesmo nome do arquivo
public class SistemaBancario{
    
    public static void main(String[] args) {
        //na linha abaixo estamos criando uma instancia da classe Conta utilizando o construtor padrão
        Conta contaCorrente = new Conta();
        contaCorrente.cliente = "Maria";
        
        char letra = contaCorrente.cliente.charAt(2);
        System.out.println("Letra:"+ letra);
        
        int tamanho = contaCorrente.cliente.length();
        System.out.println("tamanho:"+ tamanho);
        
        //os métodos publicos de uma classe podem ser chamados de uma instancia da classe,  utilizando o "." + o nome do método, passando os parametros se ouver,
        //no caso abaixo estamos passando o valor 100 como parametro para o métido depositar
        contaCorrente.depositar(100);
        // o metodo visualizarSaldo não tem parametrk
        contaCorrente.visualisarSaldo();
        contaCorrente.sacar(50);
        contaCorrente.visualisarSaldo();
        contaCorrente.depositar(100);
        contaCorrente.visualisarSaldo();
        contaCorrente.sacar(200);
        contaCorrente.visualisarSaldo();
        
        //A linha abaixo não compila,  pois o método verificarSaldo é privado, so pode ser acessado de dentro da classe Conta
        //contaPoupanca.verificarSaldo(100);
        
        Conta contaSalario =  new Conta();
        contaSalario.cliente = "Jose";
        System.out.println(contaSalario);
        System.out.println(contaSalario.cliente);
        
        Conta contaPoupanca = new Conta();
        contaPoupanca.cliente = "Pedro";
        System.out.println(contaPoupanca.saldo);
        
        
        
    }
    
    //este é uma exemplo de uma classe interna privada, ela não é visivel de fora da classe SistemaBancario
   private static class Conta {
        
        String cliente;
        Date dataCriacao;
        double saldo;
        String tipo;
        
        //este é um construtor da classe Conta, se não for declarado, ele usara o construtor padrão da classe Object
        Conta(){
            this.saldo = 0; // neste construtor, toda vez que instanciarmos um novo objeto da classe Conta, o valor inicial do Saldo = 0
            this.dataCriacao = new Date(); // estamos definindo tambem que a data de criacao da conta criada será a data atual
        }
        
        //para declararmos um método, informamos o modificador de acesso ( default,public, private, protected) + o tipo de retorno ( void, int String, boolean ...) + nome do método + argumentos entre parenteses( opcional)
        //no caso abaixo, não declaramos o modificador de acesso, neste caso automaticamente o compilador entende que deve usar o defaut
        //o método abaixo nao tem retorno, logo definimos o retorno como "void"
        void visualisarSaldo(){
            System.out.println("Saldo:"+ saldo);
        }
        
        //o método a seguir recebe um parametro de entrada ( double)
        void sacar(double valor){
            //no metodo 
            boolean checkSaldo = verificarSaldo(valor);
            if(checkSaldo){
                 saldo-=valor;
            }else{
                System.out.println("O saldo é menor que o valor a ser sacado");
            }
           
        }
        
        void depositar(double valor){
            saldo+=valor;
        }
        
        //o métido abaixo tem um retorno definido ( boolean), logo precisamos definir o que sera retornado com "return"
        // o metodo verificarSaldo é privado, ele não é visível de fora da classe Conta
        private boolean verificarSaldo(double valorSaque){
            if(saldo >= valorSaque){
                return true; // este é o retorno do método, se o saque informado for maior que o valor de saldo, retorna true
            }else{
                return false; // se nao retorna false
                //o "return" é a ultima linha do bloco do código, neste caso temos dois blocos, a condicao if e a condicao else
            }
        }
        
    }
    
}
