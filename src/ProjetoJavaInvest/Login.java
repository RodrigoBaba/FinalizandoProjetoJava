package ProjetoJavaInvest;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Login {

	 Map<String, Usuario> usuarios = new HashMap<String, Usuario>();
	 Usuario loggedUser = null;
	 public Scanner read = new Scanner(System.in);

	 protected void comeco() {
		 MenuPrincipal menu = new MenuPrincipal();
		 
		 do {
				logon();
				
				if (loggedUser != null){
					menu.menuPrincipal();
				}
			} while (loggedUser == null);
		 
		 read.close();
	 }
	 
	 
	 protected void logon() {

		int resposta;
			
		do {
			System.out.println("\nDigite 1 para fazer login, 2 para cadastrar novo usuário ou 3 para encerrar");
			resposta = read.nextInt();
			
			if(resposta < 1 || resposta > 3) {
				System.out.println("Você digitou um número inválido. Tente novamente:");
			}
		} while(resposta < 1 || resposta > 3);
		
		switch(resposta) {
			case 1:
				login();
				break;
			case 2:
				register();
				break;
			case 3:
				System.out.println("Programa encerrado");
				System. exit(1);
				break;
		}
	}

	 protected void register() {

		Usuario newUser;
		int confPassword;
		
		System.out.println("\nCrie sua conta: ");
		System.out.print("Digite seu login: ");
		String login = read.next();
		System.out.print("Digite sua senha(apenas números): ");
		int password = read.nextInt();	
		
		do{
			System.out.print("Confirmando senha: ");
			confPassword = read.nextInt();
			if (confPassword != password) {
				System.out.println("\nSenha incorreta!");
			}
		} while (confPassword != password);
		
		newUser = new Usuario(login, password);
		usuarios.put(login, newUser);
	}
	
	
	 protected void login() {

		String loginInserido;
		
		do {
			System.out.print("\nEntre na sua conta.\nLogin: ");
			loginInserido = read.next();
			
			if (!usuarios.containsKey(loginInserido)){
				System.out.println("Usuário não encontrado! Registre-se: ");
				break;
			}
			
		} while (!usuarios.containsKey(loginInserido));
					
		loggedUser = usuarios.get(loginInserido);
		
		if (loggedUser != null){
			int passwordInserido;
			do {
				System.out.print("Senha: ");
				passwordInserido = read.nextInt();
				
				if (passwordInserido != loggedUser.getPassword()) {
					System.out.println("\nSua senha está incorreta!\nTente novamente:");
				}
			} while(passwordInserido != loggedUser.getPassword());	
		}
	}
}
