package pcastro.Funcionario;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CadastroFuncTester {

	private CadastroFuncionario c;
	
	@BeforeEach
	public void inicializa() {
		c = new CadastroFuncionario();		
		c.addFuncionario(new Funcionario(1, "Marcos", 2000, 0, false));
		c.addFuncionario(new Funcionario(2, "Marco", 5000, 0, true));
	}
	
	@Test
	void sizeList() {	
		assertThat(c.getList(),hasSize(50));
	}

}
