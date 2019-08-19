package exercicios;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int tamanho=0;
		int aux;
		
		System.out.println("Insira o tamanho do vetor: ");
		tamanho = entrada.nextInt();
		
		int[] vet = new int[tamanho];
		
		for (int i = 0; i < vet.length; i++) {
			vet[i] = entrada.nextInt();
		}
		for (int i = 0; i < (vet.length-1); i++) {
			for (int j = i+1; j < vet.length; j++) {
				if(vet[i]<vet[j]) {
					aux = vet[i];
					vet[i]=vet[j];
					vet[j]=aux;
					
				}
			}
		}
		for (int i = 0; i < vet.length; i++) {
			System.out.println(vet[i]);
		}
		entrada.close();
		}
	
}
