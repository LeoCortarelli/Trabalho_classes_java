package TRABALHO;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Cliente cliente_01 = new Cliente();
		System.out.println("Digite o NOME na CONTA 1: ");
		cliente_01.nome = ler.nextLine();
		System.out.println("Digite o CPF na CONTA 1: ");
		cliente_01.cpf = ler.nextLine();
		System.out.println("Digite o seu EMAIL na CONTA 1: ");
		cliente_01.email = ler.nextLine();
		System.out.println("Digite seu ANO NASCIMENTO na CONTA 1: ");
		cliente_01.anoNascimento = ler.nextInt();
		System.out.println(" ");
		
		// Leitura das informacoes da CONTA 1
		Conta conta_01 = new Conta();
		System.out.println("Informe o NUMERO da CONTA 1: ");
		conta_01.numero = ler.nextInt();
		System.out.println("Informe o SALDO na CONTA 1: ");
		conta_01.saldo = ler.nextDouble();
		ler.nextLine();
		
		System.out.println(" ");
		System.out.println("--------------------------------------------");
		System.out.println(" ");
		
		
		Cliente cliente_02 = new Cliente();
		System.out.println("Digite o NOME na CONTA 2: ");
		cliente_02.nome = ler.nextLine();
		System.out.println("Digite o CPF da CONTA 2: ");
		cliente_02.cpf = ler.nextLine();
		System.out.println("Digite o seu EMAIL da CONTA 2: ");
		cliente_02.email = ler.nextLine();
		System.out.println("Digite seu ANO NASCIMENTO da CONTA 2: ");
		cliente_02.anoNascimento = ler.nextInt();
		System.out.println(" ");
		
		// Leitura das informacoes da CONTA 2
		Conta conta_02 = new Conta();
		System.out.println("Informe o NUMERO da CONTA 2: ");
		conta_02.numero = ler.nextInt();
		System.out.println("Informe o SALDO na CONTA 2: ");
		conta_02.saldo = ler.nextDouble();
		ler.nextLine();
		
		System.out.println(" ");
		System.out.println("--------------------------------------------");
		System.out.println(" ");
		
		
		Cliente cliente_03 = new Cliente();
		System.out.println("Digite o NOME na CONTA 3: ");
		cliente_03.nome = ler.nextLine();
		System.out.println("Digite o CPF da CONTA 3: ");
		cliente_03.cpf = ler.nextLine();
		System.out.println("Digite o seu EMAIL da CONTA 3: ");
		cliente_03.email = ler.nextLine();
		System.out.println("Digite seu ANO NASCIMENTO da CONTA 3: ");
		cliente_03.anoNascimento = ler.nextInt();
		System.out.println(" ");
		
		// Leitura das informacoes da CONTA 3
		Conta conta_03 = new Conta();
		System.out.println("Informe o NUMERO da CONTA 3: ");
		conta_03.numero = ler.nextInt();
		System.out.println("Informe o SALDO na CONTA 3: ");
		conta_03.saldo = ler.nextDouble();
		ler.nextLine();
		
		System.out.println(" ");
		System.out.println("--------------------------------------------");
		System.out.println(" ");
		
		Cliente cliente_04 = new Cliente();
		System.out.println("Digite o NOME na CONTA 4: ");
		cliente_04.nome = ler.nextLine();
		System.out.println("Digite o CPF da CONTA 4: ");
		cliente_04.cpf = ler.nextLine();
		System.out.println("Digite o seu EMAIL da CONTA 4: ");
		cliente_04.email = ler.nextLine();
		System.out.println("Digite seu ANO NASCIMENTO da CONTA 4: ");
		cliente_04.anoNascimento = ler.nextInt();
		System.out.println(" ");
		
		// Leitura das informacoes da CONTA 4
		Conta conta_04 = new Conta();
		System.out.println("Informe o NUMERO da CONTA 4: ");
		conta_04.numero = ler.nextInt();
		System.out.println("Informe o SALDO na CONTA 4: ");
		conta_04.saldo = ler.nextDouble();
		ler.nextLine();
		
		System.out.println(" ");
		System.out.println("--------------------------------------------");
		System.out.println(" ");
		
		
		System.out.println("CLIENTE 1");
	    System.out.println(cliente_01.toString());
	    System.out.println("");
	    System.out.println("CLIENTE 2");
	    System.out.println(cliente_02.toString());
	    System.out.println("");
	    System.out.println("CLIENTE 3");
	    System.out.println(cliente_03.toString());
	    System.out.println("");
	    System.out.println("CLIENTE 4");
	    System.out.println(cliente_04.toString());
		
	    System.out.println(" ");
	    System.out.println("--------------------------------------------");
	    System.out.println(" ");
	    System.out.println("CONTA 1");
	    System.out.println(" ");
	    
	    double addSaldo;
	    double retSaldo;
	    
	    System.out.println("Digite quanto quer ADICIONAR na conta 1: ");
	    addSaldo = ler.nextDouble();
	    conta_01.creditaSaldo(addSaldo);
	    
	    System.out.println("Digite quanto quer RETIRAR na conta 1: ");
	    retSaldo = ler.nextDouble();
	    conta_01.debitaSaldo(retSaldo);
	    
	    System.out.println(conta_01.toString());
	    
	    System.out.println(" ");
	    System.out.println("--------------------------------------------");
	    System.out.println(" ");
	    System.out.println("CONTA 2");
	    System.out.println(" ");
	    
	    System.out.println("Digite quanto quer ADICIONAR na conta 2: ");
	    addSaldo = ler.nextDouble();
	    conta_02.creditaSaldo(addSaldo);
	    
	    System.out.println("Digite quanto quer RETIRAR na conta 2: ");
	    retSaldo = ler.nextDouble();
	    conta_02.debitaSaldo(retSaldo);
	    
	    System.out.println(conta_02.toString());
	    
	    System.out.println(" ");
	    System.out.println("--------------------------------------------");
	    System.out.println(" ");
	    System.out.println("CONTA 3");
	    System.out.println(" ");
	    
	    System.out.println("Digite quanto quer ADICIONAR na conta 3: ");
	    addSaldo = ler.nextDouble();
	    conta_03.creditaSaldo(addSaldo);
	    
	    System.out.println("Digite quanto quer RETIRAR na conta 3: ");
	    retSaldo = ler.nextDouble();
	    conta_03.debitaSaldo(retSaldo);
	    
	    System.out.println(conta_03.toString());
	    
	    System.out.println(" ");
	    System.out.println("--------------------------------------------");
	    System.out.println(" ");
	    System.out.println("CONTA 4");
	    System.out.println(" ");

	    System.out.println("Digite quanto quer ADICIONAR na conta 4: ");
	    addSaldo = ler.nextDouble();
	    conta_04.creditaSaldo(addSaldo);
	    
	    System.out.println("Digite quanto quer RETIRAR na conta 4: ");
	    retSaldo = ler.nextDouble();
	    conta_04.debitaSaldo(retSaldo);
	    
	    System.out.println(conta_04.toString());
	}

}
