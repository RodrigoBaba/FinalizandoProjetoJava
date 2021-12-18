package ProjetoJavaInvest;


public class Teste {
	
	public static void main(String[] args) {
			
		Logotipo logo = new Logotipo();
		MenuPrincipal menu = new MenuPrincipal();	
		Login log = new Login();
		
		logo.boasVindas();
		log.comeco();					
		menu.menuPrincipal();			
	}	 
}