package com.ezequiel.aulas.aula13;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class EcomerceMain {

	public static void main(String[] args) {
		Calendar dtNascimento = Calendar.getInstance();
		dtNascimento.set(1987, 9, 26);
		Cliente cliente1 = new Cliente("Ezequiel", "Braganca", dtNascimento );
		
		ArrayList<Endereco> enderecos = new ArrayList<>();
		enderecos.add(new Endereco("Joao Gaspar", "329", "05843-290", "São Paulo"));
		enderecos.add(new Endereco("Joao Gaspar", "500", "05843-290", "São Paulo"));
		
		Endereco endereco = new Endereco("Joao Gaspar", "600", "05843-290", "São Paulo");
		enderecos.add(endereco);
		
		cliente1.setEnderecos(enderecos);
		
		Cliente cliente2 = new Cliente("Eliana", "Lima", dtNascimento, enderecos);
		
		List<Produto> produtos = new ArrayList<Produto>();
		produtos.add(new Produto("Arroz", 22.22));
		produtos.add(new Produto("Feijao", 22.22));
		produtos.add(new Produto("Açucar", 4));
		produtos.add(new Produto("Cafe", 25));
		produtos.add(new Produto("Óleo", 10));
		
		Pedido pedido = new Pedido();
		pedido.setCliente(cliente2);
		pedido.setEnderecoEntrega(cliente2.getEnderecos().get(0));
		pedido.setProdutos(produtos);
		
		
	}
}
