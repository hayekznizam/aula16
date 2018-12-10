package br.com.db1start.aula11;

import java.util.Date;
import java.util.List;

public class Pessoa {
	// ctrl 3 generate getters
	private String nome;
	private Date dataNascimento;
	private Double peso;

	private List<Endereco> enderecos;

	public void setNome(String valor) {

		this.nome = valor;

	}

	public String getNome() {

		return nome;
	}

	public void setdataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Date getdataNascimento() {
		return dataNascimento;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Double getPeso() {
		return peso;
	}

}
