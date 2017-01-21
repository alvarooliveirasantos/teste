package br.indra.alvaro;

public class Usuarios {
	private String nome;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	private String  endereco;



public void cadastrar(String nome, String endereco){
	System.out.print("cadastrado com sucesso");
	
}
}
