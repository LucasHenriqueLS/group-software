package br.com.exercicio02;

import java.util.ArrayList;
import java.util.List;

public class Condominio {

	private List<Bloco> blocos;

    public Condominio() {
        this.blocos = new ArrayList<>();
    }

    public void adicionarBloco(Bloco bloco) {
        blocos.add(bloco);
    }

    public void imprimirValorCondominio() {
        for (var bloco : blocos) {
            System.out.println(String.format("Bloco %s", bloco.getNumero()));
            bloco.imprimirValorCondominio();
            System.out.println();
        }
    }
}