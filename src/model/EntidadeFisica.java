package model;

public class EntidadeFisica extends Entidade{
	
	private String identidade;

	public String getIdentidade() {
		return identidade;
	}

	public void setIdentidade(String identidade) {
		this.identidade = identidade;
	}
	
	public boolean identidadeObrigatorio(EntidadeFisica e){
		return e.getIdentidade().equals("");		
	}

}
