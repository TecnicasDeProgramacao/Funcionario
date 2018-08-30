package pcastro.Funcionario;

import java.util.ArrayList;
import java.util.Random;

public class CadastroFuncionario {

	private ArrayList<Funcionario> listFuncionarios;
	
	public CadastroFuncionario() {
		Random r = new Random(); 
		listFuncionarios = new ArrayList<>();
		for (int i =0; i < 50; i++) {
			Funcionario f = new Funcionario(i, "Func" + i, (Math.random()*100)*i, 0, r.nextBoolean());
			addFuncionario(f);
		}		
	}
	
	public void addFuncionario(Funcionario f) {
		listFuncionarios.add(f);
	}
	
	public ArrayList<Funcionario> getList(){
		return listFuncionarios;
	}

public static void main(String[] args) {
		CadastroFuncionario c = new CadastroFuncionario();
		for(Funcionario f: c.getList()) {
			System.out.println(f.getMatricula() + " - " + f.getNome() + " - " + f.getSalarioBase());
		}
	}
}



