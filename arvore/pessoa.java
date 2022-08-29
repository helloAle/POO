package arvore;

public class pessoa {
	String nome;
	int idade;
	String pai;
	String mae;
	public pessoa(String nome, int idade, String pai, String mae) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.pai = pai;
		this.mae = mae;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getPai() {
		return pai;
	}
	public void setPai(String pai) {
		this.pai = pai;
	}
	public String getMae() {
		return mae;
	}
	public void setMae(String mae) {
		this.mae = mae;
	}

}
