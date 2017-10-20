package view;

import java.util.ArrayList;

import model.Emprestimo;

public class ViewExibeEmprestimos {
	
	public ViewExibeEmprestimos(ArrayList<Emprestimo> emprestimos) {
		//exibir todos os emprestimos
		for (int i =0; i < emprestimos.size(); i++) {
			//imprimir no console
			System.out.println("--------------");
			System.out.println("Título: " + emprestimos.get(i).getLivro().getTitulo());
			System.out.println("Autor: " + emprestimos.get(i).getLivro().getAutor());
			System.out.println("Usuario "+ emprestimos.get(i).getUsuario().getNome());
			System.out.println("Data Retirada: "+ emprestimos.get(i).getDataTetirada());
			System.out.println("Data Devolução: "+ emprestimos.get(i).getDataDevolucao());
			
		}
	}

}
