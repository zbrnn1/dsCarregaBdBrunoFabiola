package carregabanco.view;

import java.util.ArrayList;

import carregabanco.controller.CarregaBancoController;
import carregabanco.model.PessoaModel;

public class CarregaBancoView {
	public CarregaBancoView() {
		ArrayList<PessoaModel> valores = new CarregaBancoController().loader("alunostads.csv");
		System.out.println(valores.size());
		
		for(PessoaModel n: valores)
			System.out.println(n.getCampus() + " - " + n.getNomePessoa());
		
	}
}
