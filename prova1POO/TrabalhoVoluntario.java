package br.com.newtonpaiva.prova1POO;

public class TrabalhoVoluntario extends Projeto {

	private String tipoTrabalho;
	private int duracaoTrabalho;
	
	public TrabalhoVoluntario(String nomeProjeto, String descricao, String endereco, String dataInicio,
			String dataFim, String tipoTrabalho, int duracaoTrabalho) {
		super(nomeProjeto, descricao, endereco, dataInicio, dataFim);
		this.tipoTrabalho = tipoTrabalho;
		this.duracaoTrabalho = duracaoTrabalho;
	}
	public String getTipoTrabalho() {
		return tipoTrabalho;
	}
	public void setTipoTrabalho(String tipoTrabalho) {
		this.tipoTrabalho = tipoTrabalho;
	}
	public int getDuracaoTrabalho() {
		return duracaoTrabalho;
	}
	public void setDuracaoTrabalho(int duracaotrabalho) {
		this.duracaoTrabalho = duracaotrabalho;
	}
	@Override
	public boolean validaProjeto() {
		if (getDuracaoTrabalho() > 2) {
			return true;
			}
			
			else {
				return false;
		}
	}
	
	@Override
	public String imprimeProjeto() {
		
		return "O nome do projeto é: " + getNomeProjeto() + "\nA descrição do projeto: " + getDescricao() + "\nA data de inicio do projeto é: " + getDataInicio() + "\nA data de termino do projeto é: " + getDataFim() + "\nOtipo de trabalho é: " + getTipoTrabalho() + "\nA duração do trabalho é: " + getDuracaoTrabalho();	
	
	
	}
}