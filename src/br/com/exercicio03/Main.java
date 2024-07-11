package br.com.exercicio03;

public class Main {

	/*
	 * Carlos, eu precisei olhar na internet como receber predicados e funções no parâmetro
	 * para implementar os métodos de filter() e map(), de cabeça, eu não sabia como utilizá-los.
	 */
	public static void main(String[] args) {
		var lista = new Lista<Integer>();
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(5);
		lista.add(6);
		lista.add(7);
		lista.add(8);
		System.out.println(lista);
		lista.reverse();
		System.out.println(lista);
		System.out.println(lista.filter(x -> x % 2 == 0));
		
		lista.add(9);
		lista.add(10);
		lista.add(11);
		lista.add(12);
		lista.add(13);
		lista.add(14);
		lista.add(15);
		lista.add(16);
		System.out.println(lista);
		lista.reverse();
		System.out.println(lista);
		System.out.println(lista.filter(x -> x % 2 == 0));
		
		System.out.println(lista.map(x -> x * x));
		
		var lista2 = new Lista<String>();
		lista2.add("a");
		lista2.add("b");
		lista2.add("c");
		lista2.add("d");
		System.out.println(lista2.map(x -> x.toUpperCase()));
	}
}