package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class BDSimulado {
	// atributos
	private ArrayList<Livro> livros = new ArrayList<Livro>();
	private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	private ArrayList<Bibliotecario> bibliotecarios = new ArrayList<Bibliotecario>();
	private ArrayList<Emprestimo> emprestimos = new ArrayList<Emprestimo>();
	
	public BDSimulado() {
		//Criando Livros
		Livro l1 = new Livro("Livro 1", "Autor1", "Editora A", "2012", "666");
		Livro l2 = new Livro("Livro 2", "Autor2", "Editora B", "2015", "333");
		Livro l3 = new Livro("Livro 3", "Autor3", "Editora 3", "2009", "456");
		//adicionando livros
		this.livros.add(l1);
		this.livros.add(l2);
		this.livros.add(l3);
		//criando usuarios
		Usuario u1 = new Usuario("Paulo Maciel", "12345000", "Fisioterapia");
		Usuario u2 = new Usuario("Dedeco Culhão", "17456614", "Agronômia");
		Usuario u3 = new Usuario("Astolfo Aguiar", "174284542", "Biologia");
		//adicionando usuarios
		this.usuarios.add(u1);
		this.usuarios.add(u2);
		this.usuarios.add(u3);
		//criando bibiliotecario
		Bibliotecario b1 = new Bibliotecario("Doidera", "45000");
		Bibliotecario b2 = new Bibliotecario("Ganha em Cima", "642000");
		//adicionando bibliotecario
		this.bibliotecarios.add(b1);
		this.bibliotecarios.add(b2);
		//criando emprestimo
		Emprestimo e1 = new Emprestimo(l1, u1, b1, LocalDate.of(2017, 10, 14), LocalDate.of(2017, 10, 19));
		Emprestimo e2 = new Emprestimo(l2, u2, b2, LocalDate.of(2017, 10, 12), LocalDate.of(2017, 10, 17));
		Emprestimo e3 = new Emprestimo(l3, u3, b1, LocalDate.of(2017, 10, 19), LocalDate.of(2017, 10, 24));
		//adicionando emprestimo
		this.emprestimos.add(e1);
		this.emprestimos.add(e2);
		this.emprestimos.add(e3);
	}
	
	// recupera o arraylist de emprestimos
	public ArrayList<Emprestimo> geEmprestimos(){
		return this.emprestimos;
	}

}
