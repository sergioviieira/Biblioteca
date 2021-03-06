package model;

public class Livro {
	//atributos
	private String titulo;
	private String autor;
	private String editora;
	private String anoLanšamento;
	private String ISBN;
	public Livro(String titulo, String autor, String editora, String anoLanšamento, String iSBN) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.anoLanšamento = anoLanšamento;
		ISBN = iSBN;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public String getAnoLanšamento() {
		return anoLanšamento;
	}
	public void setAnoLanšamento(String anoLanšamento) {
		this.anoLanšamento = anoLanšamento;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

}
