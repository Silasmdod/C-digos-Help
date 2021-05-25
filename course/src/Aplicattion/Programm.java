package Aplicattion;
import java.util.Date;
/*Aprendendo a usar o enum
 * Autor:Silas Matheus
*/
import java.util.Locale;
import java.util.Scanner;

import Eenums.OrderStatus;
import Entities.Order;

public class Programm {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("=======================================");
		
		Order order = new Order(1080, new Date(), OrderStatus.AGUARDANDO_PAGAMENTO);
		
		System.out.println(order);
		
		OrderStatus os1 = OrderStatus.ENTREGUE;
		
		OrderStatus os2 = OrderStatus.valueOf("ENTREGUE");
		
		System.out.println(os1);
		
		System.out.println(os2);
	}

	
	
}
