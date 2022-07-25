package com.ezequiel.aulas.aula14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Datas {

	public static void main(String[] args) throws ParseException {
		Date dtAtual = new Date();
		System.out.println(dtAtual);
		dtAtual = new Date(2010, 1, 1); // o método new Date com parametros de data foi descontinuado (deprecated), 
		// por este motivo o métodp está riscado
		
		String dataStr = "26/10/1987 20:20:25";
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		
		Date novaData = format.parse(dataStr);
		System.out.println(novaData);
		
		System.out.println(format.format(novaData));
		
		SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(format2.format(novaData));
		
		String dt3Str = "1990-05-20 13:20:25";
		Date dt3 = format2.parse(dt3Str);
		System.out.println(dt3);
		
		//o format deve seguir o mesmo formato de data q ser lido/parseado, a linha abaixo vai apresentar uma exception
		// do tipo ParseException
		//System.out.println(format2.parse(dataStr));
		
		System.out.println(novaData.getTime());
		System.out.println(dt3.getTime());
		
		System.out.println(new Date(dt3.getTime()));
	}
}
