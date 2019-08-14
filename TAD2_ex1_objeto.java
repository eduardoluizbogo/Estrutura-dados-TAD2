package segundaTAD;

import java.util.Scanner;

public class TAD2_ex1_objeto {


	static Scanner entrada = new Scanner(System.in);
	
		
	public static void valid(int dia,int mes,int ano) {
	
		boolean data=false;
		
		if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 ||mes == 12) {
			if(dia <= 31)
				data = true;
		}
		if(mes == 4 || mes == 2 || mes == 6 || mes == 9 || mes == 11) {
			if(dia <= 30)
				data=true;
		}
		if(data) 
			System.out.println("A data e valida!");	
		else 
			System.out.println("A data NAO e valida!");
		
		if(ano % 4 == 0 )
			System.out.println("O ano e bissexto!");
		else
			System.out.println("O ano nao e bissexto!");
		
		}
		public static void escrever(int dia,int mes,int ano) {

			String mesWrite=" ";
			
			if(mes == 1)
				mesWrite = "Janeiro";
			else if(mes == 2)
				mesWrite = "Fevereiro";
			else if(mes == 3)
				mesWrite = "Marco";
			else if(mes == 4)
				mesWrite = "Abril";
			else if(mes == 5)
				mesWrite = "Maio";
			else if(mes == 6)
				mesWrite = "Junho";
			else if(mes == 7)
				mesWrite = "Julho";
			else if(mes == 8)
				mesWrite = "Agosto";
			else if(mes == 9)
				mesWrite = "Setembro";
			else if(mes == 10)
				mesWrite = "Outubro";
			else if(mes == 11)
				mesWrite = "Novembro";
			else if(mes == 12)
				mesWrite = "Dezembro";
			else
				System.out.println("A data digitada e invalida!");
			
			System.out.println(dia+" de "+mesWrite+" de "+ano);
						
		}
		public static void validacao(String data, String diaS, String mesS, String anoS) {
	
			boolean dataver=false;
			
			diaS = data.substring(0,2);
			mesS = data.substring(3,5);
			anoS = data.substring(6,10);
		
			int dia1 = Integer.parseInt(diaS);
			int mes1 = Integer.parseInt(mesS);
			int ano1 = Integer.parseInt(anoS);
	
			if(mes1 == 1 || mes1 == 3 || mes1 == 5 || mes1 == 7 || mes1 == 8 || mes1 == 10 ||mes1 == 12) {
				if(dia1 <= 31)
					dataver=true;
			}
			if(mes1 == 4 || mes1 == 2 || mes1 == 6 || mes1 == 9 || mes1 == 11) {
				if(dia1 <= 30)
					dataver=true;
			}
			
			if(dataver)
				System.out.println("A data e valida!");
			else
				System.out.println("A data nao e valida!");


			entrada.close();
		}
}
