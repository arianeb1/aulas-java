package com.ezequiel.aulas.aula13;

import java.util.List;

public class Pedido {

	private Cliente cliente;
	private Endereco enderecoEntrega;
	private List<Produto> produtos;
	

	public Pedido() {
	}
	
	public Pedido(Cliente cliente, Endereco enderecoEntrega, List<Produto> produtos) {
		super();
		this.cliente = cliente;
		this.enderecoEntrega = enderecoEntrega;
		this.produtos = produtos;
	}



	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Endereco getEnderecoEntrega() {
		return enderecoEntrega;
	}
	public void setEnderecoEntrega(Endereco enderecoEntrega) {
		this.enderecoEntrega = enderecoEntrega;
	}
	public List<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	
}
