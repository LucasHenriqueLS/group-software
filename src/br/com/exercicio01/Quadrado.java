package br.com.exercicio01;

public class Quadrado implements FiguraGeometrica {

	private Double lado;
	
	public Quadrado(Double lado) {
		this.lado = lado;
	}

	public Double getLado() {
		return lado;
	}

	public void setLado(Double lado) {
		this.lado = lado;
	}

	@Override
	public Double getArea() {
		return lado * lado;
	}
}