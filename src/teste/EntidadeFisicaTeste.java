package teste;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import model.EntidadeFisica;

public class EntidadeFisicaTeste{
	
	EntidadeFisica e;

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
		campoIdentidadeObrigatorio();
	}

	private void criaEntidade() {
		e.setNome("JONI");
		e.setTelefone("88140524");
		e.setNacionalidade("Brasileiro");
		e.setEndereco("Rua Vivaldo de Lima 803");
		e.setIdentidade("9999999");		
	}
	
	public void camposObrigatorios(){		
		boolean condition =
				((e.getEndereco() != null) && 
				(e.getNacionalidade() != null) &&
				(e.getNome() != null)  &&
				(e.getTelefone() != null));
						
		assertTrue("Nao informou todos os campos obrigatorios", condition);
	}
	
	public void campoIdentidadeObrigatorio(){
		boolean condition = e.getIdentidade() != null;
		assertTrue("Não informou o IDENTIDADE", condition);		
	}
	

}
