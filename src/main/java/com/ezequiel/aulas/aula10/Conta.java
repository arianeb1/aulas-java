package com.ezequiel.aulas.aula10;

import java.util.Date;

public class Conta {

	//definir atributos como privados, eles sói devem ser manipulados pela propria classe
	//é uma forma de garantir que em nenhuma outra parte do código estes valores serão alterados 
	//sem passar pelos metodos de manipulação ou de setters.
	private String cliente;
	private String tipo;
	private double saldo;
	private Date dataCriacao;
	
	
	public Conta(String cliente, String tipo) {
		this.cliente = cliente;
		this.tipo = tipo;
	}

	public String getCliente() {
		return cliente;
	}

	//podemos colocar validações antes de alterar um valor
	public void setCliente(String cliente) {
		if(cliente == null || cliente.isEmpty()) {
			System.out.println("Nome não pode ser vazio");
		}else {
			this.cliente = cliente;
		}
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void depositar(double valor) {
		saldo+=valor;
	}
	
	public void sacar(double valor) {
		if(valor<= saldo) {
			saldo-=valor;
		}else {
			System.out.println("Saldo insuficiente");
		}
	}
	
	public void transferir(double valor) {
		if(valor <=saldo) {
			saldo-=valor;
		}else {
			System.out.println("Saldo insuficiente");
		}
	}

	@Override
	public String toString() {
		return "Conta [cliente=" + cliente + ", tipo=" + tipo + ", saldo=" + saldo + ", dataCriacao=" + dataCriacao
				+ "]";
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	

}
