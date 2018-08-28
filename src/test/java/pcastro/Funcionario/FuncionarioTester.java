package pcastro.Funcionario;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith (JUnitParamsRunner.class)
public class FuncionarioTester {
	@Test
	@Parameters ({"1,Joao,1000,0,false,955","1,Joao,2000,0,false,1910","1,Joao,2500,0,false,1000","1,Joao,1000,0,false,550",
		"1,Joao,1000,0,false,550","1,Joao,1000,0,false,550","1,Joao,1000,0,false,550",})//??
	public void FuncionarioTest(int mat, String nome, double base, int dep, boolean ins, double liq) {
		Funcionario f1 = new Funcionario(mat, nome, base, dep, ins);
		double observed = f1.getSalarioLiquido();
		assertEquals(liq, observed);
	}
}
