import java.util.Scanner;

public class Suspeito {

	private String nome;
	private String telefonou;
	private String esteveLocal;
	private String moraPerto;
	private String tinhaDivida;
	private String trabalhou;
	
	Scanner scanner = new Scanner(System.in);
	
	/**
	 * @param nome
	 * @param telefonou
	 * @param esteveLocal
	 * @param moraPerto
	 * @param tinhaDivida
	 * @param trabalhou
	 */
	public Suspeito(String nome, String telefonou, String esteveLocal, String moraPerto, String tinhaDivida, String trabalhou) {
		this.nome = nome;
		this.telefonou = telefonou;
		this.esteveLocal = esteveLocal;
		this.moraPerto = moraPerto;
		this.tinhaDivida = tinhaDivida;
		this.trabalhou = trabalhou;
	}
	
	public Suspeito() {
		
	}

	public String getNome() {
		return nome;
	}
	public String getTelefonou() {
		return telefonou;
	}
	public String getEsteveLocal() {
		return esteveLocal;
	}
	public String getMoraPerto() {
		return moraPerto;
	}
	public String getTinhaDivida() {
		return tinhaDivida;
	}
	public String getTrabalhou() {
		return trabalhou;
	}	
	
	public void entrevista() {
		System.out.println("Qual o seu Nome?");
		this.nome = scanner.nextLine();
		
		System.out.println("Telefonou para a vítima nas últimas 24h?");
		this.telefonou = scanner.nextLine();

		System.out.println("Esteve no local nas últimas 24h?");
		this.esteveLocal = scanner.nextLine();

		System.out.println("Mora próximo ao local?");
		this.moraPerto = scanner.nextLine();

		System.out.println("A vítima lhe devia algo?");
		this.tinhaDivida = scanner.nextLine();

		System.out.println("Trabalhou com a vítima durante algum período?");
		this.trabalhou = scanner.nextLine();
	}
	
	@Override
	public String toString() {
		
		return "{" +
					"nome: '" + this.getNome() + '\'' +
					"telefonou: '" + this.getTelefonou() + '\'' +
					"esteveLocal: '" + this.getEsteveLocal() + '\'' +
					"moraPerto: '" + this.getMoraPerto() + '\'' +
					"tinhaDivida: '" + this.getTinhaDivida() + '\'' +
					"trabalhou: '" + this.getTrabalhou() + '\'' +
				"}";
	}
	
		
}
