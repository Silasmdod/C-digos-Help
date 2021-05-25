package Aplicattion;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class ComomudarData {
	public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(sdf.format(d));
		
		//aprendendo a manipular o canlendário
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);//colocando a data no calendário chamado cal
		//cal.add(Calendar.HOUR_OF_DAY, 4);//adicionando quantas horas do dia
		//d = cal.getTime();//colocando no horário dentro da variável d
		
		int minutes = cal.get(Calendar.MINUTE);
		ibnt month = 1 + cal.get(Calendar.MONTH);
		System.out.println(sdf.format(d));
		System.out.println("Minutes:" + minutes);
		System.out.println("Month: " + month);
		
		
	}

}
