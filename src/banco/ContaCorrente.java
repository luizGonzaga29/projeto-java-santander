package banco;

import constBanco.TipoConta;
import entidades.Cliente;
import excecoes.InvalidValorException;

public class ContaCorrente extends Conta {

	public ContaCorrente() {}

	public ContaCorrente(int numeroAgencia, int numeroaConta, double saldo, Cliente cliente) {
		super(numeroAgencia, numeroaConta, saldo, cliente);
		
	}

	@Override
	public void sacar(double valor) {
		if(valor > 500.00) throw new InvalidValorException("Não é possível sacar valores acima de 500 na conta corrente");
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
