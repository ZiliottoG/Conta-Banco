package AULA06;

public class Conta {

	private double saldo; 
	private String nomeTitular;
	private int numero;
	
	public Conta(){
		saldo = 0;
	}
	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void creditar(double valorCredito){
		
		if ( valorCredito > 0) {
			saldo = saldo + valorCredito;
	}	
		else {
			System.out.println("Não Foi possivel Creditar o Valor!");
		}
	
	}

	public void debitar(double valorDebito){
		
		if (valorDebito < saldo && valorDebito > 0) {
			saldo = saldo - valorDebito;
	}	
		else {
			System.out.println("Saldo insulficiente");
		}
	}
	

	public void extrato(){
		
		System.out.println("=======================");
		System.out.println("Titular: " + nomeTitular);
		System.out.println("Numero da conta: " + numero);
		System.out.println("Saldo: " + saldo);
		System.out.println("=======================");

	}
}