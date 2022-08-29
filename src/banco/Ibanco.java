package banco;



public interface Ibanco {

	void sacar(double valor);
	void depositar(double valor);
	void imprimirSaldoConta(String nome);
	void transferir(double valor, Conta conta);
		
	
}
