package exercicios;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int tamanho=0;
		String aux;
		
		System.out.println("Insira o tamanho do vetor: ");
		tamanho = entrada.nextInt();
		
		String[] vet = new String[tamanho];
		
		for (int i = 0; i < vet.length; i++) {
			vet[i] = entrada.next();
		}
		for (int i = 0; i < (vet.length-1); i++) {
			for (int j = i+1; j < vet.length; j++) {
				if(vet[i].compareTo(vet[j]) < 0) {
					aux = vet[i];
					vet[i] = vet[j];
					vet[j] = aux;
					
				}
			}
		}
		for (int i = 0; i < vet.length; i++) {
			System.out.println(vet[i]);
		}
		entrada.close();
		}
	
}
