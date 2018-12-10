package test;

import org.junit.jupiter.api.Test;

import br.com.db1start.aula11.Pessoa;

import org.junit.Assert;

public class PessoaTest {
	
	@Test
	public void testarNome() {
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Vinicius");
		Assert.assertEquals("Vinicius", pessoa.getNome());
		
	}
	
	
	

	
	

}
