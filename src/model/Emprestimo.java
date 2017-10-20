package model;

import java.time.LocalDate;

public class Emprestimo {
	private Livro livro;
	private Usuario usuario;
	private Bibliotecario bibliotecario;
	private LocalDate dataTetirada;
	private LocalDate dataDevolucao;
	
	public Emprestimo(Livro livro, Usuario usuario, Bibliotecario bibliotecario, LocalDate dataTetirada,
			LocalDate dataDevolucao) {
		super();
		this.livro = livro;
		this.usuario = usuario;
		this.bibliotecario = bibliotecario;
		this.dataTetirada = dataTetirada;
		this.dataDevolucao = dataDevolucao;
	}
	public Livro getLivro() {
		return livro;
	}
	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Bibliotecario getBibliotecario() {
		return bibliotecario;
	}
	public void setBibliotecario(Bibliotecario bibliotecario) {
		this.bibliotecario = bibliotecario;
	}
	public LocalDate getDataTetirada() {
		return dataTetirada;
	}
	public void setDataTetirada(LocalDate dataTetirada) {
		this.dataTetirada = dataTetirada;
	}
	public LocalDate getDataDevolucao() {
		return dataDevolucao;
	}
	public void setDataDevolucao(LocalDate dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

}
