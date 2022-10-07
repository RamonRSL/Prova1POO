package br.com.newtonpaiva.prova1POO2;

public class Pix extends Pagamento {
	
	private boolean comprovanteTransacaoPix;

	public Pix(String dataHoraPagamento, int numeroPagamento, double valorPago, boolean comprovanteTransacaoPix) {
		super(dataHoraPagamento, numeroPagamento, valorPago);
		this.comprovanteTransacaoPix = comprovanteTransacaoPix;
	}

	public boolean isComprovanteTransacaoPix() {
		return comprovanteTransacaoPix;
	}

	public void setComprovanteTransacaoPix(boolean comprovanteTransacaoPix) {
		this.comprovanteTransacaoPix = comprovanteTransacaoPix;
	}

	@Override
	public String imprimirCupomFscal() {
		
		return "A data e hora do pagemanto foi: " + getDataHoraPagamento() +"\nO numero do pagamento foi: "+ getNumeroPagamento() +"\nO valor do pagamento foi de: "+ getValorPago() + "\n" + "O valor do nuemro Pix foi de : " + isComprovanteTransacaoPix();

	}
	

}
