package oo.encapsulamento;

public class Pessoa {

	private String nome;
	private String sobrenome;
	private int idade;

	public Pessoa(String nome, String sobrenome, int idade) {
		setNome(nome);
		setSobreNome(sobrenome);
		setIdade(idade);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobreNome() {
		return sobrenome;
	}
	public void setSobreNome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getNomeCompleto() {
		return getNome() + " " + getSobreNome();
	}
	// Getter
	public int getIdade() {
		return idade;
	}

	// Setter
	public void setIdade(int novaIdade) {
		novaIdade = Math.abs(novaIdade);
		if (novaIdade >= 0 && novaIdade <= 120) {
			this.idade = novaIdade;
		}
	}

	@Override
	public String toString() {
		return "Ol� eu sou o " + getNome() + " e tenho: " + getIdade() + " anos.";
	}
}
