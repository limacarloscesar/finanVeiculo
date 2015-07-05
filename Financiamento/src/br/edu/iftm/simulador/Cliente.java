package br.edu.iftm.simulador;

public class Cliente {
	private String nome;
	private double salario;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	public Cliente() {
		super();
	}
	public Cliente(String nome, double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}
	
	
	
	

}
