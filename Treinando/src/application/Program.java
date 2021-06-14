package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Entities.Department;
import Entities.HourContract;
import Entities.Worker;

public class Program {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
		System.out.println("Entre com o nome do departamento");
		String departmantNome = sc.nextLine();
		System.out.println("Entre Worker data:");
		System.out.println("Name");
		String workerNome = sc.nextLine();
		System.out.println("Level");
		String workerLevel = sc.nextLine();
		System.out.println("Base salary");
		String baseSalary = sc.nextLine();
		Worker worker = new Worker (workerNome, String.valueOf(workerLevel), baseSalary, new Department(departmantNome));
		
		
	System.out.println("How many contracts to this worker?");
	int n = sc.nextInt();
	
	for(int i=1; i<n; i++) {
		
		System.out.println("Enter contract #" + 1 + "data:" );
		System.out.print("Date (DD/MM/YYYY):");
		Date contractDate = sdf.parse(sc.next());
		System.out.print("Valor por hora:");
		double valuePerHour = sc.nextDouble();
		System.out.println("Duration (hours): ");
		int hours = sc.nextInt();
		HourContract contract  = new HourContract(contractDate, valuePerHour, hours);
		worker.addContract contract1;
		
		
		
		
		
		
		
		
	}
		
		sc.close();
	}

}
