package model;

public abstract class Animal {

	private Integer codigo;
	private String nome;
	private String cor;
	private String som;
	private int patas;

	public Animal() {
	}

	public Animal(Integer codigo, String nome, String cor, int patas, String som) {
		this.codigo = codigo;
		this.nome = nome;
		this.cor = cor;
		this.patas = patas;
		this.som = som;
	}
	
	@Override
	public String toString() {
		return "Nome: " + this.nome + "\nCor: " + this.cor + "\nQuantidade de patas: " + this.patas + "\nSom: " + this.som;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}
}
