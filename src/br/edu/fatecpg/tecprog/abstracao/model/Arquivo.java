package br.edu.fatecpg.tecprog.abstracao.model;

public class Arquivo {

	public String nomeArquivo;
	public String tipoArquivo;
	public double tamanho;
	public String descricao;
	public String proprietario;

	public void visualizar() {
		System.out.println("Visualizando arquivo: " + this.nomeArquivo + "\nTipo: " + this.tipoArquivo + "\nDescrição: "
				+ this.descricao);
	}

	public void editar() {
		System.out.println("Editando arquivo: " + this.nomeArquivo + "\nProprietário: " + this.proprietario);
	}

	public void compartilhar() {
		System.out.println("Compartilhando arquivo: " + this.nomeArquivo + "\nProprietário: " + this.proprietario);
	}
}