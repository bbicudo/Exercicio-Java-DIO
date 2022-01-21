import java.util.ArrayList;
import java.util.List;



public class ListaSuspeitos {

	protected List<Suspeito> suspeitos = new ArrayList<>();
	
	public void classifica() {
		
		int positivas;
		
		for(Suspeito suspeito: suspeitos) {
			
			positivas = 0;
			
			System.out.println("=== VEREDITO PARA O RÉU: " + suspeito.getNome() + " ===");

			if(suspeito.getTelefonou().equalsIgnoreCase("s")) {
				positivas+=1;
			}
			
			if(suspeito.getEsteveLocal().equalsIgnoreCase("s")) {
				positivas+=1;
			}
				
			if(suspeito.getMoraPerto().equalsIgnoreCase("s")) {
				positivas+=1;
			}
				
			if(suspeito.getTinhaDivida() .equalsIgnoreCase("s")) {
				positivas+=1;
			}
					
			if(suspeito.getTrabalhou().equalsIgnoreCase("s")) {
				positivas+=1;
			}
			
			if(positivas >=0 && positivas <=1) {
				System.out.println("Inocente");
			}else if(positivas == 2) {
				System.out.println("Suspeito");
			}else if(positivas>=3 && positivas <=4) {
				System.out.println("Cumplice");
			}else {
				System.out.println("Assassino!");
			}
			
		}
		
	}
	
	
}
