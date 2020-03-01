
public class Main {

	public static void main(String[] args) {
		
		Secretaria S = new Secretaria("Lais", "1332655655", "23", "1562", 2800);
		System.out.println("Salario Secretária é:");
		S.calculaSalario();
		
		
		Vendedor v = new Vendedor ("Laís", "2625615615", "25", "6512", 2500, 4565);
		System.out.println("Salario Vendedor é:");
		
		v.calculaSalario();
		v.calculaComissao();
		
		
		
		
		
		
		
	
	}
}
