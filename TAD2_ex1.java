package segundaTAD;

import java.util.Scanner;

public class TAD2_ex1 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int dia=0;
		int mes=0;
		int ano=0;
		
		TAD2_ex1_objeto verificadia = new TAD2_ex1_objeto();
		TAD2_ex1_objeto escrevedia = new TAD2_ex1_objeto();
		TAD2_ex1_objeto validadata = new TAD2_ex1_objeto();

		

		System.out.print("Insira o dia: ");
		dia = entrada.nextInt();
		System.out.print("Insira o mes: ");
		mes = entrada.nextInt();
		System.out.print("Insira o ano: ");
		ano = entrada.nextInt();
		
		verificadia.valid(dia,mes,ano);
		
		System.out.print("Insira o dia: ");
		dia = entrada.nextInt();
		System.out.print("Insira o mes: ");
		mes = entrada.nextInt();
		System.out.print("Insira o ano: ");
		ano = entrada.nextInt();
		
		escrevedia.escrever(dia,mes,ano);
		
		String data=" ";
		String diaS=" ";
		String mesS=" ";
		String anoS=" ";
		
		System.out.println("Insira a data (DD/MM/AAAA)");
		data=entrada.next();
		
		validadata.validacao(data,diaS,mesS,anoS);
		
		entrada.close();
		
	}

}
