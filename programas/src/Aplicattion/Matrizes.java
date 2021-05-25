package Aplicattion;

import java.util.Locale;
import java.util.Scanner;

public class Matrizes {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		// fazendo matriz
		System.out.print("Escolha o número de colunas e linhas: ");
		int n = sc.nextInt(); //escolher a quantidade de colunas e linhas
		int [][] mat = new int[n][n];// crianto a matriz 
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				System.out.println();
				mat[i][j] = sc.nextInt();
				
				System.out.println();
			}
			
		}
		System.out.println();
		System.out.println("Main diagonal:");
		for (int i=0; i<mat.length; i++) {
			System.out.print(mat[i][i] + " ");
			
		}
		System.out.println();
		
		int count = 0;
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {//para percorrer a coluna no vetor
				if (mat[i][j] < 0) {
					count++;
				}
			}
			
		}
		System.out.println("Negative numbers = " + count);
		
		
		sc.close();
	}
	

}
