
public class Secretaria extends Funcionario {
	

	public Secretaria(String nome, String cpf, String idade, String matricula, double salario) {
		super(nome, cpf, idade, matricula, salario);
		
	}

	@Override
	
	public void calculaSalario() {
		
		 this.setSalarioTotal(this.salario * 0.92);	
		 
		 System.out.println("O salário é: " +this.getSalarioTotal());
		
	}

	@Override
	public void calculaComissao() {
		
		System.out.println("Não existe comissão para secretaria");
		
	}

	
	
	
}
