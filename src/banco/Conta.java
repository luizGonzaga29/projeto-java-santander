package banco;



import entidades.Cliente;

public class Conta implements Ibanco {

	private int numeroAgencia;
	private int numeroConta;
	private double saldo;
	private Cliente cliente;
	
	public Conta() {}
	
	public Conta(int numeroAgencia, int numeroaConta, double saldo, Cliente cliente) {
		super();
		this.numeroAgencia = numeroAgencia;
		this.numeroConta = numeroaConta;
		this.saldo = saldo;
		this.cliente = cliente;
	}

	
	
	public int getNumeroAgencia() {
		return numeroAgencia;
	}

	public void setNumeroAgencia(int numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroaConta) {
		this.numeroConta = numeroaConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public void sacar(double valor) {
		if(valor > this.saldo) System.out.println("Saldo insuficiente");
		else this.saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		if(valor < 1) System.out.println("Valor inválido para depósito");
		else this.saldo += valor;
	}

	@Override
	public void imprimirSaldoConta(String nome) {
		System.out.println(this.cliente.getNome() + " tem saldo na sua " + nome + " de : R$" + this.saldo);
		
	}

	@Override
	public String toString() {
		return "[numeroAgencia=" + numeroAgencia + ", numeroConta=" + numeroConta + ", saldo=" + saldo
				+"]";
	}

	
	@Override
	public void transferir(double valor, Conta conta) {
		this.sacar(valor);
		conta.depositar(valor);
	}

	
	
}
