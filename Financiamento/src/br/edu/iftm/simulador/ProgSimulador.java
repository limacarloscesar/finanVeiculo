package br.edu.iftm.simulador;

public class ProgSimulador {

	public static void main(String[] args) {
		Veiculo veiculo = new Veiculo("Marcos", 2000, 10000, 2000, 10, 0.02);
		
		veiculo.simulador();
				
		System.out.println("Nome = " + veiculo.getNome());
		System.out.println("Salário = " + veiculo.getSalario());
		System.out.println("Valor do veiculo = " + veiculo.getValor());
		System.out.println("Valor da entrada = " + veiculo.getValorEntrada());
		System.out.println("Taxa de juros = " + veiculo.getTaxaJuros());
		
		System.out.println("Num de prestações = " + veiculo.getNumPrestacoes());
		System.out.println("Valor prestação = " + veiculo.getValorPrestacao());
		System.out.println("Total das prestações = " + veiculo.totalPrestacoes());
		
		

 	}

}
