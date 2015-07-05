package teste;



import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.edu.iftm.simulador.Veiculo;

public class Teste {

	
	@Test
	public void test() {
		Veiculo veiculo = new Veiculo("Marcos", 2000, 10000, 2000, 36, 0.02);
		
		
		double atual = 313.86;
		double esperado = veiculo.simulador();
		
		assertEquals(atual, esperado, 0.09);
	}
	
	@Test
	public void testFinanReprovado(){
		Veiculo veiculo = new Veiculo("Marcos", 2000, 10000, 2000, 10, 0.02);
		
		double atual = 890.61;
		double esperado = veiculo.simulador();
		
		assertEquals(atual, esperado, 0.09);
		
		
	}
	
	@Test
	public void  TestTotalPrestacoes(){
		Veiculo veiculo = new Veiculo("Marcos", 2000, 10000, 2000, 36, 0.02);
		
		veiculo.simulador();
		double atual = 11299.06;
		double esperado = veiculo.totalPrestacoes();
		
		
		assertEquals(atual, esperado, 0.09);
		
	}
	
	@Test
	public void testeSetGet(){
		Veiculo veiculo = new Veiculo("Marcos", 2000, 10000, 2000, 36, 0.02);
		
				
		double atual = 14036.02;
		double esperado = veiculo.getSalario() + veiculo.getValor() + veiculo.getValorEntrada() +
						veiculo.getNumPrestacoes() + veiculo.getTaxaJuros();
		
		assertEquals(atual, esperado, 0.0);
		
	}
	
	
	

}
