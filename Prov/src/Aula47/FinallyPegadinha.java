package Aula47;

public class FinallyPegadinha {
	public static void main(String[] args) {
		int[] numeros = {4, 8, 16, 32, 64, 128};
		int[] denominador = {2, 0, 4, 8, 0};
		for(int i=0; i<numeros.length; i++) {
				try {
			System.out.println(numeros[i] + "/" + denominador[i] + " = " + (numeros[i]/denominador[i]));
			
					System.out.println(numeros[i]);
			
				}
				catch(ArithmeticException e) {
					System.out.println("erro ao dividir por zero");
					System.exit(0);//isso � como se eu puxasse o cabo da tomada
					//ele est� terminando o c�digo
					//o finally n�o � executado depois disso
				}
				catch(ArrayIndexOutOfBoundsException e) {
					System.out.println("Posi��o do array invalida");
					System.exit(0);

				}
				catch(NullPointerException e) {
					System.out.println("Posi��o do array invalida");
					System.exit(0);
					}

				finally {
					System.out.println("Essa Linha � impressa sempre ap�s o try ou o catch");
					System.out.println();
				}
		}
		
	}

}
