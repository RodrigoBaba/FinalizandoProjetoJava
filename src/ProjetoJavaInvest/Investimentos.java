package ProjetoJavaInvest;

import java.util.Scanner;

public class Investimentos {

	protected void investir() {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Investir");
		
		System.out.println("\nSelecione uma das op��es:\n1 - Tesouro Direto\n2 - Fundo Imobili�rio\n3 - Renda Variav�l\n4 - Outros");
		int resposta = read.nextInt();
		
		while(resposta < 1 || resposta > 4) {
			System.out.println("Voc� digitou um n�mero inv�lido. Tente novamente:");
			System.out.println("\nSelecione uma das op��es:\n1 - Tesouro Direto\n2 - Fundo Imobili�rio\n3 - Renda Variav�l\n4 - Outros");
			resposta = read.nextInt();
		}
		while(resposta == 1 || resposta == 2 || resposta == 3 || resposta == 4) {
			
			if(resposta == 1) {
				
			}
			else if (resposta == 2) {
				
			}
			else if(resposta == 3) {
				
			}
			else if(resposta == 4) {
				
			}
			System.out.println("\nDeseja verificar mais alguma op��o de investimento?(S/N)");
			char resp = read.next().charAt(0);
			
			if(resp == 's' || resp == 'S') {
			
				System.out.println("\n\nSelecione uma das op��es:\n1 - Tesouro Direto\n2 - Fundo Imobili�rio\n3 - Renda Variav�l\n4 - Outros");
				resposta = read.nextInt();
			
				while(resposta < 1 || resposta > 4) {
					System.out.println("Voc� digitou um n�mero inv�lido. Tente novamente:");
					System.out.println("\nSelecione uma das op��es:\n1 - Tesouro Direto\n2 - Fundo Imobili�rio\n3 - Renda Variav�l\n4 - Outros");
					resposta = read.nextInt();
				}
			}
			else {
				resposta = 0;
			}
		}
		read.close();
	}
}
