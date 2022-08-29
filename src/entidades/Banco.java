package entidades;

import java.util.ArrayList;
import java.util.List;

import banco.Conta;

public class Banco {

	private static List<Conta> conta = new ArrayList<>();
	
	public Banco() {}
	
	public static void addConta(List<Conta> contas) {
		Banco.conta.addAll(contas);
	}
	
	public static List<Conta> exibirContas(){
		return Banco.conta;
	}
	
	public static List<Conta> exibirContasCliente(Cliente cli){
		
		List<Conta> contasCli = new ArrayList<>();
		for(Conta cont : conta) {
			if(cont.getCliente().getCpf().equalsIgnoreCase(cli.getCpf()))
				contasCli.add(cont);
		}
		return contasCli;
	}
}
