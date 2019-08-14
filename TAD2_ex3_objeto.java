package segundaTAD;

import java.util.Scanner;

public class TAD2_ex3_objeto {

	static Scanner entrada = new Scanner(System.in);

	final static int TAM1=2;
	final static int TAM2=3;
	static int cont=0;
	static float somarenda=0;
	static float mediarenda=0;
	static int contrenda=0;
	
	static String[][] vet = new String[TAM1][TAM2];
	
	public static void inserirnome() {
		for (int i = 0; i < TAM1; i++) {
			for (int j = 0; j < TAM2; j++) {
				if(j == 0) {
					System.out.println("Insira o nome: ");
					vet[i][j] = entrada.next();
				}
				if(j == 1) {
					System.out.println("Insira o o ano de nascimento: ");
					vet[i][j] = entrada.next();
					int h = Integer.parseInt(vet[i][j]);
					if(h > 1980 && h < 2000)
						cont++;
				}
				if(j == 2) {
					System.out.println("Insira a renda mensal do cliente: ");
					vet[i][j] = entrada.next();	
					somarenda += Integer.parseInt(vet[i][j]);
					
				}
			}		
	}
		mediarenda = somarenda / TAM1;
		for (int i = 0; i < TAM1; i++) {
			for (int j = 2; j < TAM2; j++) {
				if(Integer.parseInt(vet[i][j]) > mediarenda)
					contrenda++;
		
			}
		}
		System.out.println(cont+" nasceu(ram) entre 1980 e 2000.");
		System.out.println(contrenda+" pessoas ganham mais que a media.");
}
	public static void consultarlista() {
		for (int i = 0; i < TAM1; i++) {
			for (int j = 0; j < TAM2; j++) {
				if(j == 0)
					System.out.println("Nome: "+vet[i][j]);
				if(j == 1)
					System.out.println("Endereco: "+vet[i][j]);
				if(j == 2)
					System.out.println("Telefone: "+vet[i][j]);	
			}
		}
	}
	public static void excluirlista() {
		for (int i = 0; i < TAM1; i++) {
			for (int j = 0; j < TAM2; j++) {
				vet[i][j] = null;
			}
		}
	}
}

