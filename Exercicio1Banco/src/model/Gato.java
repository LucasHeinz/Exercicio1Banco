package model;

public class Gato extends Animal {

	public Gato(Integer codigo, String nome, String cor, int patas) {
		super(codigo, nome, cor, patas, "Miau");
	}

	public Gato(Integer codigo, String nome, String cor, int patas, String som) {
		super(codigo, nome, cor, patas, som);
	}
	
	public Gato(String nome, String cor, int patas) {
		super(nome, cor, patas);
	}
}
