 package segundaTAD;

import java.util.Scanner;

public class TAD2_ex2_objeto {
	
	static Scanner entrada = new Scanner(System.in);

	final static int TAM1=5;
	final static int TAM2=3;

	static String[][] vet = new String[TAM1][TAM2];
	
	public static void inserir() {
		for (int i = 0; i < TAM1; i++) {
			for (int j = 0; j < TAM2; j++) {
				if(j == 0) {
					System.out.println("Insira o nome: ");
					vet[i][j] = entrada.next();
				}
				if(j == 1) {
					System.out.println("Insira o endereco: ");
					vet[i][j] = entrada.next();
				}
				if(j == 2) {
					System.out.println("Insira o telefone: ");
					vet[i][j] = entrada.next();		
				}
			}
			
		}
	}
	public static void consultar() {
		for (int i = 0; i < TAM1; i++) {
			for (int j = 0; j < TAM2; j++) {
				if(j == 0)
					System.out.println((i+1)+"- Nome: "+vet[i][j]);
				if(j == 1)
					System.out.println((i+1)+"- Endereco: "+vet[i][j]);
				if(j == 2)
					System.out.println((i+1)+"- Telefone: "+vet[i][j]);	
			}
		}
	}
	public static void excluir() {
		for (int i = 0; i < TAM1; i++) {
			for (int j = 0; j < TAM2; j++) {
				vet[i][j] = null;
			}
		}
	}
}

