package conta_bancaria;

import java.util.Scanner;

import conta_bancaria.model.Conta;
import conta_bancaria.util.Cores;

public class Menu {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int opcao;
		
		Conta c1 = new Conta(1, 123, 1, "Alex", 10000);
		c1.visualizar();
		
		do {
			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND + "**************************************************");
			System.out.println("                                                  ");
			System.out.println("            BANCO DO BRAZIL COM Z                 ");
			System.out.println("                                                  ");
			System.out.println("**************************************************");
			System.out.println("                                                  ");
			System.out.println("       1 - Criar Conta                            ");
			System.out.println("       2 - Listar todas as contas                 ");
			System.out.println("       3 - Buscar Conta por Número                ");
			System.out.println("       4 - Atualizar Dados da Conta               ");
			System.out.println("       5 - Apagar Conta                           ");
			System.out.println("       6 - Sacar                                  ");
			System.out.println("       7 - Depositar                              ");
			System.out.println("       8 - Transferir valores entre Contas        ");
			System.out.println("       9 - Sair                                   ");
			System.out.println("                                                  ");
			System.out.println("**************************************************");
			System.out.println("       Entre com a opção desejada                 ");
			System.out.println("                                                  " + Cores.TEXT_RESET);
			
			opcao = sc.nextInt();
			
			switch (opcao) {
			case 1 -> System.out.println(Cores.TEXT_WHITE + "\nCriar Conta\n");
			case 2 -> System.out.println(Cores.TEXT_WHITE + "\nListar todas as Contas\n");
			case 3 -> System.out.println(Cores.TEXT_WHITE + "\nConsultar dados da Conta - por número\n");
			case 4 -> System.out.println(Cores.TEXT_WHITE + "\nAtualizar dados da Conta\n");
			case 5 -> System.out.println(Cores.TEXT_WHITE + "\nApagar a Conta\n");
			case 6 -> System.out.println(Cores.TEXT_WHITE + "\nSaque");
			case 7 -> System.out.println(Cores.TEXT_WHITE + "\nDepósito\n");
			case 8 -> System.out.println(Cores.TEXT_WHITE + "\nTransferência entre Contas\n");
			case 9 -> {
				System.out.println(Cores.TEXT_YELLOW + "\nBanco do Brazil com Z - O seu Futuro começa aqui!");
				sobre();
			}
			
			default ->
			System.out.println(Cores.TEXT_RED_UNDERLINED + "\nOpção inválida\n");
			}
			
		} while (opcao != 9);
		
		sc.close();
		}

	private static void sobre() {
		System.out.println("\n***********************************************");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("Alex Ikezili - alex.ikezili@icloud.com");
		System.out.println("https://github.com/alexikezili");
		System.out.println("***********************************************");
	}
}
