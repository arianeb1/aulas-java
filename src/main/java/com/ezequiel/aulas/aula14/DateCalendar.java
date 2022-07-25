package com.ezequiel.aulas.aula14;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateCalendar {

	static SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
	
	public static void main(String[] args) {
		Calendar dataAtualLocal = Calendar.getInstance(); // data atual do timezone da maquina
		System.out.println(dataAtualLocal);


		//Data atual por timezone
		Calendar dataAtualBytimezone = Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
		System.out.println(dataAtualBytimezone);
		
		//setar uma data
		Calendar date = Calendar.getInstance();
		date.set(Calendar.YEAR, 2000); // year
		date.set(Calendar.MONTH, 0); //setando janeiro
		date.set(Calendar.MONTH, Calendar.JANUARY); //setando janeiro
		date.set(Calendar.DAY_OF_MONTH, 1);
		date.set(2022, 4, 30);
		date.set(2022, Calendar.MAY, 30, 19, 27, 30);
		//set baseado em um date
		date.setTime(new Date());
		date.setTimeInMillis(new Date().getTime());
		
		System.out.println(format.format(date.getTime()));
		
		//soma e subtrai valores de uma data, baseado no fied escolhido ( anim,mes, dia do mes ...)
		date.add(Calendar.DAY_OF_MONTH, 1);
		System.out.println(format.format(date.getTime()));
		
		date.add(Calendar.DAY_OF_MONTH, -2);
		System.out.println(format.format(date.getTime()));
		
		System.out.println(date.after(Calendar.getInstance()));
		System.out.println(date.before(Calendar.getInstance()));
		
		//compara duas datas, recomendado usar equals
		System.out.println(Calendar.getInstance().equals(Calendar.getInstance()));
		
		//pega um atributo de data de acordo com o campo escolhido
		System.out.println(date.get(Calendar.YEAR));
		System.out.println(date.get(Calendar.DAY_OF_YEAR));
		
		//pega o valor maximo para o campo escolhido
		System.out.println(date.getMaximum(Calendar.DAY_OF_MONTH));
		
		//pega o valor minimo para o campo escolhido
		System.out.println(date.getActualMinimum(Calendar.DAY_OF_MONTH));
		
		//System.out.println(date.getCalendarType());
		
		//retorna um date baseado no calendar
		System.out.println(date.getTime());
		
		System.out.println(new Date(date.getTimeInMillis()));
		
		String calendarString = date.toString();
		System.out.println(calendarString);
		
	}
}
