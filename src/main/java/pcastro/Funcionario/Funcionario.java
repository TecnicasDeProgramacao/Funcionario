//Local insalubre 10% sobre o salario base, 1% sobre o salario base para cada dependente declarado
//Salario bruto = salariobase + adicionais
//Salario liquido = salarioBruto - (INSS + imposto de renda devidos)
//INSS 4,5% do salario base limitado ao teto 5000,00
//Imposto de renda sobre o salario base  2000 isenta, 2001 até 5000 paga 12% e superior a 5000 paga 27,5%

package pcastro.Funcionario;

public class Funcionario {
	private int matricula = 0;
	private String nome = "";
	private double salarioBase = 0.0;
	private int nroDependentes = 0;
	private boolean insalubridade = false;
	
	public Funcionario(int matricula, String nome, double salarioBase, int nroDependentes, boolean insalubridade) {
		this.matricula = matricula;
		this.nome = nome;
		this.salarioBase = salarioBase;
		this.nroDependentes = nroDependentes;
		this.insalubridade = insalubridade;
	}
	
	public int getMatricula() {
		return matricula;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getSalarioBase() {
		return salarioBase;
	}
	
	public int getNroDependentes() {
		return nroDependentes;
	}
	
	public boolean getInsalubridade() {
		return insalubridade;
	}
	
	public double getSalarioBruto() {
		double salarioBruto = 0.0;
		if(getInsalubridade()) {
			salarioBruto = salarioBase * 1.1;
		}
		if(getNroDependentes() > 0) {
			salarioBruto += salarioBase * (getNroDependentes()/100.0);
		}
		return salarioBruto;
	}
	
	public double getSalarioLiquido() {
		double salarioLiquido = 0.0;
		double INSS = 0.045;
		double descontoINSS = getSalarioBase() * INSS;
		double impostoDeRenda = 0.0;
		if(getSalarioBase() > 5000.00){
			descontoINSS = 5000.00 * INSS;
		}
		if(getSalarioBase() <= 2000.00) {
			salarioLiquido = getSalarioBruto() - descontoINSS;
		}
		else if(getSalarioBase() > 2000.00 && getSalarioBase() < 5000.00) {
			impostoDeRenda = getSalarioBase() * 12/100;
			salarioLiquido = getSalarioBruto() - (impostoDeRenda + descontoINSS); 
		}
		else if(getSalarioBase() >= 5000.00) {
			impostoDeRenda = getSalarioBase() * 27.5/100.0;
			salarioLiquido = getSalarioBruto() - (impostoDeRenda + descontoINSS);
		}
		return salarioLiquido;
	}
	
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario(10, "Pedro", 5000.0, 2, true);
		System.out.println("Salário Bruto: " +f1.getSalarioBruto());
		System.out.println("Salário Base: " +f1.getSalarioBase());
		System.out.println("Salário Líquido: " +f1.getSalarioLiquido());
		
	}
}
