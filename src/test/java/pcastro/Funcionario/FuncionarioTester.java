package pcastro.Funcionario;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith (JUnitParamsRunner.class)
public class FuncionarioTester {
	@Test
	@Parameters ({"5000.00, 4000.00"})//??
	public void FuncionarioTest(double val, double resp) {
		Funcionario f1 = new Funcionario(10, "Pedro", 5000.0, 2, true);
		double observed = f1.getSalarioLiquido();
		assertEquals(observed, resp);
	}
}
