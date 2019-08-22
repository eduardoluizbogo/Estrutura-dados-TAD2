package bcc;

import java.util.Scanner;

public class Ex8_ed {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		final int TAM1=4;
		int cont=1;
		float aux=0;
		String auxalf;
		String nomeaux;
		String nomeaux2;
		String[] reprovados = new String[TAM1];
		String[] nome = new String[TAM1];
		String[] nomemedia = new String[TAM1];
		float[] nota1 = new float[TAM1];
		float[] nota2 = new float[TAM1];
		float[] media = new float[TAM1];
		
		System.out.println("Insira as informacoes ---->");
		System.out.println("--------------------------------");
	
		for (int i = 0; i < TAM1; i++) {
			System.out.println("Insira o nome, nota 1 e nota 2 da pessoa: "+(i+1));
			nome[i] = entrada.next();
			nomemedia[i] = nome[i];
			nota1[i] = entrada.nextFloat();
			nota1[i] = nota1[i] * 2;
			nota2[i] = entrada.nextFloat();
			nota2[i] = nota2[i] * 3;
		}
		
		for (int i = 0; i < TAM1; i++) {
			media[i] = (nota1[i] + nota2[i]) / 5;	
		}
	
		for (int i = 0; i < (media.length-1); i++) {
			for (int j = i+1; j < media.length; j++) {
				if(media[i]>media[j]) {
					aux = media[i];
					nomeaux = nomemedia[i];
					media[i]=media[j];
					nomemedia[i] = nomemedia[j];
					media[j]=aux;
					nomemedia[j] = nomeaux;				
				}
			}
		}
		
		for (int i = 0; i < media.length; i++) {
			System.out.println((i+1)+" - A media do aluno "+nomemedia[i]+" e: "+media[i]);
		}
		System.out.println("--------------------------------");
		
		for (int i = 0; i < (nota1.length-1); i++) {
			for (int j = i+1; j < nota1.length; j++) {
				if(nota1[i]>nota1[j]) {
					aux = nota1[i];
					nomeaux2 = nome[i];
					nota1[i]=nota1[j];
					nome[i] = nome[j];
					nota1[j]=aux;
					nome[j] = nomeaux2;
					
				}
			}
		}
		for (int i = 0; i < nota1.length; i++) {
			System.out.println((i+1)+" - O aluno "+nome[i]+" tem a primeira nota: "+nota1[i] / 2);
		}
		
		System.out.println("--------------------------------");

		for (int i = 0; i < TAM1; i++) {
			if(media[i] < 7)
				reprovados[i] = nomemedia[i];
			else
				reprovados[i] = "acima";
		}
		
		for (int i = 0; i < (reprovados.length-1); i++) {
			for (int j = i+1; j < reprovados.length; j++) {
				if(reprovados[i].compareTo(reprovados[j]) > 0) {
					auxalf = reprovados[i];
					reprovados[i] = reprovados[j];
					reprovados[j] = auxalf;
					
				}
			}
		}	
		
		for (int i = 0; i < TAM1; i++) {
			if(!reprovados[i].equals("acima")) {			
				System.out.println(cont+" "+reprovados[i]);
				cont++;
			}
		}
		entrada.close();
	}
}