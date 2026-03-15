package br.edu.fatecpg.tecprog.abstracao.model;

import java.time.LocalDate;

public class Aula {

	public String nomeAula;
	public String tipo;
	public String material;
	public LocalDate data;
	public String professor;

	public void lecionarAula() {
		System.out.println("Iniciando aula: " + this.nomeAula + "\nProfessor: " + this.professor + "\nTipo: "
				+ this.tipo + "\nData: " + this.data);
	}

	public void atualizarConteudo() {
		System.out.println("Atualizando material da aula: " + this.nomeAula + "\nNovo material: " + this.material);
	}

	public void registrarPresenca() {
		System.out.println(
				"Registrando presença dos alunos na aula: " + this.nomeAula + "\nProfessor: " + this.professor);
	}
}