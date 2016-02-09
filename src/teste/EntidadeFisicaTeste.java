package teste;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sun.xml.internal.ws.policy.spi.AssertionCreationException;

import junit.framework.Assert;
import model.EntidadeFisica;

public class EntidadeFisicaTeste{
	
	EntidadeFisica e;

	@Before
	public void setUp() throws Exception {
		
		e = new EntidadeFisica();
		e.setNome("Joni Nunes");
		e.setTelefone("45888888888");
		e.setNacionalidade("Brasileiro");
		e.setEndereco("Foz do Iguaçu");
		//e.setIdentidade("9999999");
	}

	@After
	public void tearDown() throws Exception {
	}


	@Test
	public void nome(){				
		Assert.assertFalse("NOME deve ser informado", e.nomeObrigatorio(e));
	}

	@Test
	public void identidade(){				
		Assert.assertFalse("IDENTIDADE deve ser informado", e.identidadeObrigatorio(e));
	}
	

}
