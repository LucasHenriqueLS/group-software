package br.com.exercicio01;

public class Circulo implements FiguraGeometrica {

	private Double raio;
	
	public Circulo(Double raio) {
		this.raio = raio;
	}

	public Double getRaio() {
		return raio;
	}

	public void setRaio(Double raio) {
		this.raio = raio;
	}
	
	@Override
	public Double getArea() {
		return Math.PI * (raio * raio);
	}
}