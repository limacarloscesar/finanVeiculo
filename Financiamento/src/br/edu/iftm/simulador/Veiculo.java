package br.edu.iftm.simulador;

public class Veiculo extends Cliente {
	private int valor = 0;
	private int valorEntrada = 0;
	private int numPrestacoes = 0;
	private double taxaJuros = 0;
	private double valorPrestacao = 0;
	
	
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public int getValorEntrada() {
		return valorEntrada;
	}
	public void setValorEntrada(int valorEntrada) {
		this.valorEntrada = valorEntrada;
	}
	public int getNumPrestacoes() {
		return numPrestacoes;
	}
	public void setNumPrestacoes(int numPrestacoes) {
		this.numPrestacoes = numPrestacoes;
	}	
	
	public double getTaxaJuros() {
		return taxaJuros;
	}
	public void setTaxaJuros(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	
	public double getValorPrestacao() {
		return valorPrestacao;
	}
	public void setValorPrestacao(double valorPrestacao) {
		this.valorPrestacao = valorPrestacao;
	}
	
	
	
	public Veiculo() {	}
	
	
	public Veiculo(String nome, int salario, int valor, int valorEntrada,
			int numPrestacoes, double taxaJuros) {
		super(nome, salario);
		this.valor = valor;
		this.valorEntrada = valorEntrada;
		this.numPrestacoes = numPrestacoes;
		this.taxaJuros = taxaJuros;
	}
	
	public double simulador(){
		 this.valorPrestacao = ((this.valor - this.valorEntrada) * this.taxaJuros) /	
		(1 - (1 / Math.pow(1 + taxaJuros, numPrestacoes)));
						
		if (this.valorPrestacao < (super.getSalario() * 0.4)){
			System.out.println("Financiamento Aprovado");
		}else{
			System.out.println("Financiamento Reprovado - Valor da prestação acima de 40% do salário");
		}
		return this.valorPrestacao;						
	}
	public double totalPrestacoes(){
		double valorTotal = this.numPrestacoes * this.valorPrestacao;
		return  valorTotal;
	}
		
	
}
