package bcc;

import java.util.Scanner;

public class Ex6_ed {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int quant=0;
		float aux=0;
		String auxnome;
		
		System.out.println("Insira a quantidade de funcionarios: ");
		quant = entrada.nextInt();
		
		String[] nome = new String[quant];
		float[] salario = new float[quant];
		
		for (int i = 0; i < quant; i++) {
			System.out.println("Nome do funcionario "+(i+1));
			nome[i] = entrada.next();
			System.out.println("Salario do funcionario "+(i+1));
			salario[i] = entrada.nextFloat();
		}
		System.out.println("\n");
		for (int i1 = 0; i1 < (salario.length-1); i1++) {
			for (int j = i1+1; j < salario.length; j++) {
				if(salario[i1]>salario[j]) {
					aux = salario[i1];
					salario[i1]=salario[j];
					salario[j]=aux;
					}	
				}
			}
		for (int i = 0; i < salario.length; i++) {
			System.out.println(salario[i]);
		}
		for (int i1 = 0; i1 < (salario.length-1); i1++) {
			for (int j = i1+1; j < salario.length; j++) {
				if(salario[i1]<salario[j]) {
					aux = salario[i1];
					salario[i1]=salario[j];
					salario[j]=aux;
					}	
				}
			}
		for (int i = 0; i < (nome.length-1); i++) {
			for (int j = i+1; j < nome.length; j++) {
				if(nome[i].compareTo(nome[j]) > 0) {
					auxnome = nome[i];
					nome[i] = nome[j];
					nome[j] = auxnome;
					
				}
			}
		}
		for (int i = 0; i < nome.length; i++) {
			System.out.println(nome[i]);
		}
	entrada.close();
	}

}
