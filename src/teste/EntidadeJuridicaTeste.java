package teste;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import model.EntidadeJuridica;

public class EntidadeJuridicaTeste {
	
	EntidadeJuridica e = new EntidadeJuridica();

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		criaEntidade();
		camposObrigatorios();
		campoRUCObrigatorio();
	}
	
	public void criaEntidade(){
		e.setNome("JONI");
		e.setTelefone("88140524");
		e.setNacionalidade("Brasileiro");
		e.setEndereco("Rua Vivaldo de Lima 803");
		e.setRuc("555555");
	}
	
	public void camposObrigatorios(){		
		boolean condition =
				((e.getEndereco() != null) && 
				(e.getNacionalidade() != null) &&
				(e.getNome() != null)  &&
				(e.getTelefone() != null));
						
		assertTrue("Nao informou todos os campos obrigatorios", condition);
	}
	
	public void campoRUCObrigatorio(){
		boolean condition = e.getRuc() != null;
		assertTrue("Não informou o RUC", condition);		
	}

}
