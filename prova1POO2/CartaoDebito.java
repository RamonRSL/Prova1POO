package br.com.newtonpaiva.prova1POO2;

public class CartaoDebito extends Pagamento{
	private String numCartao;
	private String titularCartao;

	public CartaoDebito(String dataHoraPagamento, int numeroPagamento, double valorPago, String numCartao,
			String titularCartao) {
		super(dataHoraPagamento, numeroPagamento, valorPago);
		this.numCartao = numCartao;
		this.titularCartao = titularCartao;
	}
	
	public String getNumCartao() {
		return numCartao;
	}
	public void setNumCartao(String numCartao) {
		this.numCartao = numCartao;
	}
	public String getTitularCartao() {
		return titularCartao;
	}
	public void setTitularCartao(String titularCartao) {
		this.titularCartao = titularCartao;
	}

	@Override
	public String imprimirCupomFscal() {
		return "A data e hora do pagemanto foi: " + getDataHoraPagamento() +"\nO numero do pagamento foi: "+ getNumeroPagamento() +"\nO valor do pagamento foi de: "+ getValorPago() + "\n" + "\nO numero do cartão é: " + getNumCartao() + "\nO titular do cartão é: " + getTitularCartao() ;
	}

}
