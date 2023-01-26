package ejercicios12Period;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class InstantEj {

	public static void main(String[] args) {
		Instant base = Instant.now();
		//añadir 10 segundos
		Instant m10s = base.plus(10, ChronoUnit.SECONDS);
		
		long segundos = base.until(m10s, ChronoUnit.SECONDS);
		
		System.out.println("base: " + base);
		System.out.println("Más de 10 segundos: " + m10s);
		System.out.println("Until en segundos: " + segundos);
		
		System.out.println("----------------");
		
		//Otro ejemplo con Period
		LocalDate d1 = LocalDate.of(2022,Month.AUGUST, 13);
		System.out.println("d1: " + d1);
		
		LocalDate d2 = LocalDate.of(2024,Month.APRIL, 23);
		System.out.println("d1: " + d2);
		
		Period p = d1.until(d2);
		System.out.println("Period :" + p);
		
		long dias = d1.until(d2, ChronoUnit.DAYS);
		System.out.println("Dias: " +dias);

	}

}
