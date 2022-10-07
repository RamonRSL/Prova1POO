package br.com.newtonpaiva.prova1POO3;

public class Mensalidade {

	private double valorMensalidade;
	private int numeroIrmaos;
	public Mensalidade(double valorMensalidade, int numeroIrmaos) {
		super();
		this.valorMensalidade = valorMensalidade;
		this.numeroIrmaos = numeroIrmaos;
	}
		
	public void Mensalidade() {
		if (numeroIrmaos==1) {
		valorMensalidade=(valorMensalidade-(valorMensalidade * 5/100));
		System.out.println(valorMensalidade);
		}
		if (numeroIrmaos == 2) {
			valorMensalidade = (valorMensalidade-(valorMensalidade * 10/100));
		System.out.println(valorMensalidade);
		}
		if (numeroIrmaos > 2) {
			valorMensalidade = (valorMensalidade-(valorMensalidade * 15/100));
		System.out.println(valorMensalidade);
		}
	
		if (numeroIrmaos==0){
		 System.out.println("O sem desconto será " + valorMensalidade);
		
		}
		
 }
}
