package banco;

import constBanco.TipoConta;
import entidades.Cliente;

public class ContaPoupanca extends Conta {

	public ContaPoupanca() {}

	public ContaPoupanca(int numeroAgencia, int numeroaConta, double saldo, Cliente cliente) {
		super(numeroAgencia, numeroaConta, saldo, cliente);
		
	}

	@Override
	public void sacar(double valor) {
		
		super.sacar(valor);
	}

	@Override
	public void depositar(double valor) {
		
		super.depositar(valor);
	}

	@Override
	public void imprimirSaldoConta(String nome) {
		
		super.imprimirSaldoConta(TipoConta.CONTAPOUPANCA.getDescricao());
	}

	@Override
	public String toString() {
		
		return super.toString();
	}

	
	
	
	
}
