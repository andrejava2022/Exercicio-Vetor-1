package application;

import java.util.Scanner;

public class Program {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos numeros você vai digitar? ");
		int n = sc.nextInt();
		
		if(n<=10 && n>0) {
			int[] vetor = new int[n];
		}else {
			System.out.println("Opção invalida!");
			System.exit(0);
		}
		int[] vetor = new int[n];

		for(int i=0; i<n ; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextInt();
		}
		
		System.out.println("NUMEROS NEGATIVOS:");
		
		for(int i=0; i<n ; i++) {
			if(vetor[i]<0) {
				System.out.println(vetor[i]);
			}
		}
		
		sc.close();
	}

}
