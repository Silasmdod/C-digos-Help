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
					System.exit(0);//isso é como se eu puxasse o cabo da tomada
					//ele está terminando o código
					//o finally não é executado depois disso
				}
				catch(ArrayIndexOutOfBoundsException e) {
					System.out.println("Posição do array invalida");
					System.exit(0);

				}
				catch(NullPointerException e) {
					System.out.println("Posição do array invalida");
					System.exit(0);
					}

				finally {
					System.out.println("Essa Linha é impressa sempre após o try ou o catch");
					System.out.println();
				}
		}
		
	}

}
