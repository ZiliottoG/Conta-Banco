package AULA06;

import java.util.Scanner;

public class Principal {
	
	
	public static void gerenciarConta(Scanner teclado, Banco itai) {
		int op;
		menuGerenciar();
		
		String num = teclado.nextLine();
		op = Integer.parseInt(num);
		
		switch(op) {
		case 1:
			criarConta(teclado, itai);
		break;
		
		case 2:
			removerConta(teclado, itai);
		break;
		
		case 3:
			itai.listarContas();
		break;
		
		case 4:
			pesquisaConta(teclado, itai);
		break;
		
		default:
			System.out.println("Opção invalida!");
		break;
		}
	}
	
	public static void efetuarOperacoes(Scanner teclado, Banco itai) {
		int op;
		
		menuEfetuarOperacoes();
		
		String num = teclado.nextLine();
		op = Integer.parseInt(num);
		
		switch(op) {
		case 1:
			
		break;
		
		case 2:
			
		break;
		
		case 3:
		
		break;
		
		default:
			System.out.println("Opção invalida!");
		break;
		}
	}
	
	public static void criarConta(Scanner teclado, Banco itai) {
	
		System.out.println("Entre com o nome do cliente:");
		String nome = teclado.nextLine();
	
		Conta conta = new Conta();
		conta.setNomeTitular(nome);
		
		itai.criarConta(conta);
	}
	
	public static void removerConta(Scanner teclado, Banco itai) {
		
		System.out.println("Entre com o numero da conta:");
		String num = teclado.nextLine();
	
		int numeroConta = Integer.parseInt(num);
		itai.removerConta(numeroConta);
	}
	
public static void pesquisaConta(Scanner teclado, Banco itai) {
		
		System.out.println("Entre com o numero da conta:");
		String nome = teclado.nextLine();
	
		itai.pesquisaConta(nome);
	}
	
	
	public static void menuPrincipal() {
		System.out.println("ESCOLHA A OPÇÃO DESEJADA\n\n1-Gerenciar conta\n2-Efetuar operações\n3-Sair");
	}
	
	public static void menuGerenciar() {
		System.out.println("ESCOLHA A OPÇÃO DESEJADA\n\n1-Criar conta\n2-Remover conta\n3-Listar contas\n4-Pesquisar contas");
	}
	
	public static void menuEfetuarOperacoes() {
		System.out.println("QUAL OPERAÇÃO DESEJA EFETUAR?\n\n1-Sacar\n2-Depositar\n3-Extrato");
	}
	
	
	
public static void main(String[] args) {
	
	Banco itai = new Banco();		
	Scanner teclado = new Scanner(System.in);
	int op = 0;
				
		do {
				menuPrincipal();
				String num = teclado.nextLine();
				op = Integer.parseInt(num);
				
				
				
				switch (op) {
				
					case 1:
					
					gerenciarConta(teclado, itai);
						
					break;
					
					case 2:
					efetuarOperacoes(teclado, itai);
						
					break;
					
					case 3:
					
					
					break;
					default:
						System.out.println("Opção invalida!");
						
				}
				
			} while(op != 3);
			
		teclado.close();
	}
}