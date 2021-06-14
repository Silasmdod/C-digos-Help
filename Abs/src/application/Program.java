package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.Circle;
import Entities.Rectangle;
import Entities.Shape;
import Entities.enums.Color;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		List<Shape> list = new ArrayList<>();
		System.out.print("Entre com o número das formas");
		int n = sc.nextInt();
		
		
		for(int i=1; i<=n; i++) {
			System.out.println("forma #" + i + "data:");
			System.out.print("Retangulo ou circulo (r/c)");
			char ch = sc.next().charAt(0);
			System.out.print("Cor (BLACK/BLUE/RED):");
			Color color = Color.valueOf(sc.next());
			if (ch == 'r') {
				System.out.println("base: ");
				double base = sc.nextDouble();
				System.out.println("altura: ");
				double altura = sc.nextDouble();
				list.add(new Rectangle(color, base, altura));
			}
			else {
				System.out.println("Radius: ");
				double radius = sc.nextDouble();
				list.add(new Circle(color, radius));
				
			
			}
		}
		
		
		System.out.println();
		System.out.println("Forma das áreas: ");
		for (Shape shape : list) {
			System.out.println(String.format("%.2f", shape.area()));
			
		}
		
		
		
		
		sc.close();		
	}

}
