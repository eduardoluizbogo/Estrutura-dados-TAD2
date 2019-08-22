package bcc;

import java.util.Scanner;

public class Ex7_ed {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int quant = 0;
		float aux = 0;
		float menornum=0;
		float maiornum=0;
		int contmenor=0;
		int contmaior=0;
		boolean ver=true;
		
			System.out.println("Quantos numeros voce deseja cadastrar?");
			quant = entrada.nextInt();
			
			float[] numeros = new float[quant];
			
			System.out.println("Insira os numeros: ");
			for (int i = 0; i < numeros.length; i++) {
				numeros[i] = entrada.nextInt();
			}
			for (int i = 0; i < (numeros.length-1); i++) {
				for (int j = i+1; j < numeros.length; j++) {
					if(numeros[i]>numeros[j]) {
						aux = numeros[i];
						numeros[i]=numeros[j];
						numeros[j]=aux;			
					}
				}
			}						
			for (int j = 0; j < numeros.length; j++) {

					if(ver) {
						menornum = numeros[j];
						maiornum = numeros[j];
						ver = false;
					}
					if(numeros[j] == menornum) {
						menornum = numeros[j];
						contmenor++;	
					}					
					if(numeros[j] < menornum) {
						menornum = numeros[j];
						contmenor = 1;
					}
					if(numeros[j] == maiornum) {
						maiornum = numeros[j];
						contmaior++;
					}
					if(numeros[j] > maiornum) {
						maiornum = numeros[j];
						contmaior = 1;
					}		
			}
			
			System.out.println("O menor numero e: "+menornum+" e ele aparece "+contmenor+" vezes");
			System.out.println("O maior numero e: "+maiornum+" e ele aparece "+contmaior+" vezes");

			entrada.close();	
	}
}