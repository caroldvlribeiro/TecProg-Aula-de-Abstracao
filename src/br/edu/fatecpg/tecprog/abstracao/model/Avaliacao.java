package br.edu.fatecpg.tecprog.abstracao.model;

import java.time.LocalDate;

public class Avaliacao {

	public String nome;
	public LocalDate data;
	public String local;
	public double notaMaxima;
	public String disciplina;

	public void aplicar() {
		System.out.println("Aplicando avaliação: " + this.nome + "\nDisciplina: " + this.disciplina + "\nData: "
				+ this.data + "\nLocal: " + this.local);
	}

	public void corrigir() {
		System.out.println("Corrigindo avaliação: " + this.nome + "\nNota máxima: " + this.notaMaxima);
	}

	public void divulgarResultado() {
		System.out.println("Divulgando resultados da avaliação: " + this.nome + "\nDisciplina: " + this.disciplina);
	}
}