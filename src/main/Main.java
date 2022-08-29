package main;

import java.util.Arrays;

import banco.Conta;
import banco.ContaCorrente;
import banco.ContaPoupanca;
import entidades.Banco;
import entidades.Cliente;

public class Main {

	public static void main(String[] args) {
		
		Cliente cli = new Cliente("Paula Noir", "12345678911", "911234312", "paula@gmail.com");
		Conta cc = new ContaCorrente(12345, 1234, 200.00, cli);
		Conta cp = new ContaPoupanca(12345, 23456, 800.00, cli);
		Conta ccP = new ContaCorrente(11111, 1234, 500.00, cli);
		
		Cliente cli1 = new Cliente("Jorge tadeu", "90987654323", "911231234", "jorge@gmail.com");
		Conta cc1 = new ContaCorrente(54321, 4331, 350.00, cli1);
		Conta cp1 = new ContaPoupanca(54321, 12349, 600.00, cli1);
		Conta ccJ = new ContaCorrente(22222, 4331, 270.00, cli1);
		
		Banco.addConta(Arrays.asList(cc, cp, cc1, cp1, ccP, ccJ));
		
		cc.imprimirSaldoConta("");
		cp.imprimirSaldoConta("");
		
		
//		cc.transferir(100, cp);
//		cc.imprimirSaldoConta("");
//		cp.imprimirSaldoConta("");
//		cc.depositar(300.00);
//		cp.sacar(500.00);
//		cc.imprimirSaldoConta("");
//		cp.imprimirSaldoConta("");
		System.out.println("----------------");
		Banco.exibirContas();
		System.out.println("----------------");
		Banco.imprimirTotal(cli);
		Banco.imprimirTotalporAgencia(cli1);
	}

}
