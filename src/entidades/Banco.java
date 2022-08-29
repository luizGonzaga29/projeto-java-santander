package entidades;

import java.util.ArrayList;
import java.util.List;

import banco.Conta;
import constBanco.TipoConta;

public class Banco {

	private static List<Conta> conta = new ArrayList<>();
	
	public Banco() {}
	
	public static void addConta(List<Conta> contas) {
		Banco.conta.addAll(contas);
	}
	
	public static void exibirContas(){
		 for(Conta cont : conta) {
			 System.out.println(
					 "Nome: " + cont.getCliente().getNome()
					 + "\nAg�ncia: " + cont.getNumeroAgencia()
					 + "\nConta: " + cont.getNumeroConta()
					 + "\nSaldo: " + cont.getSaldo()
					 + "\nTipo da conta : " + tipoConta(cont)
					 );
		 }
	}
	
	private static List<Conta> filtrarContasCliente(Cliente cli){
		
		List<Conta> contasCli = new ArrayList<>();
		for(Conta cont : conta) {
			if(cont.getCliente().getCpf().equalsIgnoreCase(cli.getCpf()))
				contasCli.add(cont);
		}
		return contasCli;
	}
	
	
	public static void imprimirTotalporAgencia(Cliente cli) {
		List<Conta> contasCli = filtrarContasCliente(cli);
		List <Integer> listaAgencia =  contasCli.stream().map(agencia -> agencia.getNumeroAgencia()).distinct().toList();
		
		for(Integer agencia : listaAgencia) {
			double soma = 0.0;
			for(Conta cont : contasCli) {
				if(agencia == cont.getNumeroAgencia()) {
					soma+= cont.getSaldo();
				}
			}
			System.out.println(
					"Nome: " + cli.getNome()
					+"\nAg�ncia: " + agencia
					+"\nTotal: " + soma
					);
		}
	}
	
	public static void imprimirTotal(Cliente cliente) {
		double total = Banco.filtrarContasCliente(cliente).stream()
				.map(valor -> valor.getSaldo())
				.reduce((acc, valor) -> acc + valor).get();
				
		System.out.println( cliente.getNome() + " :"
				+ "\nSaldo total : R$" + total);
	}
	
	private static String tipoConta(Conta conta) {
		return (conta.getClass().getSimpleName().
				equalsIgnoreCase(TipoConta.CONTACORRENTE.getDescricao()))
				? TipoConta.CONTACORRENTE.getDescricao()
				: TipoConta.CONTAPOUPANCA.getDescricao();
	}
}
