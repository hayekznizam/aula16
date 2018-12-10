package br.com.db1start.polimorfismo;

import org.junit.Test;

public class AutenticarTest {
	@Test
	public void exemploTest() {
		Cliente cliente = new Cliente();
		System.out.println(cliente.autenticar());

		Diretor diretor = new Diretor();
		System.out.println(diretor.autenticar());

		Gerente gerente = new Gerente();
		System.out.println(diretor.autenticar());

	}
	private void exibirMensagem2(Funcionario funcionario) {
		System.out.println("");
	}
	
	
	@Test
	public void exemploInterface() {
		exibirMensagemDeAutenticacao(new Gerente());
		exibirMensagemDeAutenticacao(new Diretor());
		exibirMensagemDeAutenticacao(new Cliente());
	}
	@Test
	private void exibirMensagemDeAutenticacao(Autenticavel autenticavel) {
		
		System.out.println(autenticavel.autenticar());
	}
	
	
}
