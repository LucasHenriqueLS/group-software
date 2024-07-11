package br.com.exercicio03;

import java.util.function.Function;
import java.util.function.Predicate;

public class Lista<T> {

	private T[] elementos;
	
	private int indiceAtual;
	
	@SuppressWarnings("unchecked")
	public Lista() {
		this.elementos = (T[]) new Object[10];
		this.indiceAtual = 0;
	}

	public void add(T elemento) {
		if (indiceAtual < elementos.length) {
			elementos[indiceAtual] = elemento;
			indiceAtual++;
		} else {
			aumentarLista();
		}
	}

	@SuppressWarnings("unchecked")
	private void aumentarLista() {
		T[] elementos = (T[]) new Object[this.elementos.length * 2];
		for (int i = 0; i < this.elementos.length; i++) {
		    elementos[i] = this.elementos[i];
		}
		this.elementos = elementos;
	}

	public void reverse() {
		for (int i = 0; i < indiceAtual / 2; i++) {
			swap(i, indiceAtual - 1 - i);
		}
	}
	
	private void swap(int i, int j) {
		T temp = elementos[i];
		elementos[i] = elementos[j];
		elementos[j] = temp;
	}
	
	public Lista<T> filter(Predicate<T> predicado) {
        var elementos = new Lista<T>();
        for (int i = 0; i < indiceAtual; i++) {
            if (predicado.test(this.elementos[i])) {
                elementos.add(this.elementos[i]);
            }
        }
        return elementos;
    }
	
	public <R> Lista<R> map(Function<T, R> funcao) {
		var elementos = new Lista<R>();
        for (int i = 0; i < indiceAtual; i++) {
            elementos.add(funcao.apply(this.elementos[i]));
        }
        return elementos;
    }

	@Override
	public String toString() {
		var str = "[";
		for (int i = 0; i < indiceAtual - 1; i++) {
			str += String.format("%s, ", elementos[i]);
		}
		str += String.format("%s]", elementos[indiceAtual - 1]);
		return str;
	}
}