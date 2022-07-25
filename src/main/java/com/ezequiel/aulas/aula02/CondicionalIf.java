package com.ezequiel.aulas.aula02;

public class CondicionalIf {

	public static void main(String [] args) {

		int dia = 1;
		if( dia == 1) {  // o condicional if verifica se uma condicão é verdadeira ou falsa
			System.out.println("pague suas contas"); // se a condicao for verdadeira, o conteudo é executado
		}
		
		int idade = 15;
		if(idade >= 18 ) {
			System.out.println("Maior de idade"); 
		}else { //se a condicao nao for verdadeira, o bloco este é executado
			System.out.println("Menor de idade");
		}
		if(idade >= 18) // uma condicao if ou if/else pode ser construida sem as chaves quando o conteudo do if ou do else seja de apenas uma linha
			System.out.println("Maior de idade"); 
		else
			System.out.println("Menor de idade");
		System.out.println("Fim");
		
		//este é outra forma de fazer um if, usado quando vamos setar o valor de um atributo, primeiro a condicao a ser testada, seguida do sinal de interrogacao, 
		//o separador entre o conteudo verdadeiro e false é ':'
		String texto = idade >= 30 ? "Pessoa madura": "Espere mais alguns anos";
		System.out.println(texto);
		
	}
}
