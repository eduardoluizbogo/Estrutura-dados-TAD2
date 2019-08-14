package segundaTAD;

import java.util.Scanner;

public class TAD2_ex3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int select=0;
		boolean sair=true;
	
		do {
			
		System.out.println("Digite 1-Inserir, 2-Conferir, 3-Excluir e 4-Sair --->");
		select = entrada.nextInt();
		
		switch(select) {
		case 1:
			TAD2_ex3_objeto.inserirnome();
			break;
		case 2:
			TAD2_ex3_objeto.consultarlista();
			break;
		case 3:
			TAD2_ex3_objeto.excluirlista();
			break;
		case 4: 
			sair = false;
			break;
		}		
		}while(sair == true);
		System.out.println("Voce saiu!");
		
		entrada.close();
}
}
