package ProjetoJavaInvest;


public class MenuPrincipal {

		
	protected  void menuPrincipal() {
		Login log = new Login();
		
		Financeiro finan = new Financeiro();
		Investimentos inv = new Investimentos();

			finan.imprimeSaldo();
			int resposta;
				
			do {
				System.out.println("\nSelecione uma das opções:\n1 - Depositar\n2 - Sacar\n3 - Investir\n4 - Deslogar");
				resposta = log.read.nextInt();
			
				if(resposta < 1 || resposta > 4) {
					System.out.println("Você digitou um número inválido. Tente novamente:");
				}
			} while(resposta < 1 || resposta > 4);
			
			switch(resposta) {
				case 1:
					finan.depositar();
					break;
				case 2:
					finan.sacar();
					break;
				case 3:
					inv.investir();
					break;
				case 4:
					log.loggedUser = null;
		}
	}
}
