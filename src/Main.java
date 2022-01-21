import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//0~1 = inocente
		//2 = suspeito
		//3~4 = cumplice
		//5 = assassina
		
		int investigados = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		ListaSuspeitos lista = new ListaSuspeitos();

		System.out.println("Quantos suspeitos serão investigados?");
		
		investigados = scanner.nextInt();
		
			while(investigados > 0) {
			
			Suspeito suspeito = new Suspeito();	
				
			suspeito.entrevista();
			lista.suspeitos.add( suspeito);
			
			investigados--;
		
		}
			
		lista.classifica();	
			
		scanner.close();	
		
	}

}
