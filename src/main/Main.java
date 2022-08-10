package main;

import banco.Conta;
import banco.ContaCorrente;
import banco.ContaPoupanca;
import entidades.Cliente;

public class Main {

	public static void main(String[] args) {
		
		Cliente cli = new Cliente("Paula Noir", "12345678911", "911234312", "paula@gmail.com");
		Conta cc = new ContaCorrente(12345, 1234, 200.00, cli);
		cli.addConta(cc);
		Conta cp = new ContaPoupanca(12345, 23456, 800.00, cli);
		cli.addConta(cp);
		
		cc.imprimirSaldoConta("");
		cp.imprimirSaldoConta("");
		
		cc.imprimirTotal();
		cc.transferir(100, cp);
		cc.imprimirSaldoConta("");
		cp.imprimirSaldoConta("");
	}

}