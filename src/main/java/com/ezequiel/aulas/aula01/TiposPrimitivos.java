package com.ezequiel.aulas.aula01;

public class TiposPrimitivos {

	public static void main(String[] args) {
		System.out.println("Tipos de dados em Java: \n" +
	            "\nMenor Byte: " + Byte.MIN_VALUE +
	            "\nMaior Byte: " + Byte.MAX_VALUE +
	            "\nMenor Short Int: " + Short.MIN_VALUE +
	            "\nMaior Short Int: " + Short.MAX_VALUE +
	            "\nMenor Int: " + Integer.MIN_VALUE +
	            "\nMaior Int: " + Integer.MAX_VALUE +
	            "\nMenor Long: " + Long.MIN_VALUE +
	            "\nMaior Long:" + Long.MAX_VALUE +
	            "\nMenor Float: " + Float.MIN_VALUE +
	            "\nMaior Float: " + Float.MAX_VALUE +
	            "\nMenor Double: " + Double.MIN_VALUE +
	            "\nMaior Double: " + Double.MAX_VALUE);
		
		byte tipoByte = 127;  // numerico inteiro
		short tipoShort = 32767; // numerico inteiro
		char tipoChar = 'C'; //texto de um unico caracterer 
		float tipoFloat = 2.6f; //numerico decimal
		double tipoDouble = 3.59; //numerico decimal
		int tipoInt = 2147483647; //numerico inteiro
		long tipoLong = 9223372036854775807L; //numerico inteiro 
		boolean tipoBooleano = true; //booleano
		System.out.println("Valor do tipoByte = " + tipoByte);
		System.out.println("Valor do tipoShort = " + tipoShort);
		System.out.println("Valor do tipoChar = " + tipoChar);
		System.out.println("Valor do tipoFloat = " + tipoFloat);
		System.out.println("Valor do tipoDouble = " + tipoDouble);
		System.out.println("Valor do tipoInt = " + tipoInt);
		System.out.println("Valor do tipoLong = " + tipoLong);
		System.out.println("Valor do tipoBooleano = " + tipoBooleano);
		
		//uma varivel com maior escopo ( maior valor) pode receber outra de menor valor ( menor escopo )
	    byte byteEmenorQueShor = 100;
	    short shortEmaiorQueByte = byteEmenorQueShor;
	    // o contrario não se aplica, se eu tentar setar um valor maior em uma variavel de tipo menor teremos erro de compilacao
	    // byteEmenorQueShor = shortEmaiorQueByte;  //esta linha nao compila pois  byte é menor que chart
	    
	    /*É possivel fazer com que uma variavel de menor tamanho receba os dados de outra de maior tamanho utilizando um recurso chamado CAST,
	    mas neste caso o compilador nao coonsegue garantir que o valor recebido esta correto, é responsabilidade do desenvolvedor garantir a integridade ds dado */
	    short shortValue = 99;
	    byte byteRecebeShort = (byte) shortValue;  //o cast é forcar o tipo da variavel colocado antes do valor recebido o tipo da variavel entre parenteses : (byte)
	    System.out.println("Uso de cast de short para byte. valor="+byteRecebeShort);
	    
	    /*Se o for recebido atravez do cast for maior que o suportado, o compilador vai aceitar, mas teremos um problema de integridade,
	    no caso a seguir, o valor 130 é maior que o suportado pelo campo byte (127), logo teremos um valor incorreto setado na variavel */
	    short shorMaiorQueByte = 130;
	    byte valorByteIncorreto = (byte) shorMaiorQueByte; // o valor armazenado no byte nao é 130
	    System.out.println("Cast incorreto, o valor do shor = "+ shorMaiorQueByte + " mas o valor recebido no byte é "+ valorByteIncorreto);

	}
}
