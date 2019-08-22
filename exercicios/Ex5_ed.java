package bcc;

import java.util.Scanner;

public class Ex5_ed {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int select=0;
		int tam=0;
	
		
		System.out.println("Insira 1-Ordenacao por inteiros e 2-Ordenacao por caracter -->");
		select = entrada.nextInt();
		
		
		System.out.println("Insira o tamanho do vetor");
		tam = entrada.nextInt();
		
		int[] vetI=new int[tam];
		char[] vetC=new char[tam];
		int aux=0;
		
		switch(select) {
		case 1:
			System.out.println("Insira os numeros: ");
			for (int i = 0; i < tam; i++) {
				vetI[i] = entrada.nextInt();	
			}
			
			System.out.println("Insira 3-Ordenacao crescente e 4-Ordenacao decrescente -->");
			select = entrada.nextInt();
			switch(select) {
			case 3:
				

				for (int i1 = 0; i1 < (vetI.length-1); i1++) {
					for (int j = i1+1; j < vetI.length; j++) {
						if(vetI[i1]>vetI[j]) {
							aux = vetI[i1];
							vetI[i1]=vetI[j];
							vetI[j]=aux;
							}	
						}
					}
				for (int i = 0; i < vetI.length; i++) {
					System.out.println(vetI[i]);
				}
				break;
			case 4:

				for (int i1 = 0; i1 < (vetI.length-1); i1++) {
					for (int j = i1+1; j < vetI.length; j++) {
						if(vetI[i1]<vetI[j]) {
							aux = vetI[i1];
							vetI[i1]=vetI[j];
							vetI[j]=aux;
							}	
						}
					}
				for (int i = 0; i < vetI.length; i++) {
					System.out.println(vetI[i]);
				}
									
				break;
			}
						
			break;
		case 2:
			System.out.println("Insira os caracteres: ");
			for (int i = 0; i < tam; i++) {
				vetC[i] = entrada.next().charAt(0);
			}
			System.out.println("Insira 3-Ordenacao crescente e 4-Ordenacao decrescente -->");
			select = entrada.nextInt();
			switch(select) {
			case 3:
				for (int i1 = 0; i1 < (vetC.length-1); i1++) {
					for (int j = i1+1; j < vetC.length; j++) {
						if(vetC[i1]>vetC[j]) {
							aux = vetC[i1];
							vetC[i1]=vetC[j];
							vetC[j]=(char) aux;
							}	
						}
					}
				for (int i = 0; i < vetC.length; i++) {
					System.out.println(vetC[i]);
				}
				break;
			case 4:

				for (int i1 = 0; i1 < (vetI.length-1); i1++) {
					for (int j = i1+1; j < vetI.length; j++) {
						if(vetC[i1]<vetC[j]) {
							aux = vetC[i1];
							vetC[i1]=vetC[j];
							vetC[j]=(char) aux;
							}	
						}
					}
				for (int i = 0; i < vetC.length; i++) {
					System.out.println(vetC[i]);
				}
									
				break;
			}		
			break;
		default:
			System.out.println("Voce inseriu um numero invalido!");	
			break;
		}
		
		entrada.close();
		
		}
	}


