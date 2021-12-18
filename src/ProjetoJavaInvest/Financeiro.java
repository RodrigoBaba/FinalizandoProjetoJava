package ProjetoJavaInvest;

import java.util.Scanner;

public class Financeiro {

	MenuPrincipal menu = new MenuPrincipal();
	Login log = new Login();
	Usuario n = new Usuario();
	
	protected void imprimeSaldo() {
				
		System.out.printf("\nSeu saldo atual: R$%.2f", log.usuarios.get(n.getLogin()).getSaldo());		
	}
	
	protected void depositar() {
		Scanner read = new Scanner(System.in);
		
		System.out.print("\nQuanto você deseja depositar: ");
		double valorDeposito = read.nextDouble();
		log.loggedUser.depositar(valorDeposito);
		menu.menuPrincipal();
		read.close();
	}
	
	protected void sacar() {
		
		Scanner read = new Scanner(System.in);

		double saque;
			
		do {
			System.out.println("\nQuanto você deseja sacar: ");
			saque = read.nextDouble();
			if (saque > log.loggedUser.getSaldo() || saque < 0) {
				System.out.println("\nVocê está tentando sacar um valor inválido ou maior do que o seu saldo!\nTente de novo, por favor.");
			}		
		} while(saque > log.loggedUser.getSaldo());
		log.loggedUser.sacar(saque);
		menu.menuPrincipal();
		read.close();
	}
}
