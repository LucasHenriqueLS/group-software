package br.com.exercicio02;

public class Main {

	public static void main(String[] args) {

		var blocoA = new Bloco(10);
		
		blocoA.adicionarApartamento(new Apartamento(101, 50.0));
        blocoA.adicionarApartamento(new Apartamento(102, 50.0));
        blocoA.adicionarApartamento(new Apartamento(103, 100.0));

        blocoA.incrementarDespesas(1000.0);
        
        var blocoB = new Bloco(20);

        blocoB.adicionarApartamento(new Apartamento(201, 100.0));
        blocoB.adicionarApartamento(new Apartamento(202, 200.0));
        blocoB.adicionarApartamento(new Apartamento(203, 300.0));
        
        blocoB.incrementarDespesas(1200.0);


        var condominio = new Condominio();

        condominio.adicionarBloco(blocoA);
        condominio.adicionarBloco(blocoB);
        
        condominio.imprimirValorCondominio();
	}
}