package control;

public class Livro {
	//atributos
	private String titulo;
	private String autor;
	private String editora;
	private String anoLançamento;
	private String ISBN;
	public Livro(String titulo, String autor, String editora, String anoLançamento, String iSBN) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.anoLançamento = anoLançamento;
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
	public String getAnoLançamento() {
		return anoLançamento;
	}
	public void setAnoLançamento(String anoLançamento) {
		this.anoLançamento = anoLançamento;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

}
