package com.ezequiel.aulas.aula14;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.TemporalField;

public class DateLocalDateTime {

	public static void main(String[] args) {
		LocalDateTime localDate = LocalDateTime.now();
		System.out.println("Hora local:"+ localDate);

		LocalDateTime dateUK = LocalDateTime.now(ZoneId.of("Europe/London"));

		System.out.println(dateUK.getHour() - localDate.getHour());

		//lista todas zones ids existentes
//		for (String zoneId : ZoneId.getAvailableZoneIds()) {
//			System.out.println(zoneId);
//		}
		
		ZonedDateTime dateHongkong =  localDate.atZone(ZoneId.of("Hongkong"));
		
		System.out.println(dateHongkong);
		
		System.out.println(localDate.getDayOfMonth());
		System.out.println(localDate.getDayOfYear());
		System.out.println(localDate.getHour());
		System.out.println(localDate.getYear());
		
		System.out.println(localDate.isAfter(dateUK));
		System.out.println(localDate.isBefore(dateUK));
		
		//
		LocalDateTime localDate2 = localDate;
		System.out.println(localDate);
		System.out.println(localDate2);
		
		//um campo do tipo localdatetime é imutavel, qundo realizamos uma operacao, devemos retornar o valor para outro localdate, 
		//caso contrario, o valor nao é alterado,
		// no exemplo a seguir, estamos somando um dia para o localDate2, mas caso nao retornamos o valor para outra varialvel,
		//o calculo é perdido
		System.out.println(localDate2.plusDays(1));
		System.out.println(localDate);
		System.out.println(localDate2);
		
		//neste exemple estamos adicionado um dia a variavel localDate2 e retornando o novo valor para ela mesma.
		localDate2 = localDate2.plusDays(1);
		
		
		localDate2 = LocalDateTime.from(localDate);
		System.out.println(localDate.equals(localDate2));
		
		System.out.println(localDate);
		System.out.println(localDate2);
		
		
		System.out.println(localDate.minusYears(1));
		
		System.out.println(localDate.withDayOfMonth(1));
		System.out.println(localDate.withMonth(12));
		
		System.out.println(localDate.MIN);
		System.out.println(localDate.MAX);
		
		System.out.println(localDate.of(1987, 10, 26, 20, 20));
		
		System.out.println(LocalDateTime.now().of(1987, 10, 26, 20, 20));
		

		LocalDateTime dtNascimento = LocalDateTime.now().of(1987, 10, 26, 20, 20);
		
		System.out.println(localDate.getYear() - dtNascimento.getYear());
		
		
	}
}
