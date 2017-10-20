package control;

import java.util.ArrayList;

import model.BDSimulado;
import model.Emprestimo;

public class ControleExibeEmprestimos {
	
	public ControleExibeEmprestimos(){
		BDSimulado bds = new BDSimulado();
		
		//recuperar todos os emprestimos
		ArrayList<Emprestimo> emprestimo = bds.geEmprestimos();
		
		// exibir todos os emprestimos
		
		
		
		
		
	}

}
