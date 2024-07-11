package br.com.exercicio02;

public class Apartamento {

	private Integer numero;

    private Double area;

    public Apartamento(Integer numero, Double area) {
        this.numero = numero;
        this.area = area;
    }

    public Integer getNumero() {
        return numero;
    }

    public Double getArea() {
        return area;
    }
}