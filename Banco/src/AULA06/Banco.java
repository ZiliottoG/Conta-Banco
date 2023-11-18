package AULA06;

import java.util.ArrayList;
import java.util.Iterator;

public class Banco {

	private ArrayList<Conta> lista;
	private int numeroConta;

	public Banco() {
		lista = new ArrayList<Conta>();
		numeroConta = 0;
	}

	public void criarConta(Conta conta) {
		conta.setNumero(numeroConta);
		lista.add(conta);
		System.out.println("Conta criada com sucesso!");
		System.out.println("Numero da conta definido como:"+numeroConta+"\n\n");
		numeroConta++;
	
}
	public void removerConta(int numeroConta) {
		
		Iterator<Conta> iterator = lista.iterator();
		while (iterator.hasNext()) {
			
			Conta contaAtual = iterator.next();
		
			if (contaAtual.getNumero() == numeroConta) {
				iterator.remove();
			}	
		}
	}
	
	public void listarContas() {
		
		for(Conta contaAtual: lista) {
			
			
			contaAtual.extrato();
			
		}
	}

	public void pesquisaConta(String nome) {
		
		for(Conta contaAtual:lista) {
			
			if (contaAtual.getNomeTitular().equals(nome)) {
				
				contaAtual.extrato();
				
			}
		}
	}

	
	
	

}