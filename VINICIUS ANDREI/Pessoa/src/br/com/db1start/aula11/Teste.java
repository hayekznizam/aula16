package br.com.db1start.aula11;
import org.junit.Test;
public class Teste {
	
	
	@Test
	public void test() {
		
		Pessoa pessoa = new Pessoa();
		Endereco endereco = new Endereco();
		//Recibo recibo = new Recibo(); //deixando o usuario criar um recibo sem pessoa
		Recibo recibo2 = new Recibo(pessoa);
		
		Feijoada feijoada = new Feijoada(new Feijao(),new Bacon());
		
		
		
	}

	

}
