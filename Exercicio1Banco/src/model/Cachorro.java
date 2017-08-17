package model;

public class Cachorro extends Animal {

	public Cachorro(Integer codigo, String nome, String cor, int patas) {
		super(codigo, nome, cor, patas, "AuAu");
	}
	
	public Cachorro(Integer codigo, String nome, String cor, int patas, String som) {
		super(codigo, nome, cor, patas, "AuAu");
	}

	public Cachorro(String nome, String cor, int patas) {
		super(nome, cor, patas);
	}
}
