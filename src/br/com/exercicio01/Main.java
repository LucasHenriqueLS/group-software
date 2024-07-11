package br.com.exercicio01;

public class Main {

	public static void main(String[] args) {

		var figuraGeometricas = new FiguraGeometricaUtils();

		figuraGeometricas.add(new Quadrado(4.0));
		figuraGeometricas.add(new Retangulo(4.0, 2.0));
		figuraGeometricas.add(new Triangulo(4.0, 2.0));
		figuraGeometricas.add(new Circulo(2.0));

		figuraGeometricas.imprimirSomatorioDasAreas();
	}
}