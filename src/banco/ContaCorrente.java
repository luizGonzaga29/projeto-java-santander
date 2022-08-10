package banco;

import constBanco.TipoConta;
import entidades.Cliente;

public class ContaCorrente extends Conta {

	public ContaCorrente() {}

	public ContaCorrente(int numeroAgencia, int numeroaConta, double saldo, Cliente cliente) {
		super(numeroAgencia, numeroaConta, saldo, cliente);
		
	}

	@Override
	public void sacar(double valor) {
		if(valor > 100.00) System.out.println("Não é possível sacar valores acima de 100 na conta corrente");
		else super.sacar(valor);
	}

	@Override
	public void depositar(double valor) {
		
		super.depositar(valor);
	}

	@Override
	public void imprimirSaldoConta(String nome) {
		
		super.imprimirSaldoConta(TipoConta.CONTACORRENTE.getDescricao());
	}

	@Override
	public String toString() {
		
		return super.toString();
	}
	
	
}
