package Aula47;

public class TestandoFinally {
	public static void main(String[] args) {
		int[] numeros = {4, 8, 16, 32, 64, 128};
		int[] denominador = {2, 0, 4, 8, 0};
		
		for(int i=0; i<numeros.length; i++) {
				try {
			System.out.println(numeros[i] + "/" + denominador[i] + " = " + (numeros[i]/denominador[i]));
				}
				catch(ArithmeticException e) {
					System.out.println("erro ao dividir por zero");
					
				}
				catch(ArrayIndexOutOfBoundsException e) {
					System.out.println("Posição do array invalida");
				}
				finally {
					System.out.println("Essa Linha é impressa sempre após o try ou o catch");
					System.out.println();
				}
		}
		
	}

}
