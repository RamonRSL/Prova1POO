package br.com.newtonpaiva.prova1POO;

public class DistribuicaoAlimento extends Projeto {
	
	private String descAlimento;
	private float qtde;
	public DistribuicaoAlimento(String nomeProjeto, String descricao, String endereco, String dataInicio,
			String dataFim, String descAlimento, float qtde) {
		super(nomeProjeto, descricao, endereco, dataInicio, dataFim);
		this.descAlimento = descAlimento;
		this.qtde = qtde;
	}
	public String getDescAlimento() {
		return descAlimento;
	}
	public void setDescAlimento(String descAlimento) {
		this.descAlimento = descAlimento;
	}
	public float getQtde() {
		return qtde;
	}
	public void setQtde(float qtde) {
		this.qtde = qtde;
	}
	@Override
	public boolean validaProjeto() {
		if ( getDataFim() == null) {
			return false;
			}
		else 
			return true;
	}
	@Override
	public String imprimeProjeto() {
		return "O nome do projeto é: " + getNomeProjeto() + "\nA descrição do projeto: " + getDescricao() + "\nA data de inicio do projeto é: " + getDataInicio() + "\nA data de termino do projeto é: " + getDataFim() + "\nA Descrição do Alimento é: " + getDescAlimento() + "\nA quantidade é: " + getQtde();		
	}
	

}
