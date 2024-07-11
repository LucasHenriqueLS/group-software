package br.com.exercicio01;

public class Retangulo implements FiguraGeometrica {

	private Double base;
	
	private Double altura;
	
	public Retangulo(Double base, Double altura) {
		this.base = base;
		this.altura = altura;
	}

	public Double getBase() {
		return base;
	}

	public void setBase(Double base) {
		this.base = base;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}
	
	@Override
	public Double getArea() {
		return base * altura;
	}
}