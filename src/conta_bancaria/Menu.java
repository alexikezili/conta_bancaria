package conta_bancaria;

import java.io.IOException;
import java.util.Scanner;

import conta_bancaria.controller.ContaController;
import conta_bancaria.model.ContaCorrente;
import conta_bancaria.model.ContaPoupanca;
import conta_bancaria.util.Cores;

public class Menu {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int opcao, numero, agencia, tipo, aniversario;
		String titular;
		float saldo, limite;
		
		ContaController contas = new ContaController();
		
		ContaCorrente cc1 = new ContaCorrente(contas.gerarNumero(), 123, 1, "João da Silva", 1000.00f, 100.00f);
		contas.cadastrar(cc1);
		ContaPoupanca cp1 = new ContaPoupanca(contas.gerarNumero(), 123, 2, "Maria da Silva", 1000.00f, 12);
		contas.cadastrar(cp1);
		
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
			case 1 : System.out.println(Cores.TEXT_WHITE + "\nCriar Conta\n");
			
			System.out.println("Digite o número da agência: ");
			agencia = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Digite o nome do titular: ");
			titular = sc.nextLine();
			
			System.out.println("Digite o tipo da conta (1 - CC | 2 - CP:");
			tipo = sc.nextInt();
			
			System.out.println("Digite o saldo inicial da conta: ");
			saldo = sc.nextFloat();
			
			switch(tipo) {
				case 1 -> {
					System.out.println("Digite o limite da conta: ");
					limite = sc.nextFloat();
					contas.cadastrar(new ContaCorrente(contas.gerarNumero(), agencia, tipo, titular, saldo, limite));
				}
			
				case 2 -> {
					System.out.println("Digite o dia do aniversário da conta: ");
					aniversario = sc.nextInt();
					contas.cadastrar(new ContaPoupanca(contas.gerarNumero(), agencia, tipo, titular, saldo, aniversario));
				}
			}
			keyPress();
			break;
			
			case 2 : System.out.println(Cores.TEXT_WHITE + "\nListar todas as Contas\n");
			contas.listarTodas();
			
			keyPress();
			break;
			
			case 3 : System.out.println(Cores.TEXT_WHITE + "\nConsultar dados da Conta - por número\n");
			
			System.out.println("Digite o número da conta: ");
			numero = sc.nextInt();
			
			contas.procurarPorNumero(numero);
			
			keyPress();
			break;
			
			case 4 : System.out.println(Cores.TEXT_WHITE + "\nAtualizar dados da Conta\n");
			keyPress();
			break;
			
			case 5 : System.out.println(Cores.TEXT_WHITE + "\nApagar a Conta\n");
			keyPress();
			break;
			
			case 6 : System.out.println(Cores.TEXT_WHITE + "\nSaque");
			keyPress();
			break;
			
			case 7 : System.out.println(Cores.TEXT_WHITE + "\nDepósito\n");
			keyPress();
			break;
			
			case 8 : System.out.println(Cores.TEXT_WHITE + "\nTransferência entre Contas\n");
			keyPress();
			break;
			
			case 9 : 
				System.out.println(Cores.TEXT_YELLOW + "\nBanco do Brazil com Z - O seu Futuro começa aqui!");
				sobre();
				break;
			
			default :
			System.out.println(Cores.TEXT_RED_UNDERLINED + "\nOpção inválida\n");
			keyPress();
			break;
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
	
	public static void keyPress() {
		 
		try {
 
			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
			System.in.read();
 
		} catch (IOException e) {
 
			System.err.println("Ocorreu um erro ao tentar ler o teclado");
 
		}
	}
}
