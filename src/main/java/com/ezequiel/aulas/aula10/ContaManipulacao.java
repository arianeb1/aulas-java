package com.ezequiel.aulas.aula10;

public class ContaManipulacao {

	public static void main(String[] args) {
		
		Conta contaCorrente = new Conta("Ezequiel", "conta corrente");
		System.out.println(contaCorrente);
		System.out.println(contaCorrente.getCliente());
		//contaCorrente.saldo = 10000; atributo saldo é privado, não pode ser alterado externamente
		
		contaCorrente.setCliente(null);
		contaCorrente.setCliente("");
		
		contaCorrente.setCliente("Ezequiel Braganca");
		System.out.println(contaCorrente);
		
		contaCorrente.depositar(1000);
		System.out.println(contaCorrente.getSaldo());
		
		contaCorrente.sacar(500);
		contaCorrente.sacar(1000);
		System.out.println(contaCorrente);
	}
}
