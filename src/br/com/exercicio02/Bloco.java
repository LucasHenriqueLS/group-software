package br.com.exercicio02;

import java.util.ArrayList;
import java.util.List;

public class Bloco {

	private Integer numero;

    private List<Apartamento> apartamentos;

    private Double despesasTotais;

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Bloco(Integer numero) {
        this.numero = numero;
        this.apartamentos = new ArrayList<>();
        this.despesasTotais = 0.0;
    }
    
    public void adicionarApartamento(Apartamento apartamento) {
        apartamentos.add(apartamento);
    }

    public void incrementarDespesas(Double despesa) {
        despesasTotais += despesa;
    }
    
    public Double calcularAreaTotal() {
        var areaTotal = 0.0;
        for (var apartamento : apartamentos) {
            areaTotal += apartamento.getArea();
        }
        return areaTotal;
    }
    
    public void imprimirValorCondominio() {
        var areaTotal = calcularAreaTotal();
        for (var apartamento : apartamentos) {
            var fracaoIdeal = apartamento.getArea() / areaTotal;
            var valorCondominio = fracaoIdeal * despesasTotais;
            System.out.println(String.format("Apartamento %s: R$ %s", apartamento.getNumero(), valorCondominio));
        }
    }
}
