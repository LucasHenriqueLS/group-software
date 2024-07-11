package br.com.exercicio01;

import java.util.ArrayList;
import java.util.List;

public class FiguraGeometricaUtils {

	private List<FiguraGeometrica> figuraGeometricas;
	
	public FiguraGeometricaUtils() {
		figuraGeometricas = new ArrayList<>();
	}
	
	public void add(FiguraGeometrica figuraGeometrica) {
		figuraGeometricas.add(figuraGeometrica);
	}
	
	public void imprimirSomatorioDasAreas() {
		var somatorio = 0.0;
		for (var figuraGeometrica : figuraGeometricas) {
			somatorio += figuraGeometrica.getArea();
		}
		System.out.println(somatorio);
	}
}