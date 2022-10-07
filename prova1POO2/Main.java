package br.com.newtonpaiva.prova1POO2;

public class Main {

	public static void main(String[] args) {
		
		
		CartaoCredito cc = new CartaoCredito ("06-10-2022 21:17", 40, 10000, "5612", "Bra", "Ramon");
		System.out.println(cc.imprimirCupomFscal());
		
		
		CartaoDebito cd = new CartaoDebito("06-10-2022 21:17", 40, 10000, "5612", "Ramon");
		System.out.println(cd.imprimirCupomFscal());
		
		Pix p = new Pix ("06-10-2022 21:17", 40, 10000, true);
		System.out.println(p.imprimirCupomFscal());		
						
	}

}
